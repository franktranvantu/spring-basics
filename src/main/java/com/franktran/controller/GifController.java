package com.franktran.controller;

import com.franktran.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("android-explosion", LocalDate.of(2021, 3, 17), "Frank", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
