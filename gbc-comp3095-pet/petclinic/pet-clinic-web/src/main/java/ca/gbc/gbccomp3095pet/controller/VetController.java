package ca.gbc.gbccomp3095pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetController {

    @RequestMapping({
            "",
            "/",
            "index",
            "index.html"
    })
    public String listVet(){
        return"vet/index";
    }
}
