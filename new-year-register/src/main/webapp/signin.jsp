<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

    <style>
        body {
            background-image: url('https://wallpaperaccess.com/full/1668944.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
        }
        nav.navbar {
            margin-bottom: 20px;
        }

        .signin-container {
            background-color: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            margin: auto;
        }

        .signin-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .signin-container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }

        .signin-container .btn {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        .signin-container .btn:hover {
            background-color: #0056b3;
        }

        .signin-container .links {
            text-align: center;
            margin-top: 15px;
        }

        .signin-container .links a {
            text-decoration: none;
            color: #007bff;
            font-size: 14px;
        }

        .signin-container .links a:hover {
            text-decoration: underline;
        }

        .response-message {
            text-align: center;
            margin-top: 15px;
            font-size: 16px;
            color: red;
        }

        footer {
            background-color: #343a40;
            color: white;
            padding: 15px 0;
            text-align: center;
            margin-top: auto;
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
    <!-- Header -->
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
                    <li class="nav-item"><a class="nav-link" href="index">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="signup">Sign-up</a></li>
                    <li class="nav-item"><a class="nav-link" href="aboutus.jsp">About Us</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Sign In Form -->
    <div class="signin-container">
        <h2>Sign In</h2>
        <form action="signin" method="POST">
            <input type="email" name="email" placeholder="Enter your email" required value=${email}>
            <input type="password" name="password" placeholder="Enter your password" required>
            <button type="submit" class="btn">Sign In</button>
        </form>

        <div class="links">
            <a href="index.jsp">Back</a> |
            <a href="forgotPassword.jsp">Forgot Password?</a></br>
            <span>${loginError}</span>
        </div>

        <div class="response-message">
            <h2>${message}</h2>
        </div>
    </div>

    <!-- Footer -->
    <footer>
        <div class="social-icons">
            <a href="#"><i class="fab fa-facebook"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-whatsapp"></i></a>
        </div>
        <p>&copy; 2025 Party Registration. All Rights Reserved.</p>
    </footer>
</body>
</html>
