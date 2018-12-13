package com.docker_hey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeyController {

    @GetMapping("/")
    public String getHey()
    {
        return "hey";
    }


}
