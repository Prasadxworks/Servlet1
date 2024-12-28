package com.xworkz.spotify.app.servlet;

import com.xworkz.spotify.app.service.SpotifyService;
import com.xworkz.spotify.app.service.SpotifyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        SpotifyService spotifyService = new SpotifyServiceImpl();
        boolean isDeleted = spotifyService.deleteSongById(Integer.parseInt(id));


        resp.sendRedirect(req.getContextPath()+"/getallsong");

//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getallspotifysongs.jsp");
//        requestDispatcher.forward(req , resp);
    }
}
