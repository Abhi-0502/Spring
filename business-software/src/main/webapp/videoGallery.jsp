<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Video Gallery - Network Techlab</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        /* Global Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        /* Video Gallery Section */
        .video-gallery-section {
            padding: 50px 0;
        }

        .video-box {
            text-align: center;
            margin-bottom: 30px;
        }

        .video-box h4 {
            margin-top: 10px;
            font-size: 1.25em;
            font-weight: bold;
        }

        .video-box p {
            color: #777;
            font-size: 0.95em;
        }

        /* Newsletter Section */
        .newsletter-section {
            background-color: #f4f4f4;
            padding: 30px;
            text-align: center;
        }

        .newsletter-section h3 {
            font-size: 1.75em;
            margin-bottom: 20px;
        }

        .newsletter-section form {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 10px;
        }

        .newsletter-section input {
            padding: 10px;
            font-size: 1em;
            width: 250px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        .newsletter-section button {
            padding: 10px 20px;
            font-size: 1em;
            border: none;
            background-color: #007BFF;
            color: white;
            border-radius: 4px;
            cursor: pointer;
        }

        .newsletter-section button:hover {
            background-color: #0056b3;
        }

        /* Footer Section */
        footer {
            background-color: #333;
            color: white;
            padding: 20px 0;
            text-align: center;
        }

        footer p {
            margin: 0;
        }

        footer ul {
            list-style-type: none;
            padding: 0;
        }

        footer ul li {
            display: inline;
            margin: 0 10px;
        }

        footer ul li a {
            color: white;
            text-decoration: none;
        }

        footer ul li a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<!-- Video Gallery Section -->
<section id="video-gallery" class="video-gallery-section">
    <div class="container">
        <h2>Our Business Requirement Videos</h2>
        <p>Explore our collection of videos showcasing our business requirements, solutions, and success stories. Watch now to learn more about how Network Techlab is making an impact in the tech industry.</p>

        <div class="row">
            <!-- Video 1 -->
            <div class="col-md-4">
                <div class="video-box">
                    <iframe width="100%" height="200" src="https://www.youtube.com/embed/samplevideo1" title="Business Requirement Video 1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <h4>Business Requirement Video 1</h4>
                    <p>Description of the first business requirement video.</p>
                </div>
            </div>

            <!-- Video 2 -->
            <div class="col-md-4">
                <div class="video-box">
                    <iframe width="100%" height="200" src="https://www.youtube.com/embed/samplevideo2" title="Business Requirement Video 2" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <h4>Business Requirement Video 2</h4>
                    <p>Description of the second business requirement video.</p>
                </div>
            </div>

            <!-- Video 3 -->
            <div class="col-md-4">
                <div class="video-box">
                    <iframe width="100%" height="200" src="https://www.youtube.com/embed/samplevideo3" title="Business Requirement Video 3" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <h4>Business Requirement Video 3</h4>
                    <p>Description of the third business requirement video.</p>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Newsletter Subscription -->
<section class="newsletter-section">
    <h3>Subscribe With Us</h3>
    <form action="#">
        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email">
        <button type="submit">Subscribe</button>
    </form>
</section>

<!-- Footer Section -->
<footer>
    <div class="footer-content">
        <p>&copy; 2024 Network Techlab (India) Limited. All Rights Reserved.</p>
        <ul>
            <li><a href="#">Terms of Use</a></li>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">Disclaimer</a></li>
            <li><a href="#">Sitemap</a></li>
        </ul>
    </div>
</footer>

<!-- Bootstrap JS & Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
