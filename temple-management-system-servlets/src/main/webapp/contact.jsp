<!-- index.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>contact</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        .logo-header {
            float: left;
            margin-right: 20px;
            /* Adjust the margin and size as needed */
        }

        nav {
            background-color: #444;
            overflow: hidden;
        }

        nav a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        .login-icon {
            float: right;
            padding: 14px 16px;
        }

       footer {
                       background-color: #333;
                       color: #fff;
                       text-align: left;
                       padding: 5px;
                       position: sticky;
                       bottom: 0;
                       width: 100%;
               }

        .logo-footer {
            float: left;
            margin-right: 20px;
            /* Adjust the margin and size as needed */
        }
          #content-container {
                    min-height: 100vh;
                    padding-bottom: 60px; /* Adjust this value based on your footer's height */
                    box-sizing: border-box;
                }

                form {
                    background-color: #fff;
                    padding: 10px;
                    border-radius: 8px;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                    width: 40%; /* Adjust the width as needed */
                    margin: 20px auto; /* Center the form on the page */
                }

                h2 {
                    text-align: center;
                    color: #333;
                    font-size: 18px;
                }

                label {
                    display: block;
                    margin: 5px 0;
                    font-weight: bold;
                    font-size: 14px;
                }

                input,
                textarea {
                    width: 100%;
                    padding: 6px;
                    margin: 5px 0;
                    box-sizing: border-box;
                    border: 1px solid #ccc;
                    border-radius: 4px;
                    font-size: 14px;
                }

                input[type="submit"] {
                    width: auto; /* Allow the button to adjust its width */
                    background-color: #4caf50;
                    color: #fff;
                    padding: 6px 12px;
                    border: none;
                    border-radius: 4px;
                    cursor: pointer;
                    font-size: 14px;
                    margin-top: 10px;
                }

                input[type="submit"]:hover {
                    background-color: #45a049;
                }
    </style>
</head>
<body>
<div id="content-container">
    <header>
        <div class="logo-header">
            <img src="images/karnataka.jpeg" alt="Logo" height="50">
        </div>
        <h1>Spiritual Sanctuary</h1>
    </header>

    <nav>
        <a href="initial.jsp">Home</a>
        <a href="contact.jsp">Contact Us</a>
         <a href="aboutForm.jsp">About Us</a>
        <!-- Add more navigation links as needed -->
        <div class="login-icon">
            <!-- Add your login icon or button here -->
            <a href="Login.jsp">Admin Login</a>
        </div>
    </nav>


     <form action="processContactForm" method="post">
                <h2>Contact Us</h2>

                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="subject">Subject:</label>
                <input type="text" id="subject" name="subject" required>

                <label for="message">Message:</label>
                <textarea id="message" name="message" rows="4" required></textarea>

                <input type="submit" value="Submit">
            </form>
              </div>

    <footer>
        <div class="logo-footer">
            <!-- Add your logo image here -->
            <img src="images/karnataka.jpeg" alt="Logo" height="20">
        </div>
        <!-- Add additional footer content as needed -->
        © 2024 Spiritual Sanctury. All rights reserved.
    </footer>

</body>
</html>
