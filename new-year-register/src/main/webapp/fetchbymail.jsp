<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Party Registration</title>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Party Registration Updation</title>
     <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://wallpaperaccess.com/full/1668944.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        nav {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #343a40;
            padding: 10px 20px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
        }

        nav img {
            height: 50px;
            width: auto;
            margin-right: 20px;
        }

        nav ul {
            display: flex;
            list-style: none;
            margin: 0;
            padding: 0;
        }

        nav ul li {
            margin: 0 10px;
            display: flex;
            align-items: center;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            transition: color 0.3s;
        }

        nav ul li a:hover {
            color: #007bff;
        }

        nav ul li img {
            border-radius: 50%;
            border: 2px solid white;
            width: 35px;
            height: 35px;
            object-fit: cover;
            margin-left: 10px;
        }

        main {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            padding: 20px;
        }
        h2 {
            font-size: 28px;
            color: black;
            text-shadow: 1px 1px 2px black;
            margin-bottom: 20px;
        }
        form {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 500px;
        }
        label {
            font-weight: bold;
            margin-bottom: 5px;
            display: block;
        }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        .button-container {
            display: flex;
            justify-content: space-between;
        }
            footer {
                background-color: #343a40;
                color: white;
                padding: 15px 20px;
                margin: 0;
                width: 100%;
                text-align: center;
                box-sizing: border-box;
        }
        footer .social-icons {
            margin: 10px 0;
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
        color:white;
        }
    </style>
</head>

<body>
<nav>
    <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" alt="Logo">
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="aboutus.jsp">About Us</a></li>
        <li><span>Hi ${dto.getFirstName()}</span></li>
        <li>
            <img src="view/${dto.getProfilePhoto()}" alt="Profile" class="rounded-circle img-thumbnail">
        </li>
    </ul>
</nav>

<main>
    <h2>Party Registration Updation</h2>
    <h>${message}</h>
    <form id="registrationForm" action="fetchById" method="post" enctype="multipart/form-data">

        <label for="Id">Id</label>
        <input type="number" id="id" name="id" value="${dto.id}" readOnly required>

        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" required value="${dto.getFirstName()}">
        <span>${firstNameError}</span>

        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" required value="${dto.getLastName()}">
        <span>${lastnameerror}</span>

        <label for="email">Email</label>
        <input type="email" id="email" name="email" required value="${dto.email}">
        <span>${emailError}</span>

        <label for="alternateEmail">Alternate Email</label>
        <input type="email" id="alternateEmail" name="alternateEmail" value="${dto.alternateEmail}">

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required value="${dto.password}">
        <span>${passworderror}</span>

        <label for="contact">Contact</label>
        <input type="tel" id="contact" name="contact" required value="${dto.contact}">
        <span>${contacterror}</span>

        <label for="alternateContact">Alternate Contact</label>
        <input type="tel" id="alternateContact" name="alternateContact" value="${dto.alternateContact}">

        <label for="dob">Date of Birth</label>
        <input type="date" id="dob" name="dob" required value="${dto.dob}">
        <span>${doberror}</span>

        <label for="place">Birth Place</label>
        <input type="text" id="place" name="place" required value="${dto.place}">
        <span>${placeerror}</span>

       <label for="state">State</label>
       <select id="state" name="state" required onchange="updateDistricts()">
           <option value="">Select State</option>
           <option value="karnataka" ${dto.state == 'karnataka' ? 'selected' : ''}>Karnataka</option>
           <option value="tamilnadu" ${dto.state == 'tamilnadu' ? 'selected' : ''}>Tamil Nadu</option>
           <option value="goa" ${dto.state == 'goa' ? 'selected' : ''}>Goa</option>
       </select>
       <span>${stateerror}</span>

       <label for="district">District</label>
       <select id="district" name="district" required>
           <option value="">Select District</option>
           <option value="bangalore" ${dto.district == 'bangalore' ? 'selected' : ''}>Bangalore</option>
           <option value="mysore" ${dto.district == 'mysore' ? 'selected' : ''}>Mysore</option>
           <option value="hubli" ${dto.district == 'hubli' ? 'selected' : ''}>Hubli</option>
           <option value="mangalore" ${dto.district == 'mangalore' ? 'selected' : ''}>Mangalore</option>
           <option value="chennai" ${dto.district == 'chennai' ? 'selected' : ''}>Chennai</option>
           <option value="coimbatore" ${dto.district == 'coimbatore' ? 'selected' : ''}>Coimbatore</option>
           <option value="madurai" ${dto.district == 'madurai' ? 'selected' : ''}>Madurai</option>
           <option value="salem" ${dto.district == 'salem' ? 'selected' : ''}>Salem</option>
           <option value="northgoa" ${dto.district == 'northgoa' ? 'selected' : ''}>North Goa</option>
           <option value="southgoa" ${dto.district == 'southgoa' ? 'selected' : ''}>South Goa</option>
       </select>
       <span>${districterror}</span>

        <label for="file">Select a File</label>
        <input type="file" id="file" name="file" required>

        <div class="button-container">
            <button type="submit">Update</button>
        </div>



        <div>
            <h3>${emailVerifys}</h3>
        </div>
    </form>
<footer>
    <div class="social-icons">
        <a href="#" aria-label="Facebook"><i class="fab fa-facebook"></i></a>
        <a href="#" aria-label="Twitter"><i class="fab fa-twitter"></i></a>
        <a href="#" aria-label="Instagram"><i class="fab fa-instagram"></i></a>
        <a href="#" aria-label="WhatsApp"><i class="fab fa-whatsapp"></i></a>
    </div>
    <div class="date-time" id="currentDateTime">January 9, 2025</div>
    <p>&copy; 2025 Party Registration. All Rights Reserved.</p>
</footer>

<script>
    function updateDistricts() {
        const state = document.getElementById('state').value;
        const districtSelect = document.getElementById('district');
        districtSelect.innerHTML = '<option value="">Select District</option>';
        const districts = {
            karnataka: ['Bangalore', 'Mysore', 'Hubli', 'Mangalore'],
            tamilnadu: ['Chennai', 'Coimbatore', 'Madurai', 'Salem'],
            goa: ['North Goa', 'South Goa']
        };
        if (districts[state]) {
            districts[state].forEach(district => {
                const option = document.createElement('option');
                option.value = district.toLowerCase().replace(/\s+/g, '');
                option.textContent = district;
                districtSelect.appendChild(option);
            });
        }
    }

    function validateForm() {
        const contact = document.getElementById('contact').value;
        return contact.length === 10 && /^\d+$/.test(contact);
    }
</script>
</body>
</html>
