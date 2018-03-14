package ttn.com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControllerAnnotation {
    @RequestMapping("/index")
    ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/static")
    @ResponseBody
    public String responseBody() {
        return "Hello World";
    }

    @RequestMapping("/helloworld")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("/helloworld");
        modelAndView.addObject("msg", "Hello World");
        return modelAndView;
    }


    //Question 8
//    @RequestMapping("/users")
//    @ResponseBody
//    String submitForm(@RequestParam("username") String username,
//                      @RequestParam("password") String password) {
//        return "You have enter username is "+ username + " and password is "+password;
//    }

    //Question9

//    @RequestMapping("/users")
//    @ResponseBody
//    String submitForm(Student student) {
//        return "You have enter username is "+ student.getUsername() + " and password is "+student.getPassword();
//    }

}
