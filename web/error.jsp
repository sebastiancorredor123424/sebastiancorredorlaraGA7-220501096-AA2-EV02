<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Error de Inicio de Sesión</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #fff0f0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .error-box {
      background: #ffd2d2;
      padding: 2rem 3rem;
      border-radius: 8px;
      box-shadow: 0 4px 12px rgba(216,0,0,0.2);
      text-align: center;
      color: #d8000c;
    }
    h1 {
      margin-bottom: 1rem;
    }
    a {
      color: #d8000c;
      text-decoration: none;
      font-weight: bold;
    }
    a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="error-box">
    <h1>Error de inicio de sesión</h1>
    <p><%= request.getAttribute("errorMessage") %></p>
    <p><a href="index.html">Volver a intentar</a></p>
  </div>
</body>
</html>
