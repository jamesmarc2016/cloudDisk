package cf.jamesmarc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by xinhu on 2017/11/6.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String sayHello(Map<String,Object> map){
        return "index";
    }

    /**
     * 获取登录验证码
     */
    @RequestMapping("/getLoginImg")
    public ModelAndView getLoginImg(){
        ModelAndView modelAndView = new ModelAndView();

    }
}
