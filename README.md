<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/d0016633-8187-444f-b22a-8430451cc7e8" />

# Vollmed API 🏥

**REST-API zur Verwaltung von Ärzten (Medicos)**  
**Java • Spring Boot • Spring Data JPA • MySQL • Flyway • Bean Validation**

---

## **🚀 Features**
- **CRUD** für Ärzte
- **Validierung** mit `@Valid` (Bean Validation)
- **Paginierung & Sortierung** mit `Pageable`
- **Soft Delete** über `ativo` (nur aktive Ärzte werden gelistet)
- **Flyway Migrations** zur Versionsverwaltung der DB

---

## **🧰 Tech Stack**
- **Java**
- **Spring Boot (Web)**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Flyway**
- **Jakarta Validation**

---

## **📌 Endpoints**
- **POST** `/medicos` → Arzt anlegen  
- **GET** `/medicos` → Liste (Paging/Sorting)  
- **PUT** `/medicos` → Arzt aktualisieren  
- **DELETE** `/medicos/{id}` → Soft Delete (`ativo = false`)

---

## **🗄️ Flyway**
Migrations: `src/main/resources/db/migration/`  
Beispiel:
- `V1__create_table_medicos.sql`
- `V2__add_telefone_to_medicos.sql`
- `V3__add_ativo_to_medicos.sql`

---

## **▶️ Start (lokal)**
**MySQL** starten → DB: **`vollmed_api`**  
`application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=root
spring.datasource.password=DEIN_PASSWORT

spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true



