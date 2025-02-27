<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Details</title>
    <style>
        body {
            background-image: url('img_1.png'); /* Replace with the actual path to your image */
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: rgba(0, 0, 0, 0.8); /* Semi-transparent black background */
            color: white;
            padding: 10px 20px;
            position: fixed;
            top: 0;
            left: 0;
            width: 90%;
            z-index: 1000;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header h1 {
            margin: 0;
            font-size: 24px;
        }

        nav a {
            color: white;
            text-decoration: none;
            margin-left: 40px;
            font-size: 16px;
            padding: 5px 10px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        nav a:hover {
            background-color: #4CAF50;
        }

        .container {
            background: rgba(255, 255, 255, 0.8); /* Semi-transparent white */
            padding: 20px;
            border-radius: 10px;
            max-width: 400px;
            margin: 120px auto; /* Centers the form with padding for the header */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
        }

        form label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
        }

        input[type="text"], input[type="password"], input[type="email"], input[type="date"], select, input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        #errorMessage {
            color: red;
            text-align: center;
            display: none;
        }

        .next-page {
            text-align: center;
            margin-top: 20px;
        }

        .next-page a {
            color: #4CAF50;
            text-decoration: none;
            font-size: 16px;
            font-weight: bold;
        }

        .next-page a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <h1>Login Page</h1>
        <nav>
            <a href="index.jsp">Home</a>
            <a href="getAllUser">All Users</a>
            <a href="response.jsp">Response</a>
        </nav>
    </header>

    <!-- Login Form -->
    <div class="container">
        <h2>Login Details</h2>
        <form action="user" method ="post" >
            <label for="userName">Given Name:</label>
            <input type="text" name="userName" id="userName" >

            <label for="surName">Surname:</label>
            <input type="text" name="surName" id="surName">

            <label for="dob">Date of Birth:</label>
            <input type="date" name="dob" id="dob" >

            <label for="gender">Gender:</label>
            <select name="gender" id="gender" >
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="email">Email:</label>
            <input type="email" name="email" id="email" >

            <label for="number">Phone Number:</label>
            <input type="text" name="number" id="number" >

            <label for="pwd">Password:</label>
            <input type="password" name="pwd" id="password" >

            <label for="confirmPwd">Confirm Password:</label>
            <input type="password" name="confirmPwd" id="confirmPassword" >

            <label for="hideAns">Hide Answer:</label>
            <input type="text" name="hideAns" id="hideAns">

            <label for="captcha">Captcha:</label>
            <input type="text" name="captcha" id="captcha" >

            <input type="submit" value="SUBMIT">
        </form>

        <div id="errorMessage">Passwords do not match!</div>
    </div>

    <!-- Password Validation Script -->
    <script>
        document.getElementById('loginForm').addEventListener('submit', function(event) {
            var password = document.getElementById('password').value;
            var confirmPassword = document.getElementById('confirmPassword').value;

            if (password !== confirmPassword) {
                event.preventDefault(); // Prevent form submission
                document.getElementById('errorMessage').style.display = 'block';
            } else {
                document.getElementById('errorMessage').style.display = 'none';
            }
        });
    </script>

    <!-- Next Page Link -->
    <div class="next-page">
        <a href="nextPage.html">Click here to open the next page</a>
    </div>
</body>
</html>