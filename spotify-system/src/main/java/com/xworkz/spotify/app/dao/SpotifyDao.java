package com.xworkz.spotify.app.dao;

import com.xworkz.spotify.app.dto.SpotifyDto;

import java.util.List;

public interface SpotifyDao {
    boolean addsonglist(SpotifyDto spotifyDto);
    SpotifyDto getUserBySongName(String songName);
    SpotifyDto getSongById(int id);

   List<SpotifyDto> getAllSongs();
   boolean deleteSongById(int songId);


    void upDateSpotify(SpotifyDto spotifyDto);
}
