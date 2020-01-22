package com.haile.songr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class AlbumEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String title;
    private String artist;
    private int songCount;
    private int length; // song length in seconds
    private String imgUrl;

    // setting default constructor with no arguments
    public AlbumEntry() {}

    public AlbumEntry(String title, String artist, int songCount, int length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
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

}
