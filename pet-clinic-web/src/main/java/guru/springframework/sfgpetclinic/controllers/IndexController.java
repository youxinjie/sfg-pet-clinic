package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Xinjie on 2018/11/20 9:05 PM.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index() {
        return "index";
    }
}
