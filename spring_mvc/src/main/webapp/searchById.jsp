<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

        <style>
            table {
                width: 50%;
                border-collapse: collapse;
                margin: 20px auto;
                font-family: Arial, sans-serif;
            }
            th, td {
                border: 1px solid #ddd;
                text-align: center;
                padding: 8px;
            }
            th {
                background-color: #f4f4f4;
            }
        </style>
</head>
<body>

<form action="getuserbyid">

Enter Sl.No: <input type="text" name="id">
<input type="submit" value="SEARCH" >
</form>

    <table>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>DOB</th>
        <th>Gender</th>
        <th>Phone number</th>
        <th>Address</th>
      </tr>
      <tr>
        <td>${getById.getId()}</td>
        <td>${getById.getName()}</td>
        <td>${getById.getEmail()}</td>
        <td>${getById.getPassword()}</td>
        <td>${getById.getDob()}</td>
        <td>${getById.getGender()}</td>
        <td>${getById.getPhone()}</td>
        <td>${getById.getAddress()}</td>
      </tr>
    </table>

</body>
</html>