package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.movie.connection.DBConnection;

public class MovieDAO {

    public void displayMovies() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM movies";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("----- AVAILABLE MOVIES -----");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("movie_id") + " | " +
                    rs.getString("movie_name") + " | Rs." +
                    rs.getDouble("ticket_price")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}