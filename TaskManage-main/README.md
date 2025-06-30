# 📋 Task Manager Application

## 📌 Overview
Task Manager is a simple web-based application built using Spring Boot and Thymeleaf that allows users to:
- Register/Login
- Create, edit, delete tasks
- View dashboard of tasks
- Manage deadlines and priorities

## ✅ Features
- User Registration and Login (Spring Security)
- Create, Update, Delete, and View Tasks
- Task status tracking: TODO, IN_PROGRESS, COMPLETED
- Dashboard to view all tasks
- Role-based authentication (USER, optionally ADMIN)
- HTML templates with Thymeleaf + Bootstrap
- Email reminder feature (optional)

## 🛠 Tech Stack
- *Backend*: Java 17+, Spring Boot, Spring Security, Spring Data JPA
- *Frontend*: Thymeleaf, HTML5, Bootstrap
- *Database*: MySQL (configurable)
- *Build Tool*: Maven

## 📁 Project Structure

taskmanager/
├── src/
│   ├── main/
│   │   ├── java/com/taskmanager/         # Java source code
│   │   │   ├── controllers/
│   │   │   ├── services/
│   │   │   ├── entities/
│   │   │   ├── repositories/
│   │   │   └── config/
│   │   ├── resources/
│   │   │   ├── templates/                # HTML files
│   │   │   ├── static/css/               # Stylesheets
│   │   │   └── application.properties    # App configuration
├── pom.xml                               # Maven file


## 🚀 Getting Started

### 1. Clone the Repository
bash
git clone https://github.com/Pranjalbiradar/taskmanage.git
cd taskmanage


### 2. Update Database Configuration (optional)
Edit src/main/resources/application.properties:
properties
# For H2 (default)
spring.datasource.url=jdbc:h2:mem:taskdb

# For MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/taskdata
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword


### 3. Build and Run
bash
mvn clean install
mvn spring-boot:run
App will be available at: http://localhost:9092/



