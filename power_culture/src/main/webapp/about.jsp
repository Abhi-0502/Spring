<!DOCTYPE html>
<html lang="en">
<head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>About Us | Power Culture</title>


      <!-- Bootstrap & FontAwesome (Optional) -->
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
      <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>

       <!-- Bootstrap CSS -->
              <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
              <!-- Font Awesome for Icons -->
              <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
           <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">


   <link rel="stylesheet" href="style.css">
   <link rel="stylesheet" href="ups.css">
   <link rel="stylesheet" href="about.css">

     <script defer src="script.js"></script>
</head>
<body>

<!-- Top Header with Contact Details & Social Media -->
<div class="top-header bg-dark text-light py-2">
    <div class="container d-flex justify-content-between align-items-center">
        <div class="contact-info">
            <i class="fas fa-envelope"></i> <a href="mailto:info@powerculture.in" class="text-light">info@powerculture.in</a>
            <span class="mx-3">|</span>
            <i class="fas fa-phone"></i> <a href="tel:+919876543210" class="text-light">+91 98765 43210</a>
        </div>
        <div class="social-icons">
            <a href="#" class="text-light mx-2"><i class="fab fa-facebook-f"></i></a>
            <a href="#" class="text-light mx-2"><i class="fab fa-twitter"></i></a>
            <a href="#" class="text-light mx-2"><i class="fab fa-youtube"></i></a>
            <a href="#" class="text-light mx-2"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
</div>


     <header class="bg-light shadow-sm">
         <nav class="navbar navbar-expand-lg navbar-light">
             <div class="container">
                 <!-- Logo -->
                 <a class="navbar-brand" href="#">
                     <img src="logo-transparent-png.jpg" alt="Power Culture" class="logo">
                 </a>
                 <!-- Mobile Toggle Button -->
                 <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                     <span class="navbar-toggler-icon"></span>
                 </button>
                 <!-- Navigation Links -->
                 <div class="collapse navbar-collapse" id="navbarNav">
                     <ul class="navbar-nav ms-auto">
                         <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>

                         <!-- Products Dropdown -->
                         <li class="nav-item dropdown">
                             <a class="nav-link dropdown-toggle" href="#" id="productsDropdown" role="button" data-bs-toggle="dropdown">Products</a>
                             <ul class="dropdown-menu">
                                 <li><a class="dropdown-item" href="UPS.jsp">UPS</a></li>
                                 <li><a class="dropdown-item" href="#">AI Data Center</a></li>
                                 <li><a class="dropdown-item" href="#">Precision Air Conditioner</a></li>
                                 <li><a class="dropdown-item" href="#">Server Racks</a></li>
                                 <li><a class="dropdown-item" href="#">KVM (Keyboard, Video, Mouse Switches)</a></li>
                                 <li><a class="dropdown-item" href="#">rPDU (Rack Power Distribution Unit)</a></li>
                                 <li><a class="dropdown-item" href="#">STS & ATS (Static & Automatic Transfer Switch)</a></li>
                                 <li><a class="dropdown-item" href="#">Lithium-ion & SMF Batteries</a></li>
                             </ul>
                         </li>

                         <!-- Services Dropdown -->
                         <li class="nav-item dropdown">
                             <a class="nav-link dropdown-toggle" href="#" id="servicesDropdown" role="button" data-bs-toggle="dropdown">Services</a>
                             <ul class="dropdown-menu">
                                 <li><a class="dropdown-item" href="#">Rentals (UPS, Batteries, etc.)</a></li>
                                 <li><a class="dropdown-item" href="#">AMC (Annual Maintenance Contract)</a></li>
                                 <li><a class="dropdown-item" href="#">Energy Audit</a></li>
                             </ul>
                         </li>

                         <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                         <li class="nav-item"><a class="nav-link" href="contact.jsp">Contact Us</a></li>
                     </ul>
                 </div>
             </div>
         </nav>
     </header>

 <!-- Hero Section -->
<section class="hero" id="hero">
    <div class="hero-background"></div>
    <div class="hero-overlay"></div>
    <div class="hero-content">
        <h1>Empowering Your Business with Cutting-Edge Power Solutions!</h1>
        <p>Reliable UPS, Data Centers, and Energy Efficiency for Maximum Uptime.</p>
        <a href="#contact" class="cta-btn">Get a Free Consultation</a>
    </div>
</section>

     <!-- About Section -->
     <section class="about">
         <div class="container">
             <h2 class="section-title">About US</h2>
             <div class="about-content">
                 <div class="about-text">
                     <p>
                         At <strong>Power Culture</strong>, we are more than just a power solutions provider we are a trusted partner in energy management, backup power, and smart infrastructure solutions.
                         Our mission is to empower businesses with cutting-edge technology that ensures uninterrupted power, enhanced efficiency, and optimized energy consumption.
                     </p>
                     <p>
                         With over a decade of experience, we have served industries ranging from IT, healthcare, telecom, manufacturing, and data centers.
                         We specialize in UPS systems, AI-driven energy management, lithium-ion & SMF batteries, precision air conditioners, and data center solutions.
                     </p>
                 </div>
                 <div class="about-image">
                     <img src="power_culture.jpg" alt="About Us">
                 </div>
             </div>
         </div>
     </section>

     <!-- Why Choose Us Section -->
     <section class="why-choose">
         <div class="container">
             <h2 class="section-title">Why Choose Power Culture?</h2>
             <div class="features">
                 <div class="feature">
                     <i class="fas fa-bolt"></i>
                     <h3>Reliable Power Solutions</h3>
                     <p>Our UPS systems** and **energy backup solutions guarantee **uninterrupted operations for critical industries.</p>
                 </div>
                 <div class="feature">
                     <i class="fas fa-lightbulb"></i>
                     <h3>Innovative Technology</h3>
                     <p>We integrate AI-powered energy management to enhance efficiency and optimize power consumption.</p>
                 </div>
                 <div class="feature">
                     <i class="fas fa-shield-alt"></i>
                     <h3>Trusted by Industries</h3>
                     <p>With 10+ years of expertise, we provide solutions trusted by IT, healthcare, and data centers globally.</p>
                 </div>
                 <div class="feature">
                     <i class="fas fa-globe"></i>
                     <h3>Sustainable Energy</h3>
                     <p>We prioritize eco-friendly energy solutions to reduce carbon footprint and enhance sustainability.</p>
                 </div>
             </div>
         </div>
     </section>

     <!-- Our Expertise Section -->
     <section class="expertise">
         <div class="container">
             <h2 class="section-title">Our Expertise</h2>
             <div class="expertise-content">
                 <div class="expertise-item">
                     <i class="fas fa-server"></i>
                     <h3>AI-Driven Data Centers</h3>
                     <p>Advanced AI-powered energy and cooling systems for data centers and IT infrastructures.</p>
                 </div>
                 <div class="expertise-item">
                     <i class="fas fa-plug"></i>
                     <h3>UPS & Power Backup</h3>
                     <p>High-efficiency UPS solutions for commercial, industrial, and critical applications.</p>
                 </div>
                 <div class="expertise-item">
                     <i class="fas fa-industry"></i>
                     <h3>Energy Audits & Consulting</h3>
                     <p>Comprehensive energy audits to reduce costs and maximize efficiency for businesses.</p>
                 </div>
                 <div class="expertise-item">
                     <i class="fas fa-battery-full"></i>
                     <h3>Lithium-Ion & SMF Batteries</h3>
                     <p>Reliable battery solutions for long-term, sustainable energy storage.</p>
                 </div>
             </div>
         </div>
     </section>

<!-- Client Testimonials Section -->
<section class="testimonials">
    <div class="container">
        <h2 class="section-title">What Our Clients Say</h2>

        <!-- Bootstrap Carousel with 3 Items per Slide -->
        <div id="testimonialCarousel" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div class="row">
                        <!-- Testimonial 1 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="" alt="Client 1" class="testimonial-img">
                                <p>"Power Culture transformed our data center with their AI-driven power solutions!"</p>
                                <h4 class="testimonial-name">- Sarah Johnson</h4>
                            </div>
                        </div>
                        <!-- Testimonial 2 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="client2.jpg" alt="Client 2" class="testimonial-img">
                                <p>"Their UPS systems are top-notch! We've had zero downtime!"</p>
                                <h4 class="testimonial-name">- Michael Lee</h4>
                            </div>
                        </div>
                        <!-- Testimonial 3 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="client3.jpg" alt="Client 3" class="testimonial-img">
                                <p>"Precision air conditioning and server racks are high quality!"</p>
                                <h4 class="testimonial-name">- Priya Sharma</h4>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Second Slide -->
                <div class="carousel-item">
                    <div class="row">
                        <!-- Testimonial 4 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="client4.jpg" alt="Client 4" class="testimonial-img">
                                <p>"Their lithium-ion batteries are long-lasting and reliable!"</p>
                                <h4 class="testimonial-name">- David Wilson</h4>
                            </div>
                        </div>
                        <!-- Testimonial 5 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="client5.jpg" alt="Client 5" class="testimonial-img">
                                <p>"The rental services are excellent and cost-effective!"</p>
                                <h4 class="testimonial-name">- Aisha Patel</h4>
                            </div>
                        </div>
                        <!-- Testimonial 6 -->
                        <div class="col-md-4">
                            <div class="testimonial-card">
                                <img src="client6.jpg" alt="Client 6" class="testimonial-img">
                                <p>"Great support and energy audit services for our company!"</p>
                                <h4 class="testimonial-name">- Robert King</h4>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Carousel Controls -->
            <button class="carousel-control-prev" type="button" data-bs-target="#testimonialCarousel" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#testimonialCarousel" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
</section>


<footer class="footer">
    <div class="container">
        <div class="row">
            <!-- Company Info -->
            <div class="col-md-3 mb-4 fade-in">
                <h5 class="footer-heading">Company</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="footer-link">About Us</a></li>
                    <li><a href="#" class="footer-link">Careers</a></li>
                    <li><a href="#" class="footer-link">Privacy Policy</a></li>
                    <li><a href="#" class="footer-link">Terms & Conditions</a></li>
                </ul>
            </div>

            <!-- Contact Information with Animated Logo -->
            <div class="col-md-3 mb-4 fade-in text-left">
                <h5 class="footer-heading">Corporate Office</h5>
                <p>
                    <strong>POWER CULTURE</strong><br>
                    1G, First Mark Daisy, 1st Main, Kudlu,<br>
                    Yashodamma Layout, Bengaluru - 560068<br>
                    <a href="https://www.powerculture.in" class="footer-link" target="_blank">www.powerculture.in</a>
                </p>
            </div>

            <!-- Quick Links -->
            <div class="col-md-3 mb-4 fade-in">
                <h5 class="footer-heading">FAQ</h5>
                <div class="faq-item">
                    <strong>Q: How can I reach customer support?</strong>
                    <p>A: You can contact us via email at support@example.com.</p>
                </div>
                <div class="faq-item">
                    <strong>Q: What are your support hours?</strong>
                    <p>A: Our team is available Monday to Friday, 9 AM - 5 PM (EST).</p>
                </div>
            </div>

            <!-- Social Media & Newsletter -->
                       <div class="col-md-3 mb-4 fade-in">
                           <h5 class="footer-heading">Stay Connected</h5>
                           <form>
                               <input type="email" class="form-control mb-3" placeholder="Enter your email" />
                               <button type="submit" class="btn btn-primary btn-animate">Subscribe</button>
                           </form>

                           <!-- Animated Social Icons -->
                           <div class="social-icons">
                               <a href="#" class="social-icon"><i class="fab fa-facebook-f"></i></a>
                               <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                               <a href="#" class="social-icon"><i class="fab fa-linkedin-in"></i></a>
                               <a href="#" class="social-icon"><i class="fab fa-instagram"></i></a>
                           </div>
                       </div>
                   </div>

        <!-- Copyright Section -->
        <div class="row">
            <div class="col-12 text-center mt-4">
                <p class="footer-text">&copy; 2025 Power Culture. All Rights Reserved.</p>
            </div>
        </div>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>


    </body>
    </html>
