<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            background-image: url('https://t4.ftcdn.net/jpg/06/27/00/35/240_F_627003539_rVIbhYAF2up1M4QhbLS0v8CGsTpsWt41.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }

        h2 {
            text-align: center;
            color: #FFD700; /* Gold color for emphasis */
            font-size: 32px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
            margin-bottom: 20px;
        }

        .response-message {
            background: rgba(255, 255, 255, 0.85);
            padding: 20px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.3);
            max-width: 600px;
            width: 80%;
        }

        .response-message p {
            font-size: 18px;
            color: #333;
        }

        .party-invite {
            font-size: 20px;
            font-weight: bold;
            color: #4CAF50;
            margin-top: 20px;
        }

        .footer {
            text-align: center;
            padding: 10px;
            background-color: rgba(0, 0, 0, 0.7);
            color: white;
            position: absolute;
            bottom: 0;
            width: 100%;
            font-size: 14px;
        }

        /* Add smooth transitions */
        .footer p {
            margin: 0;
            transition: opacity 0.3s ease;
        }

        .footer:hover p {
            opacity: 0.8;
        }
    </style>
    <script>
        // JavaScript to show current date and time in footer
        function updateFooter() {
            const footer = document.getElementById('footer-text');
            const currentDate = new Date();
            footer.textContent = "© " + currentDate.getFullYear() + " New Year Party Invitation. All rights reserved.";
        }

        // Call the function when the page loads
        window.onload = updateFooter;
    </script>
</head>
<body>

    <div class="response-message">
        <h2>Log-in Successful, ${firstName}!</h2>
        <p>Thank you for registering </p>

    </div>

    <div class="footer">
        <p id="footer-text"></p>
    </div>

</body>
</html>

