<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Zepto Dashboard</title>
    
    <!-- Bootstrap CSS for styling -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS (Optional for more customization) -->
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
        .card {
            margin-top: 20px;
        }
        .card-body {
            display: flex;
            justify-content: space-between;
        }
        .auth-links {
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <!-- Sidebar -->
    <div class="sidebar">
        <h4 class="text-white text-center">QuickShop Dashboard</h4>
        <a href="home.jsp">Home</a>
        <a href="orders.jsp">Orders</a>
        <a href="profile.jsp">Profile</a>
        <a href="settings.jsp">Settings</a>
        <a href="logout.jsp">Logout</a>
    </div>

    <!-- Main Content Area -->
    <div class="content">
        
        <!-- Check if the user is logged in -->
        <%
            String uname = (String) session.getAttribute("un");
            if (uname != null) {
        %>
        
        <!-- If logged in, display the dashboard -->
        <h2>Welcome, <%= uname %>!</h2>
        <p>You're successfully logged in to your quickshop account. Here's an overview of your account.</p>

        <!-- Dashboard Cards for Quick Overview -->
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">Recent Orders</div>
                    <div class="card-body">
                        <p class="card-text">You have 3 recent orders pending delivery.</p>
                        <a href="orders.jsp" class="btn btn-primary">View Orders</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">Account Balance</div>
                    <div class="card-body">
                        <p class="card-text">Your current balance is $150.</p>
                        <a href="profile.jsp" class="btn btn-primary">View Balance</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">Notifications</div>
                    <div class="card-body">
                        <p class="card-text">You have 2 unread notifications.</p>
                        <a href="notifications.jsp" class="btn btn-primary">View Notifications</a>
                    </div>
                </div>
            </div>
        </div>
        
        <% 
            } else {
        %>
        
        <!-- If not logged in, show login and registration links -->
        <h2>Welcome to Zepto!</h2>
        <p>You need to log in to access your account.</p>

        <div class="auth-links">
            <a href="login.jsp" class="btn btn-primary">Login</a>
            <a href="register.jsp" class="btn btn-secondary">Register</a>
        </div>
        
        <% 
            }
        %>
        
    </div>

    <!-- Bootstrap JS (for Bootstrap components like dropdown, modal, etc.) -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>