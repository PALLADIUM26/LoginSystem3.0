# 🔏 LoginSystem 3.0

LoginSystem3.0 is a desktop-based login and registration system built with **JavaFX** using **Apache NetBeans**. It connects to a **MySQL** database to securely store user credentials and demonstrates key concepts in **GUI** design, authentication logic, and database integration using **JDBC**.

---

## ✨ Features

### Sign In / Sign Up
* 🧾 **New User Registration** with a unique username and password
* 🔐 **Login Authentication**
* ❗ Error messages for:
   - Invalid username or password
   - Duplicate usernames on registration
   - Empty input fields
   - Forgot password handling
* 🪟 **Swing-based GUI**
* 💽 User credentials securely stored and retrieved from **MySQL**
* ⚙️ Clean and interactive **JavaFX** forms for both login and registration
* 📨 The OTP verification is done by **SMTP**

### Post-Login Functionalities
* 💻 Personalized Dashboard screen after login
* 🥳 Displays welcome message with logged-in user's name
* 🗿 Logout button to return to the login page
* 👓 Responsive JavaFX UI designed in Apache NetBeans
* 🧩 Integrations
   * Number System Conversion
   * Detect emotion from facial expression
   * Language translation
* 🤖 **Admin Panel** (implementation of **CRUD** is under progress)

---

## 📂 Project Structure

```
LoginSystem3.0/
   ├── nbproject/              # NetBeans project files
   ├── src/                    # Contains the Java source code files
   ├── .gitignore              # Specifies files and directories to be ignored by Git
   ├── README.md               # Project documentation
   ├── build.xml               # Ant build script
   └── manifest.mf             #
```
---

## 🧰 Tech Stack
* Language: Java, Python
* GUI Framework: JavaFX
* IDE: Apache NetBeans
* Database: MySQL
* Database Access: JDBC
* Build/Run: Apache NetBeans Project

---

## ✅ Setup Instructions

### 🔧 Prerequisites

* Java JDK 22+
* Apache Netbeans IDE 22+ (for building)
* MySQL Server
* MySQL JDBC Driver

### ▶️ Installation steps and Usage

1. 📦 **Clone the repository**

```bash
git clone https://github.com/PALLADIUM26/LoginSystem3.0.git
cd LoginSystem3.0
```

2. 🗃️ **Set Up MySQL Database**
   * Open MySQL client (Workbench / CLI)

   * Create database
   ```
   create database Sylvia;
   use Sylvia;
   ```

   * Create tables
   ```
   CREATE TABLE users (
    uname VARCHAR(50) PRIMARY KEY,
    email VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(20) NOT NULL
   );

   CREATE TABLE datavalues (
    input VARCHAR(50),
    b1 VARCHAR(2),
    b2 VARCHAR(2),
    output VARCHAR(50)
   );
   ```

   * Update your DB & Email secret keys in the environment variables
   ```
   email_sender=your_email_id
   appPassword=your_gmail_app_password
   MySQL_password=your_MySQL_workbench/CLI_password 
   ```

3. 🖥️ **Run the Application**
   * Open the project in Apache NetBeans
   * Right-click the project folder > Run
   * JavaFX login window will appear
   * Register a user or login using existing credentials
   * Start using

   > Alternatively, you can run `Main.java` directly from your preferred IDE like IntelliJ or VS Code.

---

## 🚀 Future Enhancements

* 🗃️ Add password hashing (SHA-256 or BCrypt)
* 👤 Session Management
* 🧪 Unit tests for authentication logic

---

## 📎 URLs for Libraries (.jar files)
- [javax.activation.jar](https://github.com/javaee/activation/releases)
- [mysql-connector-j-8.3.0.jar](https://dbschema.com/jdbc-driver/mysql.html)
- [javax.mail.jar](https://javaee.github.io/javamail/#Download_JavaMail_Release)

---

## 🤝 Contributing
Feel free to fork this repository and submit pull requests. Any contributions are welcome!

---

## 🙋‍♂️ Author

Made with ☕ by [@PALLADIUM26](https://github.com/PALLADIUM26)

