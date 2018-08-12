
package io.github.benas.todolist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    public static final String INDEX = "index";

    @RequestMapping(value = {"/index", "/"})
    public String redirectToIndexPage() {
        return INDEX;
    }


}
