package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContoller {



    @RequestMapping({"","/","index","index.html"})
    public String returnIndexe() {
        return "index";
    }
}
