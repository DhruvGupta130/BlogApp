# 📌 Blog App with AI-Powered Summarization

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/OpenAI-412991?style=for-the-badge&logo=openai&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/REST%20API-02569B?style=for-the-badge&logo=rest-api&logoColor=white" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
</p>

## 📝 Overview
This is a **Spring Boot Blog Application** that allows users to create, read, update, and delete blog posts. It features an **AI-powered text summarization** using OpenAI's GPT API to generate concise summaries of blog content.

## 🎯 Features
✅ Create, read, update, and delete blogs  
✅ AI-powered blog summarization using OpenAI API  
✅ RESTful API with Spring Boot  
✅ PostgreSQL/MySQL database support  
✅ JWT-based authentication & authorization  
✅ Docker support for easy deployment  

## ⚙️ Tech Stack
| **Category**   | **Technologies Used** |
|---------------|----------------------|
| **Backend**   | Spring Boot, Java, Spring Security, Spring Data JPA |
| **Database**  | PostgreSQL / MySQL, Redis (caching) |
| **Authentication** | JWT (JSON Web Token) |
| **AI Integration** | OpenAI API |
| **DevOps**    | Docker, Postman, GitHub |
| **Architecture** | RESTful API |

## 🚀 Installation & Setup
### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/blog-app.git
cd blog-app
```

### 2️⃣ Set Up Environment Variables
Create an `.env` file and configure:
```properties
OPENAI_API_KEY=your_openai_api_key
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/blog_db
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=your_password
```

### 3️⃣ Build & Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

## 🎯 API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET`  | `/api/blogs` | Get all blogs |
| `POST` | `/api/blogs` | Create a new blog |
| `GET`  | `/api/blogs/{id}` | Get blog by ID |
| `PUT`  | `/api/blogs/{id}` | Update blog by ID |
| `DELETE` | `/api/blogs/{id}` | Delete blog by ID |
| `POST` | `/api/blogs/summarize` | Generate AI-powered blog summary |

## 📌 Usage Example
Request:
```json
{
  "title": "Understanding Spring Boot Caching",
  "author": "John Doe",
  "content": "Spring Boot provides built-in caching support to improve performance..."
}
```
Response:
```json
{
  "summary": "Spring Boot caching enhances performance by reducing redundant operations..."
}
```

## Contribution Guidelines 🤝
We welcome feedback and suggestions to help shape its direction. Contributions at this stage are focused on ideas and suggestions that could enhance the project's functionality. Please read the [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on how to get involved.
1. Fork the repository.
2. Make your changes.
3. Submit a pull request.

If you'd like to contribute, please follow these steps:

1. **Fork the Repository**: Click the "Fork" button at the top right of the repository page.
2. **Create a Feature Branch**: Use the command:
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Commit Your Changes**: Make your changes and commit them with clear messages.
   ```bash
   git commit -m "Add some feature"
   ```

4. **Push to the Branch**: Push your changes to your forked repository.
    ```bash
   git push origin feature/your-feature-name
    ```

5. **Open a Pull Request**: Go to the original repository and click "New Pull Request".

Your contributions will help enhance functionality, add new features, improve code quality, and fix bugs. Thank you for considering contributing!

## 📄 License
This project is licensed under the [MIT License](LICENSE.txt) .

## 💬 Contact
For questions or suggestions, feel free to reach out:
- **Email:** dhruvgupta130@gmail.com
- **LinkedIn:** [Dhruv Gupta](https://www.linkedin.com/in/dhruvgupta130)

---

🚀 Built with passion by Dhruv Gupta
