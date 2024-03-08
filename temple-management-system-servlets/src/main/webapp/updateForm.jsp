<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Form</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
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
            color: #1a1a1a;
            margin-bottom: 20px;
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
            background-color: #4285f4;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #3c75d6;
        }
    </style>
</head>
<body>
    <h2>Update Temple Information</h2>
    <form action="updateInfoForm" method="post">
        <label for="name">Temple Name:</label>
        <input type="text" name="name" value="${entity.getName()}" required>

        <label for="location">Location:</label>
        <input type="text" name="location" value="${entity.getLocation()}" required>

        <label for="vipEntry">VIP Entry:</label>
        <input type="text" name="vipEntry" value="${entity.getVipEntry()}">

        <label for="inauguratedDate">Inaugurated Date:</label>
        <input type="text" name="inaguratedDate" value="${entity.getInaguratedDate()}" required>

        <label for="mainGod">Main God:</label>
        <input type="text" name="mainGod" value="${entity.getMainGod()}" required>

        <label for="dimension">Dimension:</label>
        <input type="text" name="dimension" value="${entity.getDimension()}" required>

        <label for="entryFee">Entry Fee:</label>
        <input type="Double" name="entryFee" value="${entity.getEntryFee()}" required>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
