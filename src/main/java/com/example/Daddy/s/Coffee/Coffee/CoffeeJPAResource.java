package com.example.Daddy.s.Coffee.Coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CoffeeJPAResource {

    /** create a object from JPA interface **/
    @Autowired
    private CoffeeJPARepo coffeeJPARepo;

    /** view products **/
    @GetMapping("/jpa/coffee/viewall")
    public List<Coffee> getAllCoffee(){

        return coffeeJPARepo.findAll();

    }

    /** Add a new order **/
    @PostMapping("/jpa/users/{username}/todos")
    public ResponseEntity<Void> createCoffee(@PathVariable String username,
                                           @RequestBody Coffee coffee){

        //Todo createdTodo = todoService.saveii(todo);
        coffee.setUsername(username);
        Coffee createdCoffee = coffeeJPARepo.save(coffee);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdCoffee.getId()).toUri();


        return ResponseEntity.created(uri).build();

    }

}
