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
        <th>Customer Name</th>
        <th>Email</th>
        <th>Number</th>
        <th>Deliver date</th>
        <th>Address</th>
      </tr>
        <tr>
            <td>${getById.getId()}</td>
            <td>${getById.getCustomerName()}</td>
            <td>${getById.getEmail()}</td>
            <td>${getById.getCustomerNo()}</td>
            <td>${getById.getDeliveryDate()}</td>
            <td>${getById.getAddress()}</td>
      </tr>
    </table>
</body>
</html>