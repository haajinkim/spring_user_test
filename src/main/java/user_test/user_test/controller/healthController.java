package user_test.user_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class healthController {

    @GetMapping
    @ResponseBody
    public String healthCheck() {
        return "healthCheck";
    }
}
