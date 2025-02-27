<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* General Styles */
        body {
            background-image: url('https://t4.ftcdn.net/jpg/06/27/00/35/240_F_627003539_rVIbhYAF2up1M4QhbLS0v8CGsTpsWt41.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 150vh;
            flex-direction: column;
        }

        h2 {
            text-align: center;
            color: #FFD700;
            font-size: 32px;
            margin-top: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        /* Header Styles */
        .header {
            width: 95%;
            background-color: rgba(0, 0, 0, 0.7);
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 40px;
            position: fixed;
            top: 0;
            z-index: 1000;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.5);
        }

        .header .logo img {
            height: 50px;
        }

        .header .nav-links {
            display: flex;
            gap: 20px;
        }

        .header .nav-links a {
            text-decoration: none;
            color: white;
            font-size: 16px;
            font-weight: bold;
            padding: 10px 20px;
            border-radius: 5px;
            background-color: rgba(255, 255, 255, 0.2);
            transition: background-color 0.3s;
        }

        .header .nav-links a:hover {
            background-color: #FFD700;
            color: #333;
        }

        .form-group {
            display: flex;
            align-items: center;
            margin-bottom: 10px;
        }

        .form-group label {
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 8px;
            display: block;
            color: #CD5C5C;
            width: 300px; /* Adjust width to align labels consistently */
        }

        .input-wrapper {
            position: relative;
            flex: 1;
        }

        .input-wrapper input,
        .input-wrapper select {
            width: 100%; /* Adjusted width to make the input box smaller */
            padding: 10px 5px; /* Increased padding for better spacing */
            font-size: 16px;
            border: 1px solid #ddd;
            border-radius: 8px;
            background: rgba(255, 255, 255, 0.2);
            color: black;
            transition: border-color 0.3s;
        }

        .input-wrapper input:focus,
        .input-wrapper select:focus {
            border-color: #CD5C5C;
            outline: none;
            box-shadow: 0 0 5px rgba(255, 215, 0, 0.5);
        }

        /* Password Show/Hide Button */
        .input-wrapper .show-hide-btn {
            position: absolute;
            right: 10px;
            top: 50%;
            transform: translateY(-50%);
            background-color: transparent;
            border: none;
            color: #CD5C5C;
            cursor: pointer;
            font-size: 16px;
        }

        /* Footer Styles */
        footer {
            text-align: center;
            padding: 20px;
            background-color: rgba(0, 0, 0, 0.7);
            color: white;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        footer p {
            font-size: 14px;
            margin: 0;
        }

        /* Button Styles */
        .form-buttons {
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        .form-buttons input[type="submit"],
        .form-buttons input[type="reset"] {
            padding: 20px 15px;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 8px;
            background-color: #FFD700;
            color: #333;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.3s;
        }

        .form-buttons input[type="submit"]:hover,
        .form-buttons input[type="reset"]:hover {
            background-color: #FFA500;
            transform: translateY(-3px);
        }

        .form-buttons input[type="reset"]:active,
        .form-buttons input[type="submit"]:active {
            transform: translateY(1px);
        }

        /* Error Message */
        #error-message {
            color: red;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <!-- Header Section -->
    <div class="header">
        <div class="logo">
            <a href="index.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpqbL7PGXrKE1-cPeMiBxh5DwKTN062YeLug&s.jpg" alt="Logo"></a>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="signIn.jsp">SignIn</a>
        </div>
    </div>

    <!-- Registration Form -->
    <form id="registrationForm" action="form" method="post" onsubmit="return validateForm()">
        <div class="form-row">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <div class="input-wrapper">
                    <input type="text" id="firstName" name="firstName" required>
                </div>
            </div>

            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <div class="input-wrapper">
                    <input type="text" id="lastName" name="lastName" required>
                </div>
            </div>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <div class="input-wrapper">
                <input type="email" id="email" name="email" required>
            </div>
        </div>

        <div class="form-group">
            <label for="alterEmail">Alternate Email:</label>
            <div class="input-wrapper">
                <input type="email" id="alterEmail" name="alterEmail">
            </div>
        </div>

        <div class="form-group">
            <label for="contact">Contact:</label>
            <div class="input-wrapper">
                <input type="tel" id="contact" name="contact" required>
            </div>
        </div>

        <div class="form-group">
            <label for="alternativeContact">Alternate Contact:</label>
            <div class="input-wrapper">
                <input type="tel" id="alternativeContact" name="alternativeContact">
            </div>
        </div>

        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <div class="input-wrapper">

                <input type="date" name="dob" required/>
            </div>
        </div>

        <div class="form-group">
            <label for="state">State:</label>
            <div class="input-wrapper">
                <select id="state" name="state" required>
                    <option value="">Select a state</option>
                    <option value="Karnataka">Karnataka</option>
                    <option value="Kerala">Kerala</option>
                    <option value="Tamil Nadu">Tamil Nadu</option>
                    <option value="Maharashtra">Maharashtra</option>
                    <option value="Gujarat">Gujarat</option>
                    <option value="West Bengal">West Bengal</option>
                    <option value="Punjab">Punjab</option>
                    <option value="Haryana">Haryana</option>
                    <option value="Bihar">Bihar</option>
                    <option value="Odisha">Odisha</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="district">District:</label>
            <div class="input-wrapper">
                <select id="district" name="district" required>
                    <option value="">Select a district</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Mysuru">Mysuru</option>
                    <option value="Kozhikode">Kozhikode</option>
                    <option value="Thrissur">Thrissur</option>
                    <option value="Chennai">Chennai</option>
                    <option value="Coimbatore">Coimbatore</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Pune">Pune</option>
                    <option value="Kolkata">Kolkata</option>
                    <option value="Howrah">Howrah</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="place">Place:</label>
            <div class="input-wrapper">
                <select id="place" name="place" required>
                    <option value="">Select a place</option>
                    <option value="Indiranagar">Indiranagar</option>
                    <option value="Whitefield">Whitefield</option>
                    <option value="Vyttila">Vyttila</option>
                    <option value="Fort Kochi">Fort Kochi</option>
                    <option value="Velachery">Velachery</option>
                    <option value="Adyar">Adyar</option>
                    <option value="Andheri">Andheri</option>
                    <option value="Borivali">Borivali</option>
                    <option value="Salt Lake">Salt Lake</option>
                    <option value="Park Street">Park Street</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <div class="input-wrapper">
                <input type="password" id="password" name="password" required>
                <button type="button" class="show-hide-btn" onclick="togglePassword('password')">Show</button>
            </div>
        </div>

        <div class="form-group">
            <label for="confirmPwd">Confirm Password:</label>
            <div class="input-wrapper">
                <input type="password" id="confirmPwd" name="confirmPwd" required>
                <button type="button" class="show-hide-btn" onclick="togglePassword('confirmPwd')">Show</button>
            </div>
        </div>

        <div id="error-message" class="error"></div>

        <div class="form-buttons">
            <input type="submit" value="Register">
            <input type="reset" value="Reset">
        </div>
    </form>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2025 New Year Register. All rights reserved.</p>
    </footer>

<script>
    function validateForm() {
        const errorMessage = document.getElementById('error-message');
        errorMessage.innerText = ''; // Clear previous errors

        const email = document.getElementById('email').value.trim();
        const contact = document.getElementById('contact').value.trim();
        const password = document.getElementById('password').value;
        const confirmPwd = document.getElementById('confirmPwd').value;

        // Email validation
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            errorMessage.innerText = 'Enter a valid email address.';
            return false;
        }

        // Contact validation
        const phonePattern = /^\d{10}$/;
        if (!phonePattern.test(contact)) {
            errorMessage.innerText = 'Enter a valid 10-digit contact number.';
            return false;
        }

        // Password validation
        if (password !== confirmPwd) {
            errorMessage.innerText = 'Passwords do not match.';
            return false;
        }

        if (password.length < 8) {
            errorMessage.innerText = 'Password must be at least 8 characters long.';
            return false;
        }

        if (!/[A-Z]/.test(password)) {
            errorMessage.innerText = 'Password must contain at least one uppercase letter.';
            return false;
        }

        if (!/[a-z]/.test(password)) {
            errorMessage.innerText = 'Password must contain at least one lowercase letter.';
            return false;
        }

        if (!/\d/.test(password)) {
            errorMessage.innerText = 'Password must contain at least one number.';
            return false;
        }

        if (!/[@$!%*?&]/.test(password)) {
            errorMessage.innerText = 'Password must contain at least one special character (@, $, !, %, *, ?, &).';
            return false;
        }

        return true; // Form is valid
    }

    function togglePassword(fieldId) {
        const inputField = document.getElementById(fieldId);
        const btn = inputField.nextElementSibling;
        if (inputField.type === 'password') {
            inputField.type = 'text';
            btn.innerText = 'Hide';
        } else {
            inputField.type = 'password';
            btn.innerText = 'Show';
        }
    }
</script>
</body>
</html>