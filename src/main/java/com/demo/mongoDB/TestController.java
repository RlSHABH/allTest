package com.demo.mongoDB;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


  @Autowired
  private CarMongoRepository carMongoRepository;


  @RequestMapping(value = "/addCar", method = RequestMethod.GET)
  public String addCar() {
    Car car=new Car();
    car.setMake("sdfs");
    car.setDescription("sdsdds");
    carMongoRepository.save(car);
    return "redirect:home";
  }


}
