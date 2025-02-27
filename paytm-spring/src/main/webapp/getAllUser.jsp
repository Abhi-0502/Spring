<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="con" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Details</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        /* General Styles */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
        }

        /* Header Styles */
        .header {
            width: 90%;
            background-color: #4CAF50;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }
        .header .logo {
            font-size: 24px;
            font-weight: bold;
        }
        .header .nav-links {
            display: flex;
            gap: 15px;
        }
        .header .nav-links a {
            text-decoration: none;
            color: white;
            font-size: 16px;
            font-weight: bold;
        }
        .header .nav-links a:hover {
            text-decoration: underline;
        }

        /* Table Styles */
        table {
            border-collapse: collapse;
            width: 90%;
            margin: 20px auto;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            background-color: white;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }

        /* Action Button Styles */
        .action-button {
            border: none;
            color: white;
            padding: 5px 10px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 2px;
            cursor: pointer;
            border-radius: 5px;
        }
        .delete-button {
            background-color:  blue;
            display: inline-flex;
            align-items: center;
        }
        .edit-button {
            background-color: green;
            display: inline-flex;
            align-items: center;
        }
        .action-button i {
            margin-right: 5px;
        }
    </style>
</head>
<body>
    <header class="header">
        <div class="logo">User Management</div>
        <form action="getAllUser">
        <nav class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="addUser.jsp">Add User</a>
            <a href="logout.jsp">Logout</a>
        </nav>
    </header>

    <h2>List of User Details</h2>

    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone No</th>
                <th>Transaction ID</th>
                <th>Pin Code</th>
                <th>Bank Name</th>
                <th>ATM No</th>
                <th>Amount</th>
                <th>Payment Date</th>
                <th>Payment Status</th>
                <th>Payment Mode</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <con:forEach var="user" items="${getAllUser}">
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getPhoneNo()}</td>
                    <td>${user.getTransactionId()}</td>
                    <td>${user.getPinCode()}</td>
                    <td>${user.getBankName()}</td>
                    <td>${user.getAtmNo()}</td>
                    <td>${user.getAmount()}</td>
                    <td>${user.getPaymentStatus()}</td>
                    <td>${user.getPaymentMode()}</td>
                    <td>${user.getRemarks()}</td>
                    <td>
                        <a href="delete?id=${user.id}" class="action-button delete-button">
                            <i class="fas fa-trash-alt"></i>
                        <a href="fetchUser?id=${user.id}" class="action-button edit-button">
                            <i class="fas fa-edit"></i>
                        </a>
                    </td>
                </tr>
            </con:forEach>
        </tbody>
    </table>
</body>
</html>
