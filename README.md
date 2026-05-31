# Cours-demo-upc — TP Spring (sujet Cours)

Projet de référence pour **comparer** avec le démo du professeur (`demo-upc-252601` à la racine du repo).

> **Attention** : ceci est une **solution de travail / comparaison**. Pour le rendu au prof, recode ton propre projet **sans copier-coller** ce dossier.

---

## Lancer le projet

### 1. Base MySQL

```powershell
& "C:\laragon\bin\mysql\mysql-8.0.30-winx64\bin\mysql.exe" -u root -P 3306 -e "SOURCE C:/laragon/www/demo-upc-252601/Tp Spring/Cours-demo-upc/sql/init.sql"
```

Ou exécuter `sql/init.sql` dans HeidiSQL.

### 2. Application

```powershell
cd "C:\laragon\www\demo-upc-252601\Tp Spring\Cours-demo-upc"
.\mvnw.cmd spring-boot:run
```

Port **8081** (pour ne pas entrer en conflit avec le démo prof sur 8080).

---

## URLs de test

| Test | URL |
|------|-----|
| Liste HTML | http://localhost:8081/formation/cours |
| Recherche HTML | http://localhost:8081/formation/cours?recherche=Java |
| API JSON | http://localhost:8081/api/formation/cours |
| API filtrée | http://localhost:8081/api/formation/cours?recherche=Ilunga |

---

## Comparaison prof vs ce TP

| | Prof (`demo-upc-252601`) | Ce projet (`Cours-demo-upc`) |
|--|--------------------------|------------------------------|
| **Package** | `edu.upc` | `com.upc.cours` |
| **Entité** | `Student` | `Cours` |
| **Champs** | nom, postnom, prenom | intitule, enseignant, salle |
| **Couche web** | `controllers/` | `web/` |
| **Couche métier** | `services/` | `metier/` |
| **Couche données** | `repositories/` | `acces/` |
| **Modèle** | `models/` | `entite/` |
| **Page web** | `/demo/get/name?keyword=` | `/formation/cours?recherche=` |
| **API** | `/api/demo/get/name` | `/api/formation/cours` |
| **Template** | `index.html` | `liste-cours.html` |
| **Base MySQL** | `demo_lmd_2526` | `tp_spring_cours` |
| **Port** | 8080 | 8081 |

**Même logique** : Controller → Service → Repository JDBC → MySQL + Thymeleaf + REST.

---

## Cohérence avec la consigne du prof

| Exigence prof | Respectée ? |
|---------------|-------------|
| Reproduire le même exercice (liste + recherche) | Oui |
| Projet qui tourne sur la machine | Oui |
| Noms différents | Oui |
| Structure différente | Oui |
| Pas de copier-coller du repo expert | Oui (code réécrit, autre domaine) |

Voir aussi : [plan-travail-cours.md](../plan-travail-cours.md)
