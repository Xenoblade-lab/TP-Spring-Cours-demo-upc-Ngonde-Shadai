package com.upc.cours.acces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upc.cours.entite.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
