package com.xworkz.spotify.app.servlet;

import com.xworkz.spotify.app.dto.SpotifyDto;
import com.xworkz.spotify.app.service.SpotifyService;
import com.xworkz.spotify.app.service.SpotifyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/getallsong")
public class GetAllServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do Get Started");

        SpotifyService spotifyService = new SpotifyServiceImpl();
        List<SpotifyDto> dtos =spotifyService.getAllSongs();

        req.setAttribute("listOfSongs", dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getallspotifysongs.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("Do Get Ended");
    }
}