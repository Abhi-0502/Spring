<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .forgot-password-container {
            background-color: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            max-width: 400px;
        }
        .forgot-password-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .forgot-password-container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }
        .forgot-password-container .btn {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }
        .forgot-password-container .btn:hover {
            background-color: #0056b3;
        }
        .forgot-password-container .links {
            text-align: center;
            margin-top: 15px;
        }
        .forgot-password-container .links a {
            text-decoration: none;
            color: #007bff;
            font-size: 14px;
        }
        .forgot-password-container .links a:hover {
            text-decoration: underline;
        }
        span{
        color:red;
        }
    </style>
</head>
<body>

    <div class="forgot-password-container">
        <h2>Forgot Password</h2>
        <form action="resetPassword" method="POST">
            <input type="email" name="email" placeholder="Enter your email" required>
            <input type="password" name="newPassword" placeholder="Enter new password" required>
            <input type="password" name="confirmPassword" placeholder="Confirm new password" required>
            <button type="submit" class="btn">Reset Password</button>
        </form>

        <div class="links">
            <a href="signin.jsp">Back to Sign In</a>
        </div>

        <div>
            <span>${message}</span>
        </div>
    </div>

</body>
</html>
