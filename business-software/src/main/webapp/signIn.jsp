<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .container h2 {
            text-align: center;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .error {
            color: red;
            font-size: 12px;
        }
        button {
            width: 100%;
            padding: 10px;
            background: blue;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Sign In</h2>
    <form id="signInForm">
        <input type="text" id="username" placeholder="Username" required>
        <span class="error" id="usernameError"></span>

        <input type="email" id="email" placeholder="Email" required>
        <span class="error" id="emailError"></span>

        <input type="password" name="password" id="password" placeholder="Enter your password">
        <span class="error" id="passwordError"></span>

        <button type="submit">Sign In</button>
    </form>
</div>

<script>
    document.getElementById('password').addEventListener('input', function () {
        this.type = 'text';
        let maskedValue = this.value.replace(/./g, '*');
        this.value = maskedValue;
        this.type = 'password';
    });

    document.getElementById("signInForm").addEventListener("submit", function(event) {
        let valid = true;
        let username = document.getElementById("username").value;
        let email = document.getElementById("email").value;
        let password = document.getElementById("password").value;

        document.getElementById("usernameError").textContent = "";
        document.getElementById("emailError").textContent = "";
        document.getElementById("passwordError").textContent = "";

        if (username.length < 3) {
            document.getElementById("usernameError").textContent = "Username must be at least 3 characters";
            valid = false;
        }

        let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            document.getElementById("emailError").textContent = "Enter a valid email";
            valid = false;
        }

        if (password.length < 6) {
            document.getElementById("passwordError").textContent = "Password must be at least 6 characters";
            valid = false;
        }

        if (!valid) {
            event.preventDefault();
        }
    });
</script>
</body>
</html>
