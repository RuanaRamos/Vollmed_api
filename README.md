<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/d0016633-8187-444f-b22a-8430451cc7e8" />

Vollmed API 🏥💻

REST-API zur Verwaltung einer medizinischen Klinik – Ärzte anlegen, listen, aktualisieren und (soft) löschen.
Tech-Stack: Java • Spring Boot • Spring Data JPA • MySQL • Flyway • Bean Validation

✨ Features

✅ CRUD für Ärzte (Medicos)

✅ Validierung der Eingaben mit Bean Validation (@Valid)

✅ Paginierung & Sortierung mit Pageable

✅ Soft Delete über Feld ativo (nur aktive Einträge werden gelistet)

✅ Datenbank-Migrations mit Flyway (Versionierung des Schemas)

🧱 Tech Stack

Java

Spring Boot

Spring Web

Spring Data JPA / Hibernate

MySQL

Flyway

Jakarta Bean Validation

📌 Endpoints (Beispiele)
✅ Create – Arzt anlegen

POST /medicos

{
  "nome": "Lena Schneider",
  "telefone": "015123456789",
  "email": "lena.schneider@voll.med",
  "crm": "234567",
  "especialidade": "CARDIOLOGIA",
  "endereco": {
    "logradouro": "Hauptstraße",
    "bairro": "Altstadt",
    "cep": "99084",
    "cidade": "Erfurt",
    "uf": "TH",
    "numero": "12",
    "complemento": "2. OG"
  }
}

📄 Read – Liste (mit Pagination & Sortierung)

GET /medicos?page=0&size=10&sort=nome

✏️ Update – Daten aktualisieren

PUT /medicos

(Beispiel: abhängig von deinem DTO DadosAtualizacaoMedicos)

🗑️ Delete – Soft Delete

DELETE /medicos/{id}
➡️ setzt intern ativo = false statt Datensatz wirklich zu löschen.

🗄️ Datenbank & Flyway

Die Datenbankstruktur wird über Flyway-Migrations in
src/main/resources/db/migration/ versioniert.

Beispiel:

V1__create_table_medicos.sql

V2__add_telefone_to_medicos.sql

V3__add_ativo_to_medicos.sql

▶️ Projekt lokal starten
Voraussetzungen

Java (JDK)

MySQL

Maven

Konfiguration (application.properties)

Beispiel:

spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=root
spring.datasource.password=DEIN_PASSWORT

spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true

Start
mvn spring-boot:run

📌 Warum dieses Projekt?

Dieses Projekt ist ein Backend-Portfolio-Projekt mit Fokus auf:

saubere REST-Struktur

persistente Daten mit JPA

schema-sichere Weiterentwicklung per Flyway

Validierung & stabile Datenflüsse

👩‍💻 Autorin

Ruana Ramos Barbosa
GitHub: github.com/RuanaRamos
