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

@WebServlet("/update")
public class UpdateSpotifyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String songName = req.getParameter("songName");
        String singerName = req.getParameter("singerName");
        String langauge = req.getParameter("song_languages");



        SpotifyDto spotifyDto = new SpotifyDto();
        spotifyDto.setSongId(Integer.parseInt(id));
        spotifyDto.setSongName(songName);
        spotifyDto.setSingerName(singerName);
        spotifyDto.setLanguage(langauge);

        SpotifyService spotifyService = new SpotifyServiceImpl();
        spotifyService.updateSpotify(spotifyDto);

        req.setAttribute("updated ", "User Updated Sucessfully");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetch.jsp");
        requestDispatcher.forward(req, resp);


    }
}
