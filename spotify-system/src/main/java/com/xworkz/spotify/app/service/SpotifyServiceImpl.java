package com.xworkz.spotify.app.service;

import com.xworkz.spotify.app.dao.SpotifyDao;
import com.xworkz.spotify.app.dao.SpotifyDaoImpl;
import com.xworkz.spotify.app.dto.SpotifyDto;

import java.util.List;

public class SpotifyServiceImpl implements SpotifyService {

    SpotifyDao spotifyDao= new SpotifyDaoImpl();
    public boolean addsonglist(SpotifyDto spotifyDto) {
        boolean issongaddedtolist= false;
        if (spotifyDto!=null){
            issongaddedtolist=spotifyDao.addsonglist(spotifyDto);
        }
        return issongaddedtolist;
    }

    @Override
    public SpotifyDto getSongById(int id) {
        if (id > 0){
        }
        return spotifyDao.getSongById(id);
    }

    public SpotifyDto getUserBySongName(String songName) {
        System.out.println("Service Started");
        SpotifyDto spotifyDto =null;
       if (songName!=null && !songName.isEmpty()){
           spotifyDto=spotifyDao.getUserBySongName(songName);
       }
       System.out.println("Service Ended");

         return spotifyDto;

    }

    public List<SpotifyDto> getAllSongs() {
        return spotifyDao.getAllSongs();
    }

    @Override
    public boolean deleteSongById(int songId) {
        System.out.println("started");
        if (songId > 0) {
            System.out.println("deleted");
        }
        return spotifyDao.deleteSongById(songId);
    }

    @Override
    public void updateSpotify(SpotifyDto spotifyDto) {
        if (spotifyDto!=null){
           spotifyDao.upDateSpotify(spotifyDto);
        }
    }


}


