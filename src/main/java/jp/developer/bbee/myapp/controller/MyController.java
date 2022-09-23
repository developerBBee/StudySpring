package jp.developer.bbee.myapp.controller;

import jp.developer.bbee.myapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/form")
    private String form(@ModelAttribute User user) {
        return "index";
    }

    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }
}
