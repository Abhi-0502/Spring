<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sign In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin: 10px 0 5px;
            font-weight: bold;
            color: #555;
        }
        input {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }
        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
        .error, .success {
            text-align: center;
            margin: 10px 0;
            font-size: 14px;
        }
        .error {
            color: red;
        }
        .success {
            color: green;
        }
        .forget-password {
            text-align: right;
            margin-top: -10px;
        }
        .forget-password a {
            text-decoration: none;
            color: #007BFF;
            font-size: 14px;
        }
        .forget-password a:hover {
            text-decoration: underline;
        }
        .dashboard-button {
            text-align: center;
            margin-top: 15px;
        }
        .dashboard-button a {
            text-decoration: none;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border-radius: 4px;
            font-size: 16px;
        }
        .dashboard-button a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Sign In</h1>
        <form action="signin" method = "post">
        <h3>${valid}</h3>
        <h4>${loginError}</h4>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value = "${email} "required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit">Sign In</button>
            <br>
            <div class="forget-password">
                <a href="resetPassword">Forgot Password?</a>
            </div>
        </form>
        <p class="success" th:if="${successMessage}" th:text="${successMessage}"></p>
        <p class="error" th:if="${errorMessage}" th:text="${errorMessage}"></p>


    </div>
</body>
</html>
