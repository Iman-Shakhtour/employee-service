# 📘 Swagger API Documentation – Project Name

This project uses **Swagger UI** to document and interact with the RESTful API for `Project Name`. Swagger allows developers and clients to explore endpoints and test them directly from the browser.

## 📌 Features

- 📚 Full OpenAPI (Swagger) documentation
- 🧪 Interactive testing of API endpoints
- 🔐 JWT-based secured routes (optional)
- 🛠️ Easily extendable and customizable

## 🚀 How to Run Swagger UI

1. **Open the Swagger Editor:**
   👉 https://editor.swagger.io/

2. **Run Swagger UI locally (if needed):**
   ```bash
   git clone https://github.com/swagger-api/swagger-ui.git
   cd swagger-ui
   npm install
   npm start
   ```

3. **Serve your API spec (YAML/JSON):**
   ```
   http://localhost:8080/?url=https://example.com/swagger.yaml
   ```

## 📄 API Documentation File (Swagger Spec)

- Located at: `swagger.yaml` or `swagger.json`
- Format: [OpenAPI 3.0 Specification](https://swagger.io/specification/)

## 🧰 Tools Used

- Swagger UI
- Swagger Editor
- OpenAPI 3.0
- Node.js (for local server)
- Express/Spring Boot/etc. (your backend)

## 📂 Project Structure

```
.
├── swagger.yaml
├── public/
│   └── index.html
├── src/
│   └── main code files
└── README.md
```

## ✅ Sample Endpoint

```http
GET /api/courses
Response:
200 OK
[
  {
    "id": 1,
    "title": "Intro to Swagger",
    "description": "Learn how to document APIs"
  }
]
```

