<!-- login-failed.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            flex-direction: column;
            color: #333;
        }

        h1 {
            color: #d9534f; /* Bootstrap's danger color */
            text-align: center;
            font-size: 36px;
            margin-bottom: 20px;
        }

        h3 {
            text-align: center;
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            color: #fff;
            background-color: #5bc0de; /* Bootstrap's info color */
            padding: 10px 20px;
            border-radius: 4px;
            font-size: 18px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: #46b8da;
        }
    </style>
</head>
<body>
    <h1>Submitted successfully we get you right back</h1>
    <h3>Click below to go back</h3>
    <a href="initial.jsp">Go back</a>
</body>
</html>
