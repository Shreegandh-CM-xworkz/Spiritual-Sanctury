<%@ page import="Entities.TempleEntity" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Temples</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        a {
            text-decoration: none;
            padding: 6px 10px;
            margin: 4px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
        }

        .update {
            background-color: #007bff;
            color: #fff;
        }

        .delete {
            background-color: #dc3545;
            color: #fff;
        }
    </style>
</head>
<body>

<h2>Temples table</h2>

<table>
    <thead>
    <tr>
        <th>Sl.no</th>
        <th>Temple name</th>
        <th>Location</th>
        <th>VIP Entry</th>
        <th>Inaugurated Date</th>
        <th>Main God</th>
        <th>Dimension</th>
        <th>Entry Fee</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="temple">
    <tr>
       <td>${temple.getId()}</td>
       <td>${temple.getName()}</td>
       <td>${temple.getLocation()}</td>
       <td>${temple.getVipEntry()}</td>
       <td>${temple.getInaguratedDate()}</td>
       <td>${temple.getMainGod()}</td>
       <td>${temple.getDimension()}</td>
       <td>${temple.getEntryFee()}</td>
       <td>
            <a href="update?id=${temple.getId()}" class="update">Update</a>
            <a href="delete?id=${temple.getId()}" class="delete">Delete</a>
       </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
