<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Party Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- ajox javascript -->
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <style>
        body {
            background-image: url('https://wallpaperaccess.com/full/1668944.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
        }
        .form-container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 800px;
            margin: 20px auto;
        }
        .form-row {
            margin-bottom: 15px;
        }
        .form-group {
            flex: 1;
            margin: 0 10px;
        }
        .form-group label {
            font-weight: bold;
        }
        .error {
            color: red;
            font-size: 14px;
            display: none;
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 15px 0;
            margin-top: 20px;
        }
        footer .social-icons a {
            color: white;
            margin: 0 10px;
            font-size: 20px;
            transition: color 0.3s;
        }
        footer .social-icons a:hover {
            color: #007bff;
        }
        span{
        color:red;
        font-size:11px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" height="50" width="120">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
    <ul class="navbar-nav">
     <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
     <li class="nav-item"><a class="nav-link" href="signin.jsp">Sign In</a></li>
     <li class="nav-item"><a class="nav-link" href="logout.jsp">Logout</a></li>
     <li class="nav-item"><a class="nav-link" href="aboutus.jsp">About Us</a></li>
    </ul>
   </div>
</nav>
<!-- Form -->
<div class="form-container">
    <h2>Party Registration</h2>
    <form id="registrationForm" action="form" method="post" onsubmit="return validateForm()">
        <div class="form-row d-flex">
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input type="text" id="firstName" name="firstName" value="${param.firstName}" class="form-control" required>
                <span>${firstNameError}</span>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" value="${param.lastName}" class="form-control" required>
                <span>${lastnameerror}</span>
            </div>
        </div>

        <div class="form-row d-flex">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" class="form-control" onblur="checkEmail()" required>
                <span id="emailError"></span>
                <span>${emailError}</span>
            </div>
            <div class="form-group">
                <label for="alternateEmail">Alternate Email</label>
                <input type="email" id="alternateEmail" name="alternateEmail" class="form-control">
            </div>
        </div>

        <div class="form-row d-flex">
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" class="form-control" required>
                <span>${passworderror}</span>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" class="form-control" required>
                <div id="passwordError" class="error">Password and Confirm Password do not match.</div>
                <span>${confirmPassworderror}</span>
            </div>
        </div>

        <div class="form-row d-flex">
            <div class="form-group">
                <label for="contact">Contact</label>
                <input type="tel" id="contact" name="contact" class="form-control" onblur="checkNumber()" required>
                <div id="contactError" class="error">Contact numbers must be 10 digits long.</div>
                <span id="numberError"></span>
                <span>${contacterror}</span>
            </div>
            <div class="form-group">
                <label for="alternateContact">Alternate Contact</label>
                <input type="tel" id="alternateContact" name="alternateContact" class="form-control">
            </div>
        </div>

        <div class="form-row d-flex">
            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" class="form-control" required>
                <span>${doberror}</span>
            </div>
            <div class="form-group">
                <label for="place">Birth Place</label>
                <input type="text" id="place" name="place" class="form-control" required>
                <span>${placeerror}</span>
            </div>
        </div>

        <div class="form-row d-flex">
            <div class="form-group">
                <label for="state">State</label>
                <select id="state" name="state" class="form-control" required onchange="updateDistricts()">
                    <option value="">Select State</option>
                    <option value="karnataka">Karnataka</option>
                    <option value="tamilnadu">Tamil Nadu</option>
                    <option value="goa">Goa</option>
                </select>
                <span>${stateerror}</span>
            </div>
            <div class="form-group">
                <label for="district">District</label>
                <select id="district" name="district" class="form-control" required>
                    <option value="">Select District</option>
                </select>
                <span>${districterror}</span>
            </div>
        </div>

        <div class="button-container d-flex justify-content-between">
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-secondary">Clear</button>
        </div>
    </form>
</div>

<!-- Footer -->
<footer class="text-center">
    <div class="social-icons">
        <a href="#"><i class="fab fa-facebook"></i></a>
        <a href="#"><i class="fab fa-twitter"></i></a>
        <a href="#"><i class="fab fa-instagram"></i></a>
        <a href="#"><i class="fab fa-whatsapp"></i></a>
    </div>
    <div class="date-time" id="currentDateTime"></div>
    <p>&copy; 2025 Party Registration. All Rights Reserved.</p>
</footer>

    <script>
        function updateDistricts() {
            const state = document.getElementById('state').value;
            const districtSelect = document.getElementById('district');

            districtSelect.innerHTML = '<option value="">Select District</option>';

            let districts = [];
            if (state === 'karnataka') {
                districts = ['Bangalore', 'Mysore', 'Hubli', 'Mangalore'];
            } else if (state === 'tamilnadu') {
                districts = ['Chennai', 'Coimbatore', 'Madurai', 'Salem'];
            } else if (state === 'goa') {
                districts = ['North Goa', 'South Goa'];
            }

            districts.forEach(district => {
                const option = document.createElement('option');
                option.value = district.toLowerCase().replace(/\s+/g, '');
                option.textContent = district;
                districtSelect.appendChild(option);
            });
        }

        function validateForm() {
            return validatePasswords() && validateContact();
        }

        function validatePasswords() {
            const password = document.getElementById('password').value;
            const confirmPassword = document.getElementById('confirmPassword').value;
            const errorMessage = document.getElementById('passwordError');

            if (password !== confirmPassword) {
                errorMessage.style.display = 'block';
                return false;
            } else {
                errorMessage.style.display = 'none';
                return true;
            }
        }

        function validateContact() {
            const contact = document.getElementById('contact').value;
            const alternateContact = document.getElementById('alternateContact').value;
            const contactError = document.getElementById('contactError');

            const isValid = (contact.length === 10 && /^\d{10}$/.test(contact)) &&
                            (alternateContact === '' || (alternateContact.length === 10 && /^\d{10}$/.test(alternateContact)));

            if (!isValid) {
                contactError.style.display = 'block';
                return false;
            } else {
                contactError.style.display = 'none';
                return true;
            }
        }
        </script>

<script>
        const checkEmail = async ()=>{
        const email = document.getElementById("email").value
        const response = await axios("http://localhost:8080/new-year-register/api/checkEmail/"+email)
        if(response.data==="Email already exists...!!!"){
        document.getElementById("emailError").innerHTML=response.data
        }else{
        document.getElementById("emailError").innerHTML=""
        }
        }
    </script>

    <script>
            const checkNumber = async ()=>{
            const contact = document.getElementById("contact").value
            const response = await axios("http://localhost:8080/new-year-register/api/checkNumber/"+contact)
            if(response.data==="Phone number exists"){
            document.getElementById("numberError").innerHTML=response.data
            }else{
            document.getElementById("numberError").innerHTML=""
            }
            }
        </script>
</body>
</html>
