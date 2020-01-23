package com.haile.songr.model;

import javax.persistence.*;
import java.util.StringJoiner;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String title;
    private int length;
    private int trackNumber;

    // Relationship between Song to Album would be many to one
    @ManyToOne
    AlbumEntry album;

    // Overloading an empty constructor to prevent the code from breaking
    public Song() {};

    public Song(AlbumEntry album, String title, int length, int trackNumber) {
        this.album = album;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public AlbumEntry setAlbum(AlbumEntry album) {
        return this.album = album;
    }

    public AlbumEntry getAlbum() {
        return this.album;
    }

}
