package com.demo.thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymleafController {

  @RequestMapping(value = "/showForm", method= RequestMethod.GET)
  public String showForm(Model model)
  {
    User user = new User();
    user.setUserId(1L);
    user.setUserName("Rishabh");

    model.addAttribute("user", user);
    return "User";
  }

  @RequestMapping(value = "/processForm", method=RequestMethod.POST)
  public String processForm(@ModelAttribute(value="user") User user) {
    System.out.println(user);
    return user.toString();
  }
}
