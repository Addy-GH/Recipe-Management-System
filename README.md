# Recipe-Management-System

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Recipe Management System</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      margin: 20px;
      background-color: #f8f8f8;
      color: #333;
    }
    .container {
      max-width: 900px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    h1, h2, h3 {
      color: #444;
    }
    pre {
      background: #eee;
      padding: 10px;
      border-radius: 4px;
      overflow: auto;
    }
    code {
      background: #eee;
      padding: 2px 4px;
      border-radius: 3px;
    }
    ul {
      margin-left: 20px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Recipe Management System</h1>

    <h2>Overview</h2>
    <p>
      Recipe Management System is a Java console-based application designed to manage recipes and categories efficiently. 
      The application supports full CRUD operations on recipes and categories using a modular design that leverages DAO and controller patterns.
      It uses JDBC for database connectivity and MySQL as its data storage solution.
    </p>

    <h2>Features</h2>
    <ul>
      <li><strong>Recipe Management</strong>: Add, view, update, delete, and search recipes.</li>
      <li><strong>Category Management</strong>: Add, view, update, and delete recipe categories.</li>
      <li><strong>Modular Architecture</strong>: Clean separation of concerns using DAO and controller patterns.</li>
      <li><strong>Console Interface</strong>: Interactive, menu-driven system for managing data.</li>
    </ul>

    <h2>Technologies</h2>
    <ul>
      <li><strong>Programming Language</strong>: Java</li>
      <li><strong>Database</strong>: MySQL</li>
      <li><strong>Database Connectivity</strong>: JDBC</li>
      <li><strong>Development Tools</strong>: IntelliJ IDEA, Eclipse, Git, GitHub</li>
    </ul>

    <h2>Project Structure</h2>
    <pre>
RecipeManagementSystem/
├── src/
│   └── com/
│       └── recipe/
│           ├── model/
│           │   ├── Recipe.java
│           │   └── Category.java
│           ├── dao/
│           │   ├── RecipeDAO.java
│           │   └── CategoryDAO.java
│           ├── controller/
│           │   ├── RecipeController.java
│           │   └── CategoryController.java
│           ├── util/
│           │   └── DBConnection.java
│           └── main/
│               ├── RecipeManagementSystem.java
│               └── CategoryManagementSystem.java
└── README.html
    </pre>

    <h2>Setup Instructions</h2>
    <h3>1. Database Setup</h3>
    <p>
      Log into your MySQL client and run the following commands:
    </p>
    <pre>
CREATE DATABASE recipe_management;
USE recipe_management;

CREATE TABLE categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE recipes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100),
    ingredients TEXT,
    instructions TEXT
);
    </pre>
    <h3>(Optional) Insert Sample Data</h3>
    <pre>
INSERT INTO categories (name) VALUES ('Appetizers'), ('Main Course'), ('Desserts');

INSERT INTO recipes (name, category, ingredients, instructions)
VALUES 
('Pasta Alfredo', 'Main Course', 'Pasta, Cream, Garlic, Parmesan', 'Boil pasta; simmer cream and garlic; mix in parmesan.'),
('Chocolate Cake', 'Desserts', 'Flour, Sugar, Cocoa, Eggs, Butter', 'Mix ingredients; bake at 350°F for 30 minutes.');
    </pre>

    <h3>2. Project Setup</h3>
    <ul>
      <li><strong>Clone the Repository</strong>: Use <code>git clone</code> to clone the project.</li>
      <li><strong>Open in IDE</strong>: Open the project in IntelliJ IDEA or Eclipse.</li>
      <li><strong>Configure JDBC Driver</strong>: Ensure the MySQL JDBC driver is added to your build path.</li>
      <li><strong>Update Database Credentials</strong>: In <code>DBConnection.java</code>, update the URL, username, and password if necessary.</li>
    </ul>

    <h3>3. Running the Application</h3>
    <ul>
      <li><strong>Recipe Management</strong>: Run <code>RecipeManagementSystem.java</code> to manage recipes.</li>
      <li><strong>Category Management</strong>: Run <code>CategoryManagementSystem.java</code> to manage categories.</li>
      <li>Follow the on-screen prompts to perform CRUD operations.</li>
    </ul>

    <h2>Future Enhancements</h2>
    <ul>
      <li>Develop a graphical user interface (GUI) for an enhanced user experience.</li>
      <li>Integrate RESTful APIs for remote access.</li>
      <li>Enhance search and filtering capabilities.</li>
    </ul>

    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>

    <h2>Contact</h2>
    <p>
      For questions or contributions, please contact [Your Email] or open an issue on GitHub.
    </p>
  </div>
</body>
</html>
