<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up - Marg ERP Cloud</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: Gray;
            margin: 0;
            padding: 0;
            color: #333;
        }

        header {
            background-color: #0061f2;
            color: white;
            padding: 30px;
            text-align: center;
            font-size: 32px;
            font-weight: bold;
            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
            border-bottom: 3px solid #004bb5;
        }

        .main-container {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            margin-top: 40px;
        }

        .form-container {
            background-color: white;
            box-shadow: 0 8px 40px rgba(0, 0, 0, 0.1);
            border-radius: 12px;
            padding: 50px;
            width: 100%;
            max-width: 800px;
            margin: 20px;
            text-align: center;
        }

        .form-container h2 {
            color: #0061f2;
            margin-bottom: 30px;
            font-size: 30px;
        }

        .form-group {
            margin-bottom: 20px;
            display: flex;
            justify-content: space-between;
        }

        .form-group label {
            font-weight: bold;
            color: #555;
            display: block;
            margin-bottom: 8px;
            width: 100%;
        }

        .form-group input, .form-group select {
            width: 48%;
            padding: 14px;
            font-size: 16px;
            border-radius: 10px;
            border: 1px solid #ddd;
            background-color: #fafafa;
            margin-top: 5px;
        }

        .form-group input:focus, .form-group select:focus {
            border-color: #0061f2;
            outline: none;
        }

        .btn-submit {
            background-color: #0061f2;
            color: white;
            padding: 14px;
            border: none;
            border-radius: 10px;
            font-size: 18px;
            cursor: pointer;
            width: 100%;
            transition: background-color 0.3s ease;
            margin-top: 20px;
        }

        .btn-submit:hover {
            background-color: #004bb5;
        }

        .sign-in-link {
            margin-top: 20px;
            font-size: 14px;
            color: #555;
        }

        .sign-in-link a {
            color: #0061f2;
            text-decoration: none;
        }

        /* Features Section */
        .features-container {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 30px;
            margin-top: 40px;
            width: 100%;
            max-width: 1200px;
            flex-wrap: wrap;
        }

        .feature-slide {
            background-color: #fff;
            border-radius: 12px;
            box-shadow: 0 8px 40px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 380px;
            transition: transform 0.3s ease;
            overflow: hidden;
            margin-bottom: 30px;
        }

        .feature-slide:hover {
            transform: translateY(-10px);
        }

        .feature-image {
            width: 100%;
            height: 100%;
            object-fit: cover;
            border-radius: 12px;
        }

        .feature-text {
            padding: 20px;
            text-align: center;
        }

        .feature-text h3 {
            color: #0061f2;
            font-size: 24px;
            margin-bottom: 10px;
        }

        .feature-text p {
            font-size: 16px;
            color: #555;
        }

        @media (max-width: 768px) {
            .form-container, .features-container {
                width: 90%;
            }

            .form-group {
                flex-direction: column;
            }

            .form-group input, .form-group select {
                width: 100%;
            }
        }
    </style>
</head>
<body>

    <!-- Header Section -->
    <header>
        Marg ERP Cloud - Sign Up
    </header>

    <!-- Main Container with Form and Slideshow -->
    <div class="main-container">
        <!-- Sign Up Form -->
        <div class="form-container">
            <h2>Create Your Account</h2>
            <form action="SignUp" method="POST">
                <div class="form-group">
                    <label for="user-type">User Type *</label>
                    <select id="user-type" name="user-type" required>
                        <option value="new">New User</option>
                        <option value="existing">Existing User</option>
                    </select>
                    <label for="business-type">Business Type *</label>
                    <select id="business-type" name="business-type" required>
                        <option value="select">Select...</option>
                        <option value="retail">Retail</option>
                        <option value="wholesale">Wholesale</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="company-name">Company Name *</label>
                    <input type="text" id="company-name" name="company-name" required>
                    <label for="contact-person">Contact Person *</label>
                    <input type="text" id="contact-person" name="contact-person" required>
                </div>
                <div class="form-group">
                    <label for="mobile">Registered Mobile *</label>
                    <input type="text" id="mobile" name="mobile" required>
                    <label for="email">Registered Email *</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="address1">Address 1 *</label>
                    <input type="text" id="address1" name="address1" required>
                    <label for="address2">Address 2</label>
                    <input type="text" id="address2" name="address2">
                </div>
                <div class="form-group">
                    <label for="pincode">Pincode *</label>
                    <input type="text" id="pincode" name="pincode" required>
                    <label for="referral">Referral (Optional)</label>
                    <input type="text" id="referral" name="referral">
                </div>
                <div class="form-group">
                    <label for="password">Password *</label>
                    <input type="password" id="password" name="password" required>
                    <label for="confirmPassword">Confirm Password *</label>
                    <input type="password" id="confirmPassword" name="confirmPassword" required>
                </div>
                <button type="submit" class="btn-submit">Sign Up</button>
            </form>
            <div class="sign-in-link">
                <p>Already have an account? <a href="signIn.html">Sign In</a></p>
            </div>
        </div>

        <!-- Features Section -->
        <div class="features-container">
            <div class="feature-slide">

                <div class="feature-text">
                    <h3>Access From Anywhere</h3>
                    <p>Stay connected with your business at all times, no matter where you are.</p>
                </div>
            </div>

            <div class="feature-slide">
                <div class="feature-text">
                    <h3>Send Invoices on WhatsApp</h3>
                    <p>Effortlessly send invoices directly to customers through WhatsApp.</p>
                </div>
            </div>

            <div class="feature-slide">
                <div class="feature-text">
                    <h3>Data Protection</h3>
                    <p>Experience robust data encryption to ensure your business data is always safe.</p>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
