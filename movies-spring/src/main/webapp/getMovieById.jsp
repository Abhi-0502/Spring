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
            justify-content: center;
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
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"], input[type="number"] {
            padding: 10px;
            margin: 10px 0;
            width: 100%;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
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
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
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


<form action="getMoviesById">

Enter Sl.No: <input type="text" name="id">
<br>
<input type="SUBMIT" value="search" ></br>
</form>

    <!-- Table -->
  <h2>List of User and Movie Details</h2>

      <table>
          <thead>
              <tr>
                  <th>Sl. No</th>
                  <th>Movie Name</th>
                  <th>Hero</th>
                  <th>Heroin</th>
                  <th>Release Year</th>
                  <th>Language</th>
                  <th>Genre</th>
                  <th>Duration (mins)</th>
                  <th>Rating</th>
                  <th>Director</th>
                  <th>Actions</th>
              </tr>
          </thead>
          <tbody>
              <con:forEach var="getById" >
                  <tr>
                      <td>${getById.getId()}</td>
                      <td>${getById.getMovieName()}</td>
                      <td>${getById.getHero()}</td>
                      <td>${getById.getHeroin()}</td>
                      <td>${getById.getReleaseYear()}</td>
                      <td>${getById.getLanguage()}</td>
                      <td>${getById.getGenre()}</td>
                      <td>${getById.getDuration()}</td>
                      <td>${getById.getRating()}</td>
                      <td>${getById.getDirector()}</td>
                      </tr>
            </c:forEach>
        </tbody>

    </table>

</body>
</html>