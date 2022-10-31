package org.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Locale;

@Controller
public class IndexController {

    // HTTP GET localhost:8080//
    //@RequestMapping(value = "/", method = RequestMethod.GET)

    @GetMapping("/")
    public String index(Locale locale, Model model, HttpServletRequest request){

        LocalDateTime localDataTime = LocalDateTime.now();
        model.addAttribute("now", localDataTime);

        System.out.println("IndexController");

        return "index";

    }


}
