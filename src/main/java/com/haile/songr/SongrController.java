package com.haile.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongrController {

    @GetMapping("/")
    public String getHome(Model m) {
        m.addAttribute("username", "randomUsername");
        return "home";
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
        Album[] firstAlbum = new Album[] {
            new Album("Birds In The Trap Sing McKnight", "Travis Scott", 14, 2520,"https://i.pinimg.com/474x/77/fa/27/77fa27724cafb2018ab21f5bee31da8b.jpg"),
                new Album("You're The One", "Paul Simon", 11, 1980, "https://images-na.ssl-images-amazon.com/images/I/51COc%2BF78IL.jpg"),
                new Album("Frozen 2", "Idina Menzel, Kristen Bell, Josh Gad",11, 2058, "https://images-na.ssl-images-amazon.com/images/I/81yP4%2BK5g0L._SX522_.jpg")
        };
        m.addAttribute("firstAlbum", firstAlbum);
        return "albums";
    }



}
