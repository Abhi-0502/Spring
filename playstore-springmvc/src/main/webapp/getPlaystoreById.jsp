<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
    <style>
        /* General Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
        }
        h1 {
            text-align: center;
            color: #333;
            margin-top: 20px;
        }

        /* Navbar Styles */
        .navbar {
            background-color: #007bff;
            overflow: hidden;
            display: flex;
            padding: 10px;
        }
        .navbar a {
            text-decoration: none;
            color: white;
            padding: 10px 15px;
            font-weight: bold;
            text-align: center;
        }
        .navbar a:hover {
            background-color: #0056b3;
            color: white;
        }

        /* Form Styles */
        form {
            margin: 20px auto;
            width: 50%;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"] {
            padding: 5px;
            margin: 10px 0;
            width: calc(100% - 10px);
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            padding: 10px 15px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        /* Table Styles */
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #4caf50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <div class="navbar">
                 <a href="index.jsp">Home</a>
                <a href="getAllUser">Get All Users</a>
    </div>

    <!-- Content -->
    <h1>User Search Form</h1>

    <form action="getPlayStore">
        <label for="id">Enter ID:</label>
        <input type="text" id="id" name="id"> <br>
<br>
<input type="SUBMIT" value="search" ></br>
</form>
    </form>
<table>
        <thead>
            <tr>
                <th>Sl. No</th>
                <th>First Name</th>
                <th>Surname</th>
                <th>Date of Birth</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Password</th>
                <th>Confirm Password</th>
                <th>Hidden Answer</th>

            </tr>
        </thead>
        <tbody>
                <tr>
                    <td>${getById.getId()}</td>
                    <td>${getById.getUserName()}</td>
                    <td>${getById.getSurName()}</td>
                    <td>${getById.getDob()}</td>
                    <td>${getById.getGender()}</td>
                    <td>${getById.getEmail()}</td>
                    <td>${getById.getNumber()}</td>
                    <td>${getById.getPwd()}</td>
                    <td>${getById.getConfirmPwd()}</td>
                    <td>${getById.getHideAns()}</td>
                    </tr>

    </table>
    </tbody>
</body>
</html>