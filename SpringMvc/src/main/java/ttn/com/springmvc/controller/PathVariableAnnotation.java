package ttn.com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PathVariableAnnotation {

    @RequestMapping("/user/{username}/{lastname}")
    ModelAndView userInformation(@PathVariable("username") String username,
                                 @PathVariable("lastname") String lastname){
        ModelAndView modelAndView = new ModelAndView("userInfo");
        modelAndView.addObject("user", username);
        modelAndView.addObject("lastname", lastname);
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/countryAndState/{country}/{state}")
    String getInformation(@PathVariable Map<String, String> requestMap) {
        return "Your country is "+requestMap.get("country")+" and state is "+requestMap.get("state");
    }

}
