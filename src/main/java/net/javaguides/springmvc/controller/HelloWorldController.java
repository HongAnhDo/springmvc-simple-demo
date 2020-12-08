package net.javaguides.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ramesh Fadatare
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String handler(Model model) {

        model.addAttribute("helloWorld", "helloWorld");
        return "helloworld";
    }
}