package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.movie.connection.DBConnection;

public class BookingDAO {

    public void bookTicket(String name, String email,
                           int movieId, int tickets,
                           String showTime, double total) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO bookings "
                    + "(customer_name, email, movie_id, tickets, show_time, total) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, movieId);
            ps.setInt(4, tickets);
            ps.setString(5, showTime);
            ps.setDouble(6, total);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Ticket Booked Successfully!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}