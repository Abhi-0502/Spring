<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Year Application</title>
    <style>
        /* General Styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            background: url('https://www.livemint.com/lm-img/img/2024/12/31/600x338/NEW-YEAR-CHILE-3_1704088301385_1735610833291.JPG') no-repeat center center fixed;
            background-size: cover;
            color: white;
        }

        /* Header Section */
        .header {
            width: 100%;
            background-color: rgba(0, 0, 0, 0.9);
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: fixed;
            top: 0;
            z-index: 1000;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.5);
        }

        .header .logo img {
            height: 50px;
        }

        .header .nav-links a {
            text-decoration: none;
            color: white;
            font-size: 16px;
            font-weight: bold;
            margin: 0 10px;
            padding: 8px 20px;
            border: 2px solid transparent;
            border-radius: 25px;
            transition: all 0.3s;
        }

        .header .nav-links a:hover {
            background-color: #FFD700;
            color: black;
            border-color: #FFD700;
        }

        /* Main Content */
        .content {
            flex: 1;
            margin-top: 80px; /* To avoid overlapping with fixed header */
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }

        .content h1 {
            font-size: 4rem;
            margin-bottom: 20px;
            background: linear-gradient(90deg, #FFD700, #FF5733);
            -webkit-background-clip: text;
            color: transparent;
            text-shadow: 2px 2px 5px black;
        }

        .content p {
            font-size: 1.2rem;
            color: #e0e0e0;
            line-height: 1.8;
        }

        .content .btn {
            margin-top: 20px;
            padding: 10px 30px;
            font-size: 18px;
            color: white;
            background-color: #FFD700;
            border: none;
            border-radius: 25px;
            cursor: pointer;
            text-decoration: none;
            transition: all 0.3s;
        }

        .content .btn:hover {
            background-color: #FF5733;
            transform: scale(1.05);
        }

        /* Footer Section */
        .footer {
            width: 100%;
            background-color: rgba(0, 0, 0, 0.9);
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0px -5px 15px rgba(0, 0, 0, 0.5);
        }

        .footer .social-icons a img {
            height: 25px;
            margin: 0 10px;
            transition: transform 0.3s;
        }

        .footer .social-icons a img:hover {
            transform: scale(1.2);
        }

        .footer .date-time {
            font-size: 14px;
            color: #e0e0e0;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .header .nav-links a {
                font-size: 14px;
                padding: 6px 10px;
            }

            .content h1 {
                font-size: 2.5rem;
            }

            .content p {
                font-size: 1rem;
            }

            .content .btn {
                font-size: 16px;
                padding: 8px 20px;
            }

            .footer {
                flex-direction: column;
                text-align: center;
            }
        }
    </style>
</head>
<body>
    <!-- Header Section -->
    <div class="header">
        <div class="logo">
            <img src="https://upload.wikimedia.org/wikipedia/commons/4/47/Logo_placeholder.png" alt="Logo">
        </div>
        <div class="nav-links">
            <a href="form">Sign Up</a>
            <a href="signIn">Sign In</a>
            <a href="EmailOtp">Forget</a>
        </div>
    </div>

    <!-- Main Content -->
    <div class="content">
        <div>
            <h1>Welcome 2025!</h1>
            <p>Start the New Year with joy, laughter, and exciting opportunities. Join us to celebrate!</p>
            <a class="btn" href="signIn.jsp">Join Now</a>
        </div>
    </div>

    <!-- Footer Section -->
    <div class="footer">
        <div class="social-icons">
            <a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/2021_Facebook_icon.svg/2048px-2021_Facebook_icon.svg.png" alt="Facebook"></a>
            <a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Instagram_icon.png/2048px-Instagram_icon.png" alt="Instagram"></a>
            <a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/4/4f/Twitter-logo.jpg" alt="Twitter"></a>
        </div>
        <div class="date-time">
            <span id="current-date-time"></span>
        </div>
    </div>

    <script>
        // Display current date and time in footer
        function displayDateTime() {
            const dateTimeElement = document.getElementById('current-date-time');
            const currentDateTime = new Date();
            const formattedDateTime = currentDateTime.toLocaleString();
            dateTimeElement.textContent = `Current Date and Time: ${formattedDateTime}`;
        }

        displayDateTime();
        setInterval(displayDateTime, 1000); // Update time every second
    </script>
</body>
</html>

