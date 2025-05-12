

# 🚀 Java-CDI (Contexts and Dependency Injection)

### Overview

This is a modular Java EE 10 application demonstrating the use of **CDI (Contexts and Dependency Injection)**, **EJB (Enterprise JavaBeans)**, and **Servlets** using Jakarta EE.

---

## 🧩 Modules

### 1. CDIModule (`CDIModule`)
- Contains EJBs and CDI logic
- Handles app settings and user registration logic
- Uses annotations to trigger email and SMS notifications

**Key Classes:**
- `Appsetting`: Returns app name and version
- `UserRegistration`: Registers a user and fires notifications
- `EmailNotification` and `SMSNotification`: Listens for `User` events
- Custom annotations: `@SendEmail`, `@SendSMS`

### 2. WebModule (`WebModule`)
- A Jakarta EE web app packaged as `.war`
- Contains servlet (`CDITest`) that injects and uses EJBs from `CDIModule`
- Calls backend methods to test user registration and display app settings

## 🚀 Technologies Used
- Java 11
- Jakarta EE 10
- Maven
- EJB (Stateless)
- CDI
- Servlet API
- GlassFish (or other Jakarta EE compatible app servers)

## 💡 How It Works

1. Deploy both modules in your Jakarta EE server (e.g., GlassFish).
2. Access the servlet at:  
```

[http://localhost:8080/WebModule/cdi-test](http://localhost:8080/WebModule/cdi-test)

```
3. It will:
- Display the application name and version
- Register a user (firing CDI events)
- Trigger `EmailNotification` and `SMSNotification` beans

## 📁 Project Structure

```

Java-CDI/
├── CDIModule/       # EJB Module
├── WebModule/       # Web Layer using Servlets
└── README.md

```

## 🤝 Contributing

Feel free to fork the repository and enhance the functionality or structure!

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙋‍♂️ Author

**Chamika Indudunu Gayashan**
GitHub: [@chamikathereal](https://github.com/chamikathereal)



