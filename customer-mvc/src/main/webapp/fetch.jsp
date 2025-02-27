<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #333333;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #555555;
        }

        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #dddddd;
            border-radius: 5px;
            font-size: 16px;
        }

        .form-group input:focus, .form-group select:focus {
            border-color: #6c63ff;
            outline: none;
            box-shadow: 0 0 5px rgba(108, 99, 255, 0.5);
        }

        .form-group button {
            width: 100%;
            background-color: #6c63ff;
            color: #ffffff;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .form-group button:hover {
            background-color: #5548c8;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Customer Form</h2>
        <form action="user" method="POST">

        <input type="text" hidden name="id" value="${users.id}">

            <div class="form-group">
                <label for="customerName">Customer Name:</label>
                <input type="text" id="customerName" name="customerName" placeholder="Enter full name"value="${users.customerName}" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" name="Email" placeholder="Enter email address" value="${users.email}" required>
            </div>
            <div class="form-group">
                <label for="customerNo">Customer Number:</label>
                <input type="number" id="customerNo" name="customerNo" placeholder="Enter phone number" value="${users.customerNo}"required>
            </div>
            <div class="form-group">
                <label for="deliveryDate">Delivery Date:</label>
                <input type="date" id="deliveryDate" name="deliveryDate" value="${users.deliveryDate}"required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <textarea id="address" name="address" rows="3" placeholder="Enter delivery address" ${users.address}required></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Update</button>
            </div>
        </form>
    </div>
</body>
</html>
