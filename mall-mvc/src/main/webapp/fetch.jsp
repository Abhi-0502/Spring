<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mall Details Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }

        .form-container {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
            color: #444;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .form-group input:focus {
            outline: none;
            border-color: #2575fc;
            box-shadow: 0 0 5px rgba(37, 117, 252, 0.5);
        }

        .submit-btn {
            width: 100%;
            padding: 10px;
            background: #2575fc;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            color: #fff;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .submit-btn:hover {
            background: #1a5dbc;
        }

        @media (max-width: 480px) {
            .form-container {
                padding: 20px;
            }
            .form-group input {
                font-size: 12px;
            }
            .submit-btn {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Mall Registration</h2>

        <form action="updateUser" method="POST">

        <input type="text" hidden name="id" value="${users.id}">

            <div class="form-group">
                <label for="mallName">Mall Name:</label>
                <input type="text" id="mallName" name="mallName" placeholder="Enter mall name" value="${users.mallName}"required>
            </div>
            <div class="form-group">
                <label for="mallArea">Mall Area:</label>
                <input type="text" id="mallArea" name="mallArea" placeholder="Enter mall area" value="${users.mallArea}"required>
            </div>
            <div class="form-group">
                <label for="noOfFloors">Number of Floors:</label>
                <input type="number" id="noOfFloors" name="noOfFloors" placeholder="Enter number of floors" value="${users.noOfFloors}"required min="1">
            </div>
            <div class="form-group">
                <label for="city">City:</label>
                <input type="text" id="city" name="city" placeholder="Enter city name" value="${users.city}"required>
            </div>
            <button type="submit" class="submit-btn">Update</button>
        </form>
    </div>
</body>
</html>
