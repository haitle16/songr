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


}
