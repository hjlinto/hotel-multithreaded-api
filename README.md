# 🏨 Landon Hotel Scheduling App – Multithreaded Back-End with Docker Deployment

This is a modified version of the Landon Hotel scheduling application that includes multithreaded functionality, localization, currency formatting, time zone conversion, and full Docker containerization. The project features a Java Spring Boot back end and an Angular front end, designed to simulate international hotel reservations with real-world deployment architecture.

---

## Features

- Multithreaded bilingual welcome message rendering
- Time zone conversion for global live event scheduling
- Currency display for reservations in USD, CAD, and EUR
- Fully containerized Spring Boot application using Docker
- GitLab-hosted version control with clear commit documentation

---

## Developer Contributions

This project was extended from a provided base application and enhanced to include:

- English and French localization using Java `ResourceBundle`
- Multi-threading implementation for dual-language message output
- Angular front-end update to display prices in three currencies
- Time zone conversion method and message for global live presentation
- Custom Dockerfile creation and container testing

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Angular**
- **Docker**
- **Maven**
- **ResourceBundle / Multithreading**
- **ZoneId / ZonedDateTime**
- **GitLab**

---

## 📂 Project Structure

```
.
├── Dockerfile                      # Docker container configuration
├── pom.xml                         # Maven dependencies
├── README.md                       # Project overview
├── src/
│   ├── main/
│   │   ├── java/edu/wgu/d387_sample_code/
│   │   │   ├── config/             # App configuration classes
│   │   │   ├── controller/         # REST controllers for messages and time zones
│   │   │   ├── convertor/          # Entity and DTO converters
│   │   │   ├── entity/             # Reservation and room entities
│   │   │   ├── localization/       # MessageFetcher for resource bundle access
│   │   │   ├── model/              # Request/response models and HATEOAS links
│   │   │   ├── repository/         # JPA repositories
│   │   │   ├── rest/               # API resource constants and router
│   │   │   └── timezones/          # Time zone conversion logic
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── messages_english.properties
│   │       └── messages_french.properties
│   └── test/java/edu/wgu/d387_sample_code/
│       └── D387SampleCodeApplicationTests.java
├── frontend/                       # Angular front-end (unmodified)
```

---

## ▶️ Usage Instructions

### 🔧 Prerequisites

- Java 17+
- Maven
- Docker
- Node.js / Angular CLI (for local front-end testing)

### 🛠️ Run Application (Without Docker)

1. Clone the project:
```bash
git clone https://github.com/hjlinto/hotel-multithreaded-api.git
```
2. Run the back end:
```bash
./mvnw spring-boot:run
```
3. Run the Angular front end:
```bash
cd front end
npm install
ng serve
```
4. Build and Run with Docker
```bash
docker build -t landon-hotel-app .
docker run --name projectname -p 8080:8080 landon-hotel-app
```
5. Deploy to a Cloud service

---

## Reflections
- In a future iteration, I would improve internalization by dynamically loading language preferences based on the user's browsers settings. This would enhance accessibility, ensuring a the UX for multilingual users.

---

## Author
Created by: Hunter J Linton



