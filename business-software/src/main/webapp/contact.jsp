
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>

    <!-- Meta Tags for SEO -->
    <meta name="description" content="Optimize application performance with AI-driven resource management. Contact Network Techlab today for your IT solutions.">
    <meta name="keywords" content="Cloud Optimization, IT Services, AI, Automation, Database Performance, Network Security">
    <meta name="author" content="Network Techlab">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins&family=Roboto+Slab&display=swap" rel="stylesheet">

    <style>
        /* General Styles */
        body {
            font-family: 'Poppins', sans-serif;
            background-color: Gray;
       /* background-image: url('https://rvu.edu.in/wp-content/themes/rvu/images/sod_bg.png'); */
            background-size: cover;
            background-attachment: fixed;
            color:black;
            min-height: 100vh;
        }

        .empty {
            width: 100%;
            height: 100vh;
            background-color: blue;
            position: absolute;
            top: 0;
            left: 0;
            z-index: -1;
        }

        /* Navbar */
        .navbar {
            background-color: #001f3f;
        }

        .navbar-brand,
        .nav-link {
            color: white !important;
            font-weight: 800;
        }

        .nav-link:hover {
            color: #f8c146 !important;
        }

        /* Hero Section */
        .hero {

            color: white;
            text-align: center;
            padding: 120px 20px;
            position: relative;
        }

        .hero h1 {
            font-size: 3rem;
            font-weight: bold;
        }

        .hero p {
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        .hero .btn {
            font-size: 1rem;
            padding: 10px 20px;
            border-radius: 30px;
        }

        .hero .btn-primary {
            background-color: #f8c146;
            border: none;
            transition: 0.3s;
        }

        .hero .btn-primary:hover {
            background-color: #ff9900;
        }

        /* White Section for Logo, Phone, and Search Bar */
        .white-section {
            background-color: white;
            color: black;
            padding: 5px 0;
        }

        .contact-search-container .search-bar {
            max-width: 400px;
            margin: 0 auto;
        }


        /* Contact Form styling */
        .contact-form {
            flex: 1;
            max-width: 600px;
            margin: 20px auto;
            padding: 30px;
            background: rgba(255, 255, 255, 0.2);
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            backdrop-filter: blur(12px);
            text-align: center;
            border: 1px solid rgba(255, 255, 255, 0.3);
        }

        .contact-form h2 {
            margin-bottom: 20px;
            color: #fff;
            font-size: 24px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group input,
        .form-group textarea {
            width: 100%;
            padding: 12px;
            border-radius: 8px;
            border: 1px solid rgba(255, 255, 255, 0.5);
            background: rgba(255, 255, 255, 0.7);
            color: #000;
            font-size: 16px;
        }

        .form-group textarea {
            resize: none;
            height: 120px;
        }

        .btn {
            background: #007BFF;
            color: #fff;
            padding: 20px;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            border: none;
            font-size: 16px;
            transition: 0.3s ease;
        }

        .btn:hover {
            background: #0056b3;
        }

        /* Layout adjustments for contact form and address */
        .content {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            margin-top: 50px;
            padding: 0 20px;
          }

        .content-form {
            flex: 3;
            max-width: 600px;
            margin-right: 30px;
        }

        .contact-info {
            flex: 1;
            max-width: 600px;
        }

        iframe {
            width: 100%;
            height: 350px;
            border: 0;
        }

        .section {
            margin-bottom: 30px;
        }

        .section h2 {
            font-size: 20px;
            color: #fff;
        }

        .section p {
            font-size: 16px;
            color: #fff;
        }

        /* Change Contact Content Icon Colors */
        .section i {
             icon-size :20px;
            color: #007BFF;
        }

        /* Add Hover Effect to Icons */
        .section i:hover {
            color: #ff9900;
        }

     /* Footer Styles */
     .footer {
         background: linear-gradient(135deg, #0a192f, #001f3f); /* Gradient Dark Blue */
         color: #ffffff;
         padding: 60px 0;
         text-align: center;
     }

     .footer-heading {
         color: #ffcc00; /* Bright Gold */
         font-weight: 900;
         font-size: 25px;
         margin-bottom: 20px;
         text-transform: uppercase;
         letter-spacing: 1px;
     }

     .col-md-4 p {
         font-size: 17px;
         line-height: 1.6;
         margin: 0;
}
     .footer-link {
         color: rgba(255, 255, 255, 0.8);
         text-decoration: none;
         font-size: 20px;
         transition: all 0.3s ease-in-out;
     }

     .footer-link:hover {
         color: #ffcc00;
         text-decoration: underline;
     }

     .footer-text {
         font-size: 19px;
         color: rgba(255, 255, 255, 0.9);
     }

     /* FAQ Section */
     .faq-item p {
         font-size: 19px;
         color: rgba(220, 220, 220, 0.8);
         line-height: 1.6;
     }

     /* Social Icons */
     .social-icons a {
         color: #ffcc00;
         font-size: 28px;
         margin: 0 12px;
         transition: transform 0.3s ease, color 0.3s ease;
     }

     .social-icons a:hover {
         color: #ffffff;
         transform: scale(1.2);
     }

     /* Newsletter Input & Button */
     .form-control {
         border-radius: 25px;
         padding: 14px;
         border: 2px solid #ffcc00;
         width: 100%;
         background: transparent;
         color: #ffffff;
     }

     .form-control::placeholder {
         color: white;
     }

     .btn-primary {
         border-radius: 25px;
         width: 100%;
         padding: 14px 0;
         border: none;
         background: #ffcc00;
         color: #0a192f;
         font-weight: bold;
         font-size: 18px;
         transition: all 0.3s ease-in-out;
     }

     .btn-primary:hover {
         background: Gray;
         color: #0a192f;
         box-shadow: 0px 4px 10px rgba(255, 204, 0, 0.4);
     }


    </style>
</head>

<body>
    <!-- Navbar (Main) -->
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Power Culture</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">About</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Solutions</a></li>
                    <li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- White Section for Logo, Phone, and Search Bar -->
    <div class="white-section">
        <div class="container d-flex justify-content-between align-items-center py-3">
            <div>
                <img src="https://th.bing.com/th/id/OIP.4AsUvGJtrrINR8Gs8tUhRwAAAA?rs=1&pid=ImgDetMain.jpg"
                    alt="Network Techlab Logo" width="150" height="50" class="img-fluid">
            </div>
            <div>
                <i class="fas fa-phone"></i> Call Us At: +91 7208753495
            </div>
            <div class="contact-search-container">
                <div class="search-bar d-flex">
                    <label for="search" class="me-2"><strong>Find Keywords:</strong></label>
                    <input type="text" id="search" placeholder="Search for Network Security, IT Solutions, or more..." class="form-control me-2" aria-label="Search bar for network security, IT solutions, etc." />
                    <button type="button" class="btn btn-primary"><i class="fas fa-search"></i></button>
                </div>
            </div>
        </div>
    </div>


    <!-- Secondary Navbar -->
    <nav class="navbar navbar-expand-lg secondary-navbar">

        <div class="container">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#secondaryNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="secondaryNavbar">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarServices" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">Our Services</a>
                        <ul class="dropdown-menu" aria-labelledby="navbarServices">
                            <li><a class="dropdown-item" href="#">Data Center Services</a></li>
                            <li><a class="dropdown-item" href="#">Power Energy Efficiency Services</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarSolutions" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">Our Solutions</a>
                        <ul class="dropdown-menu" aria-labelledby="navbarSolutions">
                            <li><a class="dropdown-item" href="#">Information Technology</a></li>
                            <li><a class="dropdown-item" href="#">Cyber Security</a></li>
                        </ul>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#">Resources</a></li>
                    <li class="nav-item"><a class="nav-link" href="blog">Blog</a></li>
                    <li class="nav-item"><a class="nav-link" href="videoGallery">Video Gallery</a></li>
                  <li class="nav-item"><a class="nav-link" href="contact">Contact Us</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Contact Content -->
 <form id="Contact Us" action="from"  method="Post">
   <h3>${saveError}</h3>
    <div class="content">
        <!-- Left side (Contact Form) -->
        <div class="contact-form">
            <h2>Get in Touch</h2>
                <div class="form-group">
                    <input type="text"  name = "name" placeholder="Full Name"  required>
                    <span>${nameError}</span>
                </div>
                <div class="form-group">
                    <input type="email" name = "email" placeholder="Email Address"  required>
                    <span>${emailError}</span>
                </div>

                <div class = "form-group">
                <input type = "text"  name = "phoneNo" placeholder="Phone Number"  required>
                <span>${phoneNoError}</span>
                </div>

                <div class = "form-group">
                 <input type = "text" name = "companyName"  placeholder="Company Name" required>
                 <span>${companyNameError}</span>
                  </div>

                <div class="form-group">
                    <textarea placeholder="Type your message..."  required></textarea>
                    <span>${messageError}</span>
                </div>
                <button type="submit" class="btn">Send Message</button>

            </form>
        </div>

        <!-- Right side (Address, Phone, Location) -->
        <div class="contact-info">
            <div class="section">
                <i class="fa fa-map-marker" aria-hidden="true"></i>
                <h2>Address</h2>
                <p>Bangalore, Karnataka, India</p>
            </div>
            <div class="section">
                <i class="fa fa-phone" aria-hidden="true"></i>
                <h2>Phone</h2>
                <p>123-456-7890</p>
            </div>
            <div class="section">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <h2>E-mail</h2>
                <p>dghdgqd@temporary.net</p>
            </div>

            <!-- Google Map -->
            <div class="section">
                <h2>Location</h2>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3782.1414007592276!2d76.93004071474833!3d12.971634390516679!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bb1b1b7c1c6f9c3%3A0x1d1db8c2c3f8b073!2sBangalore!5e0!3m2!1sen!2sin!4v1658599067483!5m2!1sen!2sin" allowfullscreen="" loading="lazy"></iframe>
            </div>
        </div>
    </div>

<footer class="footer">
    <div class="container">
        <div class="row">
            <!-- Company Info Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Company</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="footer-link">About Us</a></li>
                    <li><a href="#" class="footer-link">Careers</a></li>
                    <li><a href="#" class="footer-link">Privacy Policy</a></li>
                    <li><a href="#" class="footer-link">Terms & Conditions</a></li>
                </ul>
            </div>

            <!-- Corporate Office Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Corporate Office</h5>
                <p><strong>POWER SOLUTIONS PVT LTD</strong><br>
                Office Number 501, 502, Teerth Exchange,<br>
                Sr No.45 1A/1, Pune Bangalore Highway, Baner,<br>
                Pune, Maharashtra, 411045 IN</p>
            </div>

               <!-- Services & Solutions Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Our Services</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="footer-link">Data Center Services</a></li>
                    <li><a href="#" class="footer-link">Power Energy Efficiency Services</a></li>
                </ul>

                <h5 class="footer-heading mt-4">Our Solutions</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="footer-link">Information Technology</a></li>
                    <li><a href="#" class="footer-link">Cyber Security</a></li>
                </ul>
            </div>


        <div class="row">
            <!-- FAQ Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Frequently Asked Questions</h5>
                <div class="faq-item">
                    <strong>Q: How can I reach customer support?</strong>
                    <p>A: You can contact us via email at support@example.com.</p>
                </div>
                <div class="faq-item">
                    <strong>Q: What are your support hours?</strong>
                    <p>A: Our team is available Monday to Friday, 9 AM - 5 PM (EST).</p>
                </div>
            </div>

            <!-- Quick Links Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Quick Links</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="footer-link">Video Gallery</a></li>
                    <li><a href="#" class="footer-link">Blog</a></li>
                    <li><a href="#" class="footer-link">Contact Us</a></li>
                </ul>
            </div>

            <!-- Newsletter & Social Section -->
            <div class="col-md-4 mb-4">
                <h5 class="footer-heading">Stay in Touch</h5>
                <p class="footer-text">Sign up for our newsletter to get the latest updates and offers.</p>
                <form>
                    <input type="email" class="form-control mb-3" placeholder="Enter your email" />
                    <button type="submit" class="btn btn-primary">Subscribe</button>
                </form>

                <div class="social-icons">
                    <a href="#" class="social-icon"><i class="fab fa-facebook"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-linkedin"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-12 text-center mt-4">
                <p class="footer-text">&copy; 2025 Company Name. All Rights Reserved.</p>
            </div>
        </div>
    </div>
</footer>



    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
