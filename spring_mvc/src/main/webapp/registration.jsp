<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enhanced Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('main.png');
            background-size: cover;
            background-position: center;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 115vh;
            margin: 0;
        }

        form {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 25px 35px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 65%;
            max-width: 350px;
            height: 100%;
        }

        h1 {
            text-align: center;
            color: #444;
            margin-bottom: 20px;
            font-family: 'Georgia', serif;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #555;
        }

        input, textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 14px;
            box-sizing: border-box;
            transition: border-color 0.3s ease-in-out;
        }

        input:focus, textarea:focus {
            border-color: #007BFF;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        .radio-group {
            display: flex;
            gap: 10px;
            align-items: center;
            margin-bottom: 20px;
        }

        .radio-group label {
            font-weight: normal;
        }

        button {
            width: 100%;
            padding: 12px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }

        button:hover {
            background-color: #0056b3;
        }

        @media (max-width: 480px) {
            form {
                padding: 20px;
            }
            input, textarea, button {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
    <form action="user" >
        <h1>Registration Form</h1>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter your name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob">

        <label>Gender:</label>
        <div class="radio-group">
            <input type="radio" id="male" name="gender" value="Male">
            <label for="male">Male</label>

            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label>
        </div>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" placeholder="Enter your phone number" pattern="[0-9]{10}" required>

        <label for="address">Address:</label>
        <textarea id="address" name="address" rows="4" placeholder="Enter your address"></textarea>

<a href="getAllUsers">Get All Users</a>
<a href="getAllUsers">Get All Users</a>
        <button type="submit">Submit</button>
    </form>
</body>
</html>

