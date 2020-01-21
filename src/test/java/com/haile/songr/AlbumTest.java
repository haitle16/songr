package com.haile.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    Album firstAlbum;

    @Test
    public void albumConstructorTest() {
        firstAlbum = new Album("Birds In The Trap Sing McKnight", "Travis Scott", 14, 2520, "https://i.pinimg.com/474x/77/fa/27/77fa27724cafb2018ab21f5bee31da8b.jpg");
        assertEquals("Birds In The Trap Sing McKnight", firstAlbum.getTitle());
        assertEquals("Travis Scott", firstAlbum.getArtist());
        assertEquals(14, firstAlbum.getSongCount());
        assertEquals(2520, firstAlbum.getLength());
        assertEquals("https://i.pinimg.com/474x/77/fa/27/77fa27724cafb2018ab21f5bee31da8b.jpg", firstAlbum.getImgUrl());
    }

}
