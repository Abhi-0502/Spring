<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User and Movie Details</title>
    <style>
        /* General Styles */
        body {
            background-image: url('https://t4.ftcdn.net/jpg/06/27/00/35/240_F_627003539_rVIbhYAF2up1M4QhbLS0v8CGsTpsWt41.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: white;
            margin-top: 100px;
        }

        /* Header Styles */
        .header {
            width: 100%;
            background-color: rgba(0, 0, 0, 0.8);
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 30px;
            position: fixed;
            top: 0;
            z-index: 1000;
        }

        .header .logo {
            font-size: 24px;
            font-weight: bold;
        }

        .header .nav-links {
            display: flex;
            gap: 30px;
        }

        .header .nav-links a {
            text-decoration: none;
            color: white;
            font-size: 16px;
            font-weight: bold;
            transition: color 0.3s;
        }

        .header .nav-links a:hover {
            color: #4CAF50;
        }

        /* Form Styles */
        form {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            max-width: 500px;
            margin: 150px auto 20px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
        }

        form label {
            font-size: 16px;
            color: #333;
        }

        form input[type="text"],
        form input[type="number"],
        form input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        form input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
            font-weight: bold;
        }

        form input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<!-- Header Section -->
<div class="header">
    <div class="logo">User and Movie Management</div>
    <div class="nav-links">
        <a href="index.jsp">Home</a>
        <a href="getAllUser">About</a>
        <a href="getUser.jsp">Search User</a>
    </div>
</div>

<!-- Main Content -->
<h2>User and Movie Details Form</h2>
<form action="user" method="post">

   <label for="movieName">Movie Name:</label>
    <input type="text" id="movieName" name="movieName" required>

    <label for="hero">Hero:</label>
    <input type="text" id="hero" name="hero">

    <label for="heroin">Heroin:</label>
    <input type="text" id="heroin" name="heroin">

    <label for="releaseYear">Release Year:</label>
    <input type="number" id="releaseYear" name="releaseYear">

    <label for="language">Language:</label>
    <input type="text" id="language" name="language">

    <label for="genre">Genre:</label>
    <input type="text" id="genre" name="genre">

    <label for="duration">Duration (in minutes):</label>
    <input type="number" id="duration" name="duration">

    <label for="rating">Rating (out of 10):</label>
    <input type="number" id="rating" name="rating" step="0.1">

    <label for="director">Director:</label>
    <input type="text" id="director" name="director">

    <input type="submit" value="Submit">
</form>

</body>
</html>
