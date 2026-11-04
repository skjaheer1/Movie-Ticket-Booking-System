package com.movie.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.movie.dao.BookingDAO;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        int tickets = Integer.parseInt(request.getParameter("tickets"));
        String showTime = request.getParameter("showTime");

        double price = 0;

        if (movieId == 1) {
            price = 200;
        } else if (movieId == 2) {
            price = 180;
        } else if (movieId == 3) {
            price = 150;
        }

        double total = price * tickets;

        BookingDAO dao = new BookingDAO();

        dao.bookTicket(name, email, movieId, tickets, showTime, total);

        response.setContentType("text/html");

        response.getWriter().println(
            "<h1>Ticket Booking Successful!</h1>" +
            "<h2>Total Amount: Rs. " + total + "</h2>"
        );
    }
}