<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In | Medi-Sales</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #6EC1E4, #E5E5E5);
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 30px;
            width: 100%;
            max-width: 400px;
        }

        .container h1 {
            font-size: 1.8rem;
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: 6px;
            outline: none;
        }

        .form-group input:focus {
            border-color: #6EC1E4;
            box-shadow: 0 0 5px rgba(110, 193, 228, 0.5);
        }

        .button {
            background: #6EC1E4;
            color: #fff;
            padding: 10px;
            font-size: 1rem;
            border: none;
            border-radius: 6px;
            width: 100%;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .button:hover {
            background: #5397ba;
        }

        .links {
            text-align: center;
            margin-top: 15px;
        }

        .links a {
            color: #6EC1E4;
            text-decoration: none;
            font-size: 0.9rem;
        }

        .links a:hover {
            text-decoration: underline;
        }

        .social-login {
            display: flex;
            justify-content: space-around;
            margin-top: 20px;
        }

        .social-login a {
            display: flex;
            justify-content: center;
            align-items: center;
            border: 1px solid #ccc;
            border-radius: 50%;
            width: 40px;
            height: 40px;
            text-decoration: none;
            color: #333;
            font-size: 1.2rem;
            transition: background 0.3s ease, color 0.3s ease;
        }

        .social-login a:hover {
            background: #6EC1E4;
            color: #fff;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Sign In</h1>
        <form action="signIn" method="post">
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>

            <button type="submit" class="button">Sign In</button>
        </form>

        <div class="links">
            <a href="forgotPassword.jsp">Forgot Password?</a> | <a href="register.jsp">Create an Account</a>
        </div>

        <div class="social-login">
            <a href="#" title="Sign in with Google"><i class="fab fa-google"></i></a>
            <a href="#" title="Sign in with Facebook"><i class="fab fa-facebook-f"></i></a>
            <a href="#" title="Sign in with Twitter"><i class="fab fa-twitter"></i></a>
        </div>
    </div>
</body>

</html>
