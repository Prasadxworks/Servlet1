package com.xworkz.spotify.app.service;

import com.xworkz.spotify.app.dto.SpotifyDto;

import java.util.List;

public interface SpotifyService {
    boolean addsonglist(SpotifyDto spotifyDto);

       SpotifyDto getSongById(int id);

 SpotifyDto  getUserBySongName(String songName);

    List<SpotifyDto> getAllSongs();

    boolean deleteSongById(int songId);

    void updateSpotify(SpotifyDto spotifyDto);

//  SpotifyDto getSongId(int id);
}
