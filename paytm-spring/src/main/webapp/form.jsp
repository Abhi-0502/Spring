<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login Details</title>
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
    <div class="logo">User Management</div>
    <div class="nav-links">
        <a href="index.jsp">Home</a>
        <a href="getAllUser">About</a>
        <a href="getUser.jsp">Search User</a>
    </div>
</div>

<!-- Main Content -->
<h2>Login Details</h2>
<form action="user" method="post">
    <label for="firstName">User First Name:</label>
    <input type="text" id="firstName" name="firstName" required>

    <label for="lastName">User Last Name:</label>
    <input type="text" id="lastName" name="lastName" required>

    <label for="phoneNo">Phone Number:</label>
    <input type="number" id="phoneNo" name="PhoneNo" required>

    <label for="TransactionId">Transaction ID:</label>
    <input type="text" id="TransactionId" name="TransactionId" required>

    <label for="PinCode">Pin Code:</label>
    <input type="number" id="PinCode" name="PinCode" required>

    <label for="BankName">Bank Name:</label>
    <input type="text" id="BankName" name="BankName" required>

    <label for="atmNo">ATM Number:</label>
    <input type="number" id="atmNo" name="atmNo" required>

    <label for="amount">Amount:</label>
    <input type="number" id="amount" name="amount" required>

    <label for="paymentStatus">Payment Status:</label>
    <input type="text" id="paymentStatus" name="paymentStatus" required>

    <label for="paymentMode">Payment Mode:</label>
    <input type="text" id="paymentMode" name="paymentMode" required>

    <label for="Remarks">Remarks:</label>
    <input type="text" id="Remarks" name="Remarks">

    <input type="submit" value="Submit">
</form>

</body>
</html>
