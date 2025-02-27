<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Year Party Registration - Dashboard</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://wallpaperaccess.com/full/1668944.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            color: #333;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
        }
        header {
            background: rgb(10, 10, 10);
            padding: 15px 0;
        }
        header .nav-link {
            color: #fff;
            font-weight: bold;
            text-transform: uppercase;
            margin-right: 15px;
        }
        header .nav-link:hover {
            color: #00c6ff;
        }
        footer {
            background: rgb(10, 10, 10);
            color: #fff;
            padding: 20px;
            text-align: center;
            margin-top: auto;
        }
        footer .social-icons a {
            color: #fff;
            margin: 0 10px;
            font-size: 20px;
            transition: color 0.3s;
        }
        footer .social-icons a:hover {
            color: #00c6ff;
        }
        .dashboard {
            padding: 40px;
        }
        .card {
            border-radius: 15px;
            background: #fff;
            color: #333;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            opacity: 0;
            transform: translateY(20px);
            transition: all 0.5s ease;
        }
        .card.show {
            opacity: 1;
            transform: translateY(0);
        }
        .btn-dashboard {
            color: #fff;
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            border: none;
            padding: 10px 20px;
            text-transform: uppercase;
            font-weight: bold;
        }
        .btn-dashboard:hover {
            background: linear-gradient(135deg, #00eaff, #0054e0);
            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.3);
        }
    </style>
</head>
<body>

    <header class="text-white py-3">
        <div class="container d-flex justify-content-between align-items-center">
            <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" height="50" width="120" alt="logo">

            <h3 class="text-uppercase">Happy New Year</h3>
            <nav class="d-flex">
                <a href="#" class="nav-link">Home</a>
                <a href="signin" class="nav-link">Sign In</a>
                <a href="signup" class="nav-link">Sign Up</a>
                <a href="#about" class="nav-link">About Us</a>
            </nav>
        </div>
    </header>

    <main class="flex-grow-1 dashboard">
        <div class="container">
            <div class="row text-center mb-4">
                <h2 class="text-uppercase">Dashboard</h2>
            </div>
            <div class="row g-4">
                <div class="col-md-4">
                    <div class="card p-4 text-center">
                        <h5>Total Registrations</h5>
                        <p id="totalRegistrations" class="fs-2">150</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4 text-center">
                        <h5>Event Date</h5>
                        <p id="eventDate" class="fs-4">01-01-2025</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4 text-center">
                        <h5>Available Seats</h5>
                        <p id="availableSeats" class="fs-2">20000</p>
                    </div>
                </div>
            </div>

            <div class="row mt-5 text-center">
                <h4 class="mb-4">Quick Links</h4>
                <div class="col-md-4">
                    <a href="register.html" class="btn btn-dashboard">Register Now</a>
                </div>
                <div class="col-md-4">
                    <a href="manage.html" class="btn btn-dashboard">Manage Registrations</a>
                </div>
                <div class="col-md-4">
                    <a href="contact.html" class="btn btn-dashboard">Contact Us</a>
                </div>
            </div>
        </div>
    </main>

    <footer>
        <p>&copy; 2025 New Year Party | All Rights Reserved</p>
        <div class="social-icons">
            <a href="https://www.instagram.com" target="_blank"><i class="fab fa-instagram"></i></a>
            <a href="https://www.whatsapp.com" target="_blank"><i class="fab fa-whatsapp"></i></a>
            <a href="https://www.twitter.com" target="_blank"><i class="fab fa-twitter"></i></a>
            <a href="https://www.facebook.com" target="_blank"><i class="fab fa-facebook"></i></a>
        </div>
        <div class="current-time" id="currentTime"></div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        function updateTime() {
            const now = new Date();
            const formattedTime = now.toLocaleString('en-US', {
                weekday: 'long',
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                hour: '2-digit',
                minute: '2-digit',
                second: '2-digit',
                hour12: true
            });
            document.getElementById('currentTime').textContent = formattedTime;
        }

        function fetchDashboardData() {
            fetch('http://localhost:5000/api/dashboard') // Update with your API URL
                .then(response => response.json())
                .then(data => {
                    document.getElementById('totalRegistrations').textContent = data.totalRegistrations;
                    document.getElementById('eventDate').textContent = new Date(data.eventDate).toLocaleDateString('en-US', {
                        year: 'numeric',
                        month: 'long',
                        day: 'numeric'
                    });
                    document.getElementById('availableSeats').textContent = Math.max(0, 150 - data.totalRegistrations); // Assuming 150 total seats
                })
                .catch(error => console.error('Error fetching dashboard data:', error));
        }

        document.addEventListener('DOMContentLoaded', () => {
            updateTime();
            setInterval(updateTime, 1000);

            // Trigger animations
            const cards = document.querySelectorAll('.card');
            cards.forEach((card, index) => {
                setTimeout(() => {
                    card.classList.add('show');
                }, index * 200);
            });

            // Fetch dashboard data
            fetchDashboardData();
        });
    </script>
</body>
</html>
