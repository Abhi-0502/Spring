<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Updated</title>
</head>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        line-height: 1.6;
        margin: 0;
        padding: 0;
        background-color: #f4f4f9;
        color: #333;
    }

    h2 {
        text-align: center;
        color: #444;
        margin-top: 20px;
    }

    form {
        width: 100%;
        max-width: 600px;
        margin: 20px auto;
        background: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .form-group {
        margin-bottom: 20px;
    }

    label {
        display: block;
        font-weight: bold;
        margin-bottom: 5px;
    }

    .input-wrapper {
        position: relative;
    }

    input,
    select,
    button {
        width: 100%;
        padding: 10px;
        font-size: 14px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input:focus,
    select:focus {
        outline: none;
        border-color: #5a9;
        box-shadow: 0 0 5px rgba(90, 154, 233, 0.5);
    }

    .show-hide-btn {
        position: absolute;
        top: 50%;
        right: 10px;
        transform: translateY(-50%);
        background: none;
        border: none;
        font-size: 12px;
        color: #007BFF;
        cursor: pointer;
        padding: 0;
    }

    .show-hide-btn:hover {
        text-decoration: underline;
    }

    select {
        cursor: pointer;
    }

    .error {
        color: red;
        font-size: 12px;
        margin-top: 5px;
    }

    .form-buttons {
        display: flex;
        justify-content: space-between;
    }

    .form-buttons input {
        width: 48%;
        background: #007BFF;
        color: #fff;
        border: none;
        cursor: pointer;
        transition: background 0.3s ease;
    }

    .form-buttons input[type="reset"] {
        background: #6c757d;
    }

    .form-buttons input:hover {
        background: #0056b3;
    }

    .form-buttons input[type="reset"]:hover {
        background: #5a6268;
    }

    @media (max-width: 600px) {
        form {
            padding: 15px;
        }

        .form-buttons {
            flex-direction: column;
        }

        .form-buttons input {
            width: 100%;
            margin-bottom: 10px;
        }
    }
</style>

<body>
    <h2>This is the updated page</h2>

    <!-- Registration Form -->
    <form id="registrationForm" action="update" method="post" onsubmit="return validateForm()">

        <input type="hidden" name="id" value="${dto.getId()}" />

        <div class="form-row">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <div class="input-wrapper">
                    <input type="text" id="firstName" name="firstName" placeholder="Enter firstname" value="${dto.firstName}" required>
                </div>
            </div>

            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <div class="input-wrapper">
                    <input type="text" id="lastName" name="lastName" placeholder="Enter last name" value="${dto.lastName}" required>
                    <span>${lastNameError}</span>
                </div>
            </div>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <div class="input-wrapper">
                <input type="email" id="email" name="email" placeholder="Enter email" value="${dto.email}" required>
                <span>${emailError}</span>
            </div>
        </div>

        <div class="form-group">
            <label for="alterEmail">Alternate Email:</label>
            <div class="input-wrapper">
                <input type="email" id="alterEmail" name="alterEmail" placeholder="Enter alternate email" value="${dto.alterEmail}" required>
                <span>${alterEmailError}</span>
            </div>
        </div>

        <div class="form-group">
            <label for="contact">Contact:</label>
            <div class="input-wrapper">
                <input type="tel" id="contact" name="contact" placeholder="Enter contact" value="${dto.contact}" required>
                <span>${contactError}</span>
            </div>
        </div>

        <div class="form-group">
            <label for="alternativeContact">Alternate Contact:</label>
            <div class="input-wrapper">
                <input type="tel" id="alternativeContact" name="alternativeContact" placeholder="Enter alternate contact" value="${dto.alternativeContact}" required>
                <span>${alternativeContactError}</span>
            </div>
        </div>

        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <div class="input-wrapper">
                <input type="date" id="dob" name="dob" placeholder="Enter date of birth" value="${dto.dob}" required>
                <span>${dobError}</span>
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
                <span>${stateError}</span>
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
                <span>${districtError}</span>
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
                <span>${placeError}</span>
            </div>
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <div class="input-wrapper">
                <input type="password" id="password" name="password" placeholder="Enter password" value="${dto.password}" required>
                <span>${passwordError}</span>
                <button type="button" class="show-hide-btn" onclick="togglePassword('password')">Show</button>
            </div>
        </div>

        <div class="form-group">
            <label for="confirmPwd">Confirm Password:</label>
            <div class="input-wrapper">
                <input type="password" id="confirmPwd" name="confirmPwd" placeholder="Confirm password" value="${dto.confirmPwd}" required>
                <span>${confirmPwdError}</span>
                <button type="button" class="show-hide-btn" onclick="togglePassword('confirmPwd')">Show</button>
            </div>
        </div>

        <div id="error-message" class="error"></div>

        <div class="form-buttons">
            <input type="submit" value="Update">
            <input type="reset" value="Reset">
        </div>
    </form>
</body>
</html>
