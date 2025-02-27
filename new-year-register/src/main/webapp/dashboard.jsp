<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Confirmation</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            background-image: url('https://wallpaperaccess.com/full/1668944.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        nav {
            background-color: #343a40;
            padding: 10px 20px;
            display: flex;
            align-items: center;
            justify-content: space-between;
            width: 100%;
        }

        nav img {
            height: 50px;
            width: 120px;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
            gap: 15px;
        }

        nav ul li {
            display: inline;
        }

        nav ul li a {
            text-decoration: none;
            color: white;
            font-weight: bold;
            transition: color 0.3s;
        }

        nav ul li a:hover {
            color: #007bff;
        }

        main {
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
            flex-grow: 1;
        }
            nav.navbar {
            margin-right: -20px;
            align:right;
        }
        h3 {
            color: blue;
            text-align: center;
            font-size: 24px;
        }
        span{
        color:white;
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 15px 20px;
            text-align: center;
            width: 100%;
        }

        footer .social-icons {
            margin: 10px 0;
        }

        footer .social-icons a {
            color: white;
            margin: 0 10px;
            font-size: 20px;
            transition: color 0.3s;
        }

        footer .social-icons a:hover {
            color: #007bff;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="#">
            <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" height="50" width="120">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
           <ul class="navbar-nav">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="updateProfile?id=${id}">Update</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
            <li><span>Hi ${dto}</span></li>
             <li>
                 <img src="view/${image.getProfilePhoto()}" alt="Profile"
                      class="rounded-circle img-thumbnail"
                      style="width: 35px; height: 35px; object-fit: cover;">
             </li>
            </ul>
        </div>
      </div>
        </nav>
    <main>
        <h3>Hi ${dto} welcome back...</h3>
    </main>
    <footer>
        <div class="social-icons">
            <a href="#"><i class="fab fa-facebook"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-whatsapp"></i></a>
        </div>
        <div class="date-time" id="currentDateTime"></div>
        <p>&copy; 2025 Party Registration. All Rights Reserved.</p>
    </footer>
</body>
</html>


