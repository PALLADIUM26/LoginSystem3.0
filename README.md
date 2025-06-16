# 🔏 LoginSystem 3.0

**LoginSystem3.0** is a full-featured **JavaFX desktop application** built using **Apache NetBeans**. It combines a secure registration & login system with multiple post-login utilities — including a number system converter, ML-powered emotion detection & English-to-Bengali translation. It connects to a **MySQL** database to securely store user credentials and demonstrates key concepts in **GUI** design, authentication logic, and database integration using **JDBC**.

---

## ✨ Features

### 🔐 Sign In / Sign Up
* 🧾 **New User Registration** with a unique username and password
* 🪪 **Login Authentication**
* ❗ Error messages for:
   - Invalid username or password
   - Duplicate usernames on registration
   - Empty input fields
   - Forgot password handling
* 🪟 **Swing-based GUI**
* 💽 User credentials securely stored and retrieved from **MySQL**
* ⚙️ Clean and interactive **JavaFX** forms for both login and registration
* 📨 The OTP verification is done by **SMTP**

### 🏠 Post-Login Functionalities

#### 🧭 Dashboard & Navigation
* 💻 Personalized Dashboard screen after login
* 🥳 Displays welcome message with logged-in user's name
* 🗿 Logout button to return to the login page
* 👓 Responsive JavaFX UI designed in Apache NetBeans
* 🤖 **Admin Panel** (implementation of **CRUD** is under progress)

#### 🔢 Number System Converter
* ➡️ Convert between **Decimal, Binary, Octal, and Hexadecimal**
* #️⃣ Simple and intuitive JavaFX interface
* 🧩 Real-time conversion with input validation

#### 🧠 Emotion Detection from Images
* 🖼️ Upload an image
* 🔎 Detects the **facial emotion** using a trained **CNN model from Keras** (Deep Learning)
* 😑 Displays emotion label (e.g., happy, sad, angry)
* 🧩 Implemented in Python; integrated via **ProcessBuilder**

#### 🌐 English to Bengali Translator
* ⌨️ Type any English sentence
* ➡️ Translates to Bengali using a **Transformer-based NLP model (Bert)**
* 🧩 Seamless UI interaction between JavaFX and Python via **ProcessBuilder**

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
* Language: **Java, Python**
* GUI Framework: **JavaFX**
* IDE: **Apache NetBeans**
* Database: **MySQL**
* Database Access: **JDBC**
* Build/Run: **Apache NetBeans Project**
* ML/NLP Integration: **Python scripts with OpenCV & Transformers**

---

## 🎨 ML/NLP Models Used

| Feature                 | Tech Stack                                         |
| ----------------------- | -------------------------------------------------- |
| Number System Converter | Java (custom logic)                                |
| Emotion Detection       | Python + OpenCV + Keras CNN Model (Sequencial)     |
| EN → BN Translator      | Hugging Face Transformers (Bert)                   |

---

## ✅ Setup Instructions

### 🔧 Prerequisites

* Java JDK 22+
* Apache Netbeans IDE 22+ (for building)
* MySQL Server
* MySQL JDBC Driver
* Python 3.x with:
   * `transformers`
   * `opencv-python`
   * `keras`

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

3. Add your DB & Email secret keys in the environment variables
   ```
   email_sender=your_email_id
   appPassword=your_gmail_app_password
   MySQL_password=your_MySQL_workbench/CLI_password 
   ```
4. Python Setup
   ```
   pip isntall keras
   pip install openCV
   ```
4. 🖥️ **Run the Application**
   * Open the project in Apache NetBeans
   * Right-click the project folder > Run
   * JavaFX login window will appear
   * Register a user or login using existing credentials
   * Navigate through the JavaFX UI

   > Alternatively, you can run `Main.java` directly from your preferred IDE like IntelliJ or VS Code.

---

## 📸 Demo

> * Login Screen
> * Dashboard
> * Number System page
> * Emotion Detection result


---

## 🚀 Future Enhancements

* 🗃️ Add password hashing (SHA-256 or BCrypt)
* 👤 Session Management
* 🧪 Unit tests for authentication logic

---

## 🔗 URLs for Libraries (.jar files)
- [javax.activation.jar](https://github.com/javaee/activation/releases)
- [mysql-connector-j-8.3.0.jar](https://dbschema.com/jdbc-driver/mysql.html)
- [javax.mail.jar](https://javaee.github.io/javamail/#Download_JavaMail_Release)

---

## 🤝 Contributing
Feel free to fork this repository and submit pull requests. Any contributions are welcome!

---

## 🙋‍♂️ Author

Made with ☕ by [@PALLADIUM26](https://github.com/PALLADIUM26)

