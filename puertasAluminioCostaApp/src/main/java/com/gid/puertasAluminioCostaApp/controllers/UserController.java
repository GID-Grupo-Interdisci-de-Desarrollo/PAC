package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Profile;
import com.gid.puertasAluminioCostaApp.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

//There is setting the user route
@RequestMapping("user")
public class UserController {

    // There's declaring the user service
    private final EmployeeService employeeService;

    // There's initializing the user service
    public UserController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // This method returns a user arrayList
    @GetMapping("")
    public List<Profile> selectAll() { return this.employeeService.selectAll() ;}

    // This method creates a new user
    @PostMapping("")
    public void insertOne(@RequestBody Profile user) {
        this.employeeService.insertOne(user);
    }

    // This method may return a user by id
    @GetMapping("{id}")
    public Optional<Profile> selectOne(@PathVariable long id) {
        return this.employeeService.selectOne(id);
    }

    // This method update the name of a user by id
    @PatchMapping("{id}")
    public void updateOne(@PathVariable long id, @RequestBody Profile user){
        this.employeeService.updateOne(id, user);
    }

    // This method deletes an enterprise by id
    @DeleteMapping("{id}")
    public void deleteOne (@PathVariable long id){
        this.employeeService.deleteOne(id);
    }

}
