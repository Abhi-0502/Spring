<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Users</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
            font-weight: bold;
            color: #555;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        form {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            padding: 6px 12px;
            font-size: 12px;
            border-radius: 4px;
        }

        a:hover {
            opacity: 0.8;
        }

        .delete-icon {
            color: black;
            font-size: 16px;
            padding: 6px;
        }

        .delete-icon:hover {
            color: red;
        }

        .edit-icon {
            color: black;
            font-size: 16px;
            padding: 6px;
            transform: rotate(0deg);
        }
        .edit-icon:hover {
            color: blue;
        }
    </style>
</head>
<body>
    <form action="getAllUsers">

    </form>
    <h2>Applicants Details</h2>
    <table>
        <tr>
            <th>Id</th>
            <th>Mall Name</th>
            <th>Mall area</th>
            <th>No of floors</th>
            <th>City</th>
            <th>Action</th>
        </tr>
        <c:forEach var="dto" items="${getAll}">
            <tr>
                <td>${dto.getId()}</td>
                <td>${dto.getMallName()}</td>
                <td>${dto.getMallArea()}</td>
                <td>${dto.getNoOfFloors()}</td>
                <td>${dto.getCity()}</td>
                <td>
                <a href="delete?id=${dto.getId()}" class="delete-icon">
                <i class="bi bi-trash"></i></a> &nbsp;

                <a href="fetchUser?id=${dto.getId()}" class="edit-icon">
                <i class="bi bi-pencil"></i></a>
            </tr>
        </c:forEach>
    </table>
</body>
</html>