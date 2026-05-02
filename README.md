🚀 Team Task Manager (Full-Stack Java Application)

A powerful role-based project management web application built using Java Full Stack (Spring Boot + Frontend + SQL Database). This system enables teams to efficiently manage projects, assign tasks, and track progress in real time with secure authentication and structured role-based access control.

✨ Key Features
🔐 Authentication & Security
Secure Signup / Login system
Role-based access control:
Admin: Create projects, manage teams, assign tasks
Member: View assigned tasks, update status
📁 Project & Team Management
Create and manage multiple projects
Add and organize team members
Assign users to specific projects
✅ Task Management System
Create tasks under projects
Assign tasks to team members
Track task status:
🟡 Pending
🔵 In Progress
🟢 Completed
📊 Smart Dashboard
Overview of all projects and tasks
Task status analytics
Overdue task tracking
Personal task view for members
⚙️ Tech Stack
Backend
Java 17+
Spring Boot
Spring Security (JWT Authentication)
Spring Data JPA
Hibernate
Database
MySQL (or PostgreSQL)
Relational schema with proper entity relationships
Frontend
React.js / Thymeleaf (depending on implementation)
HTML, CSS, JavaScript
Axios / Fetch API
🧩 System Architecture
RESTful APIs for all operations
MVC layered architecture
DTO-based request/response handling
Secure authentication using JWT tokens
🗄️ Database Design

Core entities:

User (id, name, email, password, role)
Project (id, name, description, owner)
Task (id, title, status, dueDate, assignedUser, project)
Role (ADMIN / MEMBER)

Relationships:

One User → Many Projects
One Project → Many Tasks
One User → Many Assigned Tasks
🔒 Role-Based Access Control
Role	Permissions
ADMIN	Create/Edit/Delete projects, assign tasks, manage users
MEMBER	View assigned tasks, update task status
📡 REST API Overview
Authentication
POST /api/auth/signup
POST /api/auth/login
Projects
GET /api/projects
POST /api/projects
PUT /api/projects/{id}
DELETE /api/projects/{id}
Tasks
GET /api/tasks
POST /api/tasks
PUT /api/tasks/{id}
DELETE /api/tasks/{id}
Users
GET /api/users
🧪 Validation & Best Practices
Input validation using Bean Validation (Jakarta Validation)
Exception handling with global handlers
Secure password hashing (BCrypt)
Clean service-repository separation
