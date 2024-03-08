<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Temple Information Form</title>
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

        h2 {
            text-align: center;
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px; /* Adjust the width as needed */
        }

        label {
            display: block;
            margin: 10px 0;
            color: #333;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            text-decoration: none;
            color: #007bff; /* Bootstrap's primary color */
            margin-top: 20px;
            display: block;
            text-align: center;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Temple Information Form</h2>
    <form action="templeEntry" method="post">
        <label for="name">Temple Name:</label>
        <input type="text" name="name" required>

        <label for="location">Location:</label>
        <input type="text" name="location" required>

        <label for="vipEntry">VIP Entry:</label>
        <input type="text" name="vipEntry">

        <label for="inauguratedDate">Inaugurated Date:</label>
        <input type="text" name="inauguratedDate" required>

        <label for="mainGod">Main God:</label>
        <input type="text" name="mainGod" required>

        <label for="dimension">Dimension:</label>
        <input type="text" name="dimension" required>

        <label for="entryFee">Entry Fee:</label>
        <input type="number" name="entryFee" required>

        <input type="submit" value="Submit">
    </form>

    <a href="getAllTemples">List of Temples</a>
</body>
</html>
