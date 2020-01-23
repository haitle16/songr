package com.haile.songr;

import com.haile.songr.model.AlbumEntry;
import com.haile.songr.model.AlbumEntryRepository;
import com.haile.songr.model.Song;
import com.haile.songr.model.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongrController {

    @Autowired
    AlbumEntryRepository repo;

    @Autowired
    SongRepository songRepo;

    @GetMapping("/")
    public RedirectView getHome(Model m) {
        m.addAttribute("username", "randomUsername");
        return new RedirectView("/albums");
    }

    @GetMapping("/hello/{world}")
    public String helloWorld(@PathVariable String world, Model m) {
        m.addAttribute("name", world);
        return "hello";
    }

    @GetMapping("/capitalize/{sentence}")
    @ResponseBody
    public String capitalize(@PathVariable String sentence) {
        return sentence.toUpperCase();
    }

    @GetMapping("/albums")
    public String albums(Model m) {
//        AlbumEntry[] firstAlbum = new AlbumEntry[] {
//            new AlbumEntry("Birds In The Trap Sing McKnight", "Travis Scott", 14, 2520,"https://i.pinimg.com/474x/77/fa/27/77fa27724cafb2018ab21f5bee31da8b.jpg"),
//                new AlbumEntry("You're The One", "Paul Simon", 11, 1980, "https://images-na.ssl-images-amazon.com/images/I/51COc%2BF78IL.jpg"),
//                new AlbumEntry("Frozen 2", "Idina Menzel, Kristen Bell, Josh Gad",11, 2058, "https://images-na.ssl-images-amazon.com/images/I/81yP4%2BK5g0L._SX522_.jpg")
//        };
        List<AlbumEntry> entries = repo.findAll();
        m.addAttribute("firstAlbum", entries);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbumEntry(String title, String artist, int songCount, int length, String imgUrl) {
        AlbumEntry newEntry = new AlbumEntry(title, artist, songCount, length, imgUrl);
        repo.save(newEntry);
        return new RedirectView("/albums");
    }

    @PostMapping("/albums/{id}/songs")
    public RedirectView addSong(@PathVariable Long id, String title, int length, int trackNumber) {
        AlbumEntry album = repo.getOne(id);
        Song song = new Song(album, title, length, trackNumber);
//        AlbumEntry album = repo.getOne(id);
        song.setAlbum(album);
        songRepo.save(song);

        return new RedirectView("/albums");
    }




}
