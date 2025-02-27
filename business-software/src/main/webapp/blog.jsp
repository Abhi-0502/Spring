<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Blog - Network Techlab</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

    <style>
        /* Global Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        /* Blog Section */
        .blog-section {
            padding: 50px 0;
        }

        .blog-post {
            display: flex;
            margin-bottom: 30px;
            border-bottom: 1px solid #ddd;
            padding-bottom: 20px;
        }

        .blog-image {
            width: 200px;
            height: 150px;
            object-fit: cover;
            margin-right: 20px;
        }

        .blog-content {
            max-width: 800px;
        }

        .blog-content h3 {
            font-size: 1.5em;
            margin-bottom: 10px;
        }

        .read-more {
            text-decoration: none;
            color: #007BFF;
            font-weight: bold;
        }

        .post-date {
            color: #777;
            font-size: 0.9em;
        }
    </style>
</head>
<body>

<!-- Blog Section -->
<section id="blog" class="blog-section">
    <div class="container">
        <h2>Blog</h2>

        <!-- Single Blog Post -->
        <div class="blog-post">
            <img src="<%= request.getAttribute("image1") %>" alt="Blog Image 1" class="blog-image">
            <div class="blog-content">
                <h3>Network Techlab: Your Partner in Solar Power</h3>
                <p>In a world where sustainability is no longer optional, solar energy stands out as a beacon of hope. Harnessing the sun’s power not only reduces electricity bills but also supports...</p>
                <a href="<%= request.getAttribute("url1") %>" class="read-more">Read More</a>
                <p class="post-date"><%= request.getAttribute("date1") %> | Blogs</p>
            </div>
        </div>

        <!-- Single Blog Post -->
        <div class="blog-post">
            <img src="<%= request.getAttribute("image2") %>" alt="Blog Image 2" class="blog-image">
            <div class="blog-content">
                <h3>How Network Monitoring Tools Help You Stay One Step Ahead of Threats</h3>
                <p>In today’s digital era, businesses depend heavily on their IT networks to drive efficiency, ensure seamless communication, and meet customer expectations. However, this reliance also makes networks vulnerable to security...</p>
                <a href="<%= request.getAttribute("url2") %>" class="read-more">Read More</a>
                <p class="post-date"><%= request.getAttribute("date2") %> | Uncategorised</p>
            </div>
        </div>

        <!-- Single Blog Post -->
        <div class="blog-post">
            <img src="<%= request.getAttribute("image3") %>" alt="Blog Image 3" class="blog-image">
            <div class="blog-content">
                <h3>Why Video Surveillance is Key to Your Physical Security Strategy</h3>
                <p>In today’s fast-paced world, securing your property, assets, and personnel has never been more critical. With evolving threats to physical security, businesses and organizations must implement effective security measures...</p>
                <a href="<%= request.getAttribute("url3") %>" class="read-more">Read More</a>
                <p class="post-date"><%= request.getAttribute("date3") %> | Uncategorised</p>
            </div>
        </div>
    </div>
</section>

<!-- Bootstrap JS & Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
