package ca.gbc.gbccomp3095pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping({
            "",
            "/",
            "index",
            "index.html"
    })
    public String index(){
        return "index";
    }

    @RequestMapping({

            "/oups",
    })
    public String oupsHandler(){
        return "notimplemented";
    }
}
