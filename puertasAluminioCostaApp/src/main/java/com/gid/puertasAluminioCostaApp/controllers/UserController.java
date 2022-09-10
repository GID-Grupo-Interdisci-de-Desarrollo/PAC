package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.User;
import com.gid.puertasAluminioCostaApp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

//There is setting the user route
@RequestMapping("user")
public class UserController {

    // There's declaring the user service
    private final UserService userService;

    // There's initializing the user service
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // This method returns a user arrayList
    @GetMapping("")
    public List<User> selectAll() { return this.userService.selectAll() ;}

    // This method creates a new user
    @PostMapping("")
    public void insertOne(@RequestBody User user) {
        this.userService.insertOne(user);
    }

    // This method may return a user by id
    @GetMapping("{id}")
    public Optional<User> selectOne(@PathVariable long id) {
        return this.userService.selectOne(id);
    }

    // This method update the name of a user by id
    @PatchMapping("{id}")
    public void updateOne(@PathVariable long id, @RequestBody User user){
        this.userService.updateOne(id, user);
    }

    // This method deletes an enterprise by id
    @DeleteMapping("{id}")
    public void deleteOne (@PathVariable long id){
        this.userService.deleteOne(id);
    }

}
