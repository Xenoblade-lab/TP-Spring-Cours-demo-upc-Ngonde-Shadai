CREATE DATABASE IF NOT EXISTS tp_spring_cours
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE tp_spring_cours;

CREATE TABLE IF NOT EXISTS cours (
    id INT AUTO_INCREMENT PRIMARY KEY,
    intitule VARCHAR(255) NOT NULL,
    enseignant VARCHAR(255) NOT NULL,
    salle VARCHAR(50) NOT NULL
);

INSERT INTO cours (intitule, enseignant, salle) VALUES
('Programmation Java', 'M. Kabongo', 'A12'),
('Bases de données', 'Mme Ilunga', 'B05'),
('Spring Boot', 'M. Ntumba', 'Labo3'),
('Algorithmique', 'M. Mbuyi', 'C21'),
('Réseaux informatiques', 'Mme Tshisekedi', 'D08');
