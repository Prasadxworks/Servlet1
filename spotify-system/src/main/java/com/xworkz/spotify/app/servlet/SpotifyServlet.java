package com.xworkz.spotify.app.servlet;


import com.xworkz.spotify.app.dto.SpotifyDto;
import com.xworkz.spotify.app.service.SpotifyService;
import com.xworkz.spotify.app.service.SpotifyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/mysong")
public class SpotifyServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String songName = req.getParameter("songName");
            String language = req.getParameter("Language");
            String singerName = req.getParameter("SingerName");

        SpotifyDto spotifyDto = new SpotifyDto();
        spotifyDto.setSongName(songName);
        spotifyDto.setLanguage(language);
        spotifyDto.setSingerName(singerName);

        SpotifyService spotifyService = new SpotifyServiceImpl();
        spotifyService.addsonglist(spotifyDto);

        req.setAttribute("key",songName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("thankyou.jsp");
        requestDispatcher.forward(req,resp);


    }

}
