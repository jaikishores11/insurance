<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle Service Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
        }
        nav {
            text-align: center;
            margin: 20px 0;
        }
        nav a {
            margin: 0 15px;
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
        }
        section {
            text-align: center;
            padding: 40px;
        }
        footer {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Vehicle Service Management</h1>
    </header>

    <nav>
        <a href="<c:url value='/register' />">Register</a>
        <a href="<c:url value='/login' />">Login</a>
        <a href="<c:url value='/admin' />">Admin</a>
        <a href="<c:url value='/services' />">Services</a>
        <a href="<c:url value='/booking' />">Book Service</a>
        <a href="<c:url value='/contact' />">Contact Us</a>
    </nav>

    <section>
        <h2>Your One-Stop Solution for Vehicle Services</h2>
        <p>We offer a wide range of vehicle services, including regular maintenance, repair, and specialized services for off-road vehicles. Book a service today and experience hassle-free vehicle management!</p>
    </section>

    <footer>
        <p>&copy; 2024 Vehicle Service Management. All rights reserved.</p>
    </footer>
</body>
</html>
