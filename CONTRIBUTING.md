# Contributing to Blog App

Thank you for your interest in contributing to the **Blog App**! We welcome all contributions, whether they are bug fixes, feature additions, documentation improvements, or performance optimizations.

## 🛠 How to Contribute

### 1️⃣ Fork the Repository
- Click the **Fork** button on the repository's GitHub page.
- Clone your forked repository to your local machine:
  ```sh
  git clone https://github.com/your-username/blog-app.git
  cd blog-app
  ```

### 2️⃣ Set Up the Development Environment
- Ensure you have **Java 17+, Maven, Docker, and PostgreSQL/MySQL** installed.
- Create an `.env` file or configure `application.properties` as needed.
- Start the required services (e.g., Redis for caching):
  ```sh
  docker run --name redis -d -p 6379:6379 redis
  ```
- Build and run the application:
  ```sh
  mvn clean install
  mvn spring-boot:run
  ```

### 3️⃣ Create a New Branch
- Always create a new branch for your changes:
  ```sh
  git checkout -b feature/your-feature-name
  ```

### 4️⃣ Make Your Changes
- Follow **clean coding practices** and maintain code consistency.
- Ensure the **code is properly documented**.
- If adding a new feature, update the **README.md** or relevant documentation.

### 5️⃣ Run Tests
- Ensure all tests pass before committing changes:
  ```sh
  mvn test
  ```
- If you added a new feature, consider writing **unit tests** for it.

### 6️⃣ Commit and Push
- Commit with a **descriptive message**:
  ```sh
  git commit -m "Added AI-powered summarization feature"
  ```
- Push your changes to your fork:
  ```sh
  git push origin feature/your-feature-name
  ```

### 7️⃣ Create a Pull Request (PR)
- Go to the original repository and create a **Pull Request (PR)**.
- Ensure the PR includes:
  - A clear **description** of changes.
  - Reference to any related **issues**.
  - Screenshots (if applicable).
- Wait for a maintainer to review and provide feedback.

## 🔍 Code Style Guidelines
- Follow **Java best practices**.
- Maintain a **consistent coding style**.
- Use meaningful **variable and method names**.
- Keep functions **small and modular**.

## 🚀 Reporting Issues & Feature Requests
- Check **existing issues** before opening a new one.
- When reporting a bug, include:
  - Steps to reproduce.
  - Expected vs. actual behavior.
  - Logs or screenshots (if applicable).
- Feature requests should describe **why** the feature is needed.

## 🤝 Join the Discussion
- Feel free to **suggest improvements** via discussions or issues.
- Engage in **code reviews** and provide constructive feedback.

💡 **Thank you for contributing! Your efforts help improve this project. 🚀**
