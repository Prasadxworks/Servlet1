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

@WebServlet("/fetch")
public class FetchSongServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

             String id =   req.getParameter("id");

        SpotifyService spotifyService= new SpotifyServiceImpl();
      SpotifyDto spotifyDto=  spotifyService.getSongById(Integer.parseInt(id));

         req.setAttribute("song",spotifyDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetch.jsp");
        requestDispatcher.forward(req,resp);
    }
}
