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
@WebServlet ("/getdetails")
public class GetSongNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //processing logic
        String songName = req.getParameter("songName");
        SpotifyService spotifyService = new SpotifyServiceImpl();
        SpotifyDto spotifyDto= spotifyService.getUserBySongName(songName);

        req.setAttribute("key",spotifyDto);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getsongname.jsp");
        requestDispatcher.forward(req,resp);
    }
}
