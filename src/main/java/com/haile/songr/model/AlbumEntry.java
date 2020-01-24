package com.haile.songr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
public class AlbumEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private int songCount;
    private int length; // full album length in seconds
    private String imgUrl;

    // Relationship between Album to Song would be one album to many songs
    @OneToMany(mappedBy = "album")
    List<Song> songs;

    // setting default constructor with no arguments
    public AlbumEntry() {}

    public AlbumEntry(String title, String artist, int songCount, int length, String imgUrl) {
        this.songs = new LinkedList<>();
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }


    public List<Song> getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImgUrl() {
        return imgUrl;
    }


    public Long getId() { return this.id; }
}
