<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Paytm Login Details</title>
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
                width: 90%;
                background-color: rgba(0, 0, 0, 0.7);
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
                font-size: 20px;
                font-weight: bold;
            }

            .header .nav-links {
                display: flex;
                gap: 100px;
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
                background: rgba(255, 255, 255, 0.8);
                padding: 20px;
                border-radius: 5px;
                max-width: 400px;
                margin: 20px auto;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }

            input[type="text"], input[type="number"], input[type="submit"], input[type="datetime-local"] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                cursor: pointer;
                font-weight: bold;
            }

            input[type="submit"]:hover {
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
        <div class="logo">Paytm Update Details</div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="getAllUser">GetAll</a>

        </div>
    </div>


    <!-- Form Container -->
    <div class="container">
        <h2>Login Details</h2>
        <form action="updateUser" method="post">

<input type="text" hidden name="id" value="${users.id}">
 <h2>Login Details</h2>
        <form action="user" method ="post" >
            <label for="userName">Given Name:</label>
            <input type="text" name="userName" id="userName"  placeholder="Enter  userName" value="${users.userName}"required>>>

            <label for="surName">Surname:</label>
            <input type="text" name="surName" id="surName" placeholder="Enter  surName" value="${users.surName}"required>>>

            <label for="dob">Date of Birth:</label>
            <input type="date" name="dob" id="dob"  placeholder="Enter  dob" value="${users.dob}"required>>>

            <label for="gender">Gender:</label>
            <select name="gender" id="gender"  placeholder="Enter  gender" value="${users.gender}"required>>>
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="email">Email:</label>
            <input type="email" name="email" id="email" placeholder="Enter  email" value="${users.email}"required>> >

            <label for="number">Phone Number:</label>
            <input type="text" name="number" id="number" placeholder="Enter  number" value="${users.number}"required>> >

            <label for="pwd">Password:</label>
            <input type="password" name="pwd" id="password"  placeholder="Enter  password" value="${users.pwd}"required>> >

            <label for="confirmPwd">Confirm Password:</label>
            <input type="password" name="confirmPwd" id="confirmPassword"  placeholder="Enter  confirmPassword" value="${users.confirmPwd}"required>>>

            <label for="hideAns">Hide Answer:</label>
            <input type="text" name="hideAns" id="hideAns"  placeholder="Enter  hideAns" value="${users.hideAns}"required>>>

            <label for="captcha">Captcha:</label>
            <input type="text" name="captcha" id="captcha"  placeholder="Enter  captcha" value="${users.captcha}"required>>>

            <input type="submit" value="SUBMIT">
        </form>
    </div>


    <!-- Next Page Link -->
    <div class="getpaytmbyid.jsp">
        <a href="#">Next Page</a>
    </div>

</body>
</html>
