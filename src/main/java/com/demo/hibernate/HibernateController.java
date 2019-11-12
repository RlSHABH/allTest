package com.demo.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HibernateController
{

    @Autowired HibernateExample hibernateExample;

    @GetMapping("/addEmployee")
    public void addEntity()
    {
        hibernateExample.addEntity();

    }
}
