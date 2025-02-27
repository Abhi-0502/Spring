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
<br>
<input type="SUBMIT" value="search" ></br>
</form>

    <table>
      <tr>
        <th>Id</th>
        <th>Mall Name</th>
        <th>Mall area</th>
        <th>No of floors</th>
        <th>City</th>
      </tr>
        <tr>
            <td>${getById.getId()}</td>
            <td>${getById.getMallName()}</td>
            <td>${getById.getMallArea()}</td>
            <td>${getById.getNoOfFloors()}</td>
            <td>${getById.getCity()}</td>
      </tr>
    </table>

</body>
</html>