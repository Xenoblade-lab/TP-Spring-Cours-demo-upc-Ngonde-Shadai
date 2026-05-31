package com.upc.cours.acces;

import java.util.List;

import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.simpleflatmapper.jdbc.spring.ResultSetExtractorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.upc.cours.entite.Cours;

@Repository
public class CoursAccesJdbc implements CoursAcces {

	@Autowired
	private JdbcClient jdbcClient;

	private static final ResultSetExtractorImpl<Cours> EXTRACTEUR = JdbcTemplateMapperFactory.newInstance()
			.addKeys("id")
			.ignorePropertyNotFound()
			.newResultSetExtractor(Cours.class);

	@Override
	public List<Cours> rechercher(String recherche) {
		String sql;
		Object[] params;

		if (StringUtils.hasText(recherche)) {
			sql = "SELECT * FROM cours WHERE ("
					+ "intitule LIKE ? OR enseignant LIKE ? OR salle LIKE ?"
					+ ") ORDER BY intitule";

			String motif = "%".concat(recherche).concat("%");
			params = new Object[] { motif, motif, motif };
		} else {
			sql = "SELECT * FROM cours ORDER BY intitule";
			params = new Object[] {};
		}

		return jdbcClient.sql(sql).params(params).query(EXTRACTEUR);
	}

}
