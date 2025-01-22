<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Zepto Notifications</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .sidebar {
            height: 100vh;
            width: 250px;
            position: fixed;
            top: 0;
            left: 0;
            background-color: #343a40;
            padding-top: 20px;
        }
        .sidebar a {
            color: white;
            text-decoration: none;
            padding: 10px 15px;
            display: block;
        }
        .sidebar a:hover {
            background-color: #575757;
        }
        .content {
            margin-left: 270px;
            padding: 20px;
        }
    </style>
</head>
<body>

    <div class="sidebar">
        <h4 class="text-white text-center">QuickShop Dashboard</h4>
        <a href="home.jsp">Home</a>
        <a href="orders.jsp">Orders</a>
        <a href="profile.jsp">Profile</a>
        <a href="settings.jsp">Settings</a>
        <a href="logout.jsp">Logout</a>
    </div>

    <div class="content">
        <h2>Notifications</h2>

        <div class="card mt-4">
            <div class="card-header">Unread Notifications</div>
            <div class="card-body">
                <ul>
                    <li>New order placed: Order #12345</li>
                    <li>Your profile has been updated successfully.</li>
                    <li>You have a special discount on your next purchase!</li>
                </ul>
                <a href="profile.jsp" class="btn btn-primary">View Profile</a>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>