package cf.jamesmarc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xinhu on 2017/10/31.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
//        ModelAndView mv = new ModelAndView("index");
//        return mv;
    }
}
