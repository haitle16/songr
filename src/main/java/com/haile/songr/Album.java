package com.haile.songr;

import java.sql.Date;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length; // song length in seconds
    private String imgUrl;

    public Album(String title, String artist, int songCount, int length, String imgUrl) {
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
