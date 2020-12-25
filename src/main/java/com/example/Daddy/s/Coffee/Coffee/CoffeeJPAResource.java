package com.example.Daddy.s.Coffee.Coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CoffeeJPAResource {

    @Autowired
    private CoffeeJPARepo coffeeJPARepo;

    @GetMapping("/jpa/coffee/viewall")
    public List<Coffee> getAllTodos(){

        return coffeeJPARepo.findAll();

    }

}
