<!-- login.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
       body {
           font-family: Arial, sans-serif;
           background: url('images/beluru.jpeg') no-repeat center center fixed;
           background-size: contain;
           margin: 0;
           padding: 0;
           display: flex;
           align-items: center;
           justify-content: center;
           height: 100vh;
       }

        .login-form {
            background-color: rgba(255, 255, 255, 0.8); /* Adjust the background color transparency as needed */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px; /* Adjust the width as needed */
        }

        h2 {
            text-align: center;
            color: #333;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="login-form">
        <form action="login" method="post">
            <h2>Admin Login</h2>
            <label for="adminUsername">Username:</label>
            <input type="text" id="adminUsername" name="userName" required><br>
            <label for="adminPassword">Password:</label>
            <input type="password" id="adminPassword" name="password" required><br>
            <input type="submit" value="Admin Login">
        </form>


    </div>
</body>
</html>
