package jp.developer.bbee.myapp.controller;

import jp.developer.bbee.myapp.model.Inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/validate")
public class ValidateFormController {

    @GetMapping("/")
    public String index(@ModelAttribute Inquiry inquiry) {
        return "v_index";
    }

    @PostMapping("/")
    public String confirm(@Validated @ModelAttribute Inquiry inquiry,
                BindingResult result) {
        if (result.hasErrors()) {
            return "v_index";
        }
        return "v_confirm";
    }
}
