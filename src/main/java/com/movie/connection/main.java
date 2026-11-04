package com.movie.connection;

import java.util.Scanner;
import com.movie.dao.MovieDAO;
import com.movie.dao.BookingDAO;

public class main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieDAO movieDAO = new MovieDAO();
        BookingDAO bookingDAO = new BookingDAO();

        System.out.println("===== MOVIE TICKET BOOKING SYSTEM =====");

        movieDAO.displayMovies();

        System.out.print("Enter Movie ID: ");
        int movieId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Show Time: ");
        String showTime = sc.nextLine();

        double price = 0;

        if (movieId == 1) price = 200;
        else if (movieId == 2) price = 180;
        else if (movieId == 3) price = 150;

        if (price == 0 || tickets <= 0) {
            System.out.println("Invalid input!");
        } else {
            double total = price * tickets;

            System.out.println("Total Amount: Rs." + total);

            bookingDAO.bookTicket(
                name, email, movieId, tickets, showTime, total
            );
        }

        sc.close();
    }
}