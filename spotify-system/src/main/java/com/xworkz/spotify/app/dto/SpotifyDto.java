package com.xworkz.spotify.app.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spotifysong")
public class SpotifyDto {

    @Id
    @Column(name="songId")
    @GenericGenerator(name="tt",strategy = "increment")
    @GeneratedValue(generator = "tt")
    private int songId;
    @Column(name = "songName")
    private String songName;
    @Column(name = "song_languages")
    private String language;
    @Column(name = "singerName")
    private String  singerName;


}
