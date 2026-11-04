package com.movie.connection;

import com.movie.dao.MovieDAO;

public class TestConnection {

    public static void main(String[] args) {

        MovieDAO dao = new MovieDAO();

        dao.displayMovies();
    }
}