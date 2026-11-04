```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmation</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="container">
        <h1>Booking Successful!</h1>

        <h3>Thank you for booking with us.</h3>

        <p>Booking ID: ${bookingId}</p>
        <p>Customer Name: ${name}</p>
        <p>Movie: ${movie}</p>
        <p>Tickets: ${tickets}</p>
        <p>Show Time: ${showTime}</p>

        <a href="index.html">Book Another Ticket</a>
    </div>

</body>
</html>
```