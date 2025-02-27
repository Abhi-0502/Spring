<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Team Registration</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #fff;
        }

        .form-container {
            background: #fff;
            color: #333;
            padding: 30px;
            width: 400px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h2 {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
            color: #0072ff;
            text-transform: uppercase;
            border-bottom: 2px solid #00c6ff;
            display: inline-block;
            padding-bottom: 5px;
        }

        .container {
            display: flex;
            flex-direction: column;
            gap: 15px;
            margin-top: 20px;
        }

        .container a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
            font-size: 16px;
            padding: 12px 20px;
            border-radius: 30px;
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            text-transform: uppercase;
            transition: all 0.3s ease-in-out;
            text-align: center;
        }

        .container a:hover {
            background: linear-gradient(135deg, #00eaff, #0054e0);
            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.3);
            transform: translateY(-2px);
        }


        @media (max-width: 480px) {
            .form-container {
                width: 90%;
                padding: 20px;
            }

            h2 {
                font-size: 20px;
            }

            .container a {
                font-size: 14px;
                padding: 10px 15px;
            }
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Team Registration</h2>
        <div class="container">
            <a href="registration.jsp">Registration Form</a>
            <a href="searchById.jsp">Search Applicants by ID</a>
            <a href="getAllUsers">View all mall details</a>
        </div>
    </div>
</body>
</html>
