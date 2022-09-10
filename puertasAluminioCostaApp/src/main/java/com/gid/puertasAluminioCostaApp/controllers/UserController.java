package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Employee;
import com.gid.puertasAluminioCostaApp.entities.Profile;
import com.gid.puertasAluminioCostaApp.services.EmployeeService;
import com.gid.puertasAluminioCostaApp.services.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

//There is setting the user route
@RequestMapping("user")
public class UserController {

    /**Employee crud methods */
    // There's declaring the employee and profile services
    private final EmployeeService employeeService;
    private final ProfileService profileService;

    // There's initializing the employee and profile services
    public UserController(EmployeeService employeeService, ProfileService profileService) {
        this.employeeService = employeeService;
        this.profileService = profileService;
    }

    // This method returns a user arrayList
    @GetMapping("")
    public List<Employee> selectEmployees() { return this.employeeService.selectEmployees() ;}

    // This method creates a new user
    @PostMapping("")
    public void insertEmployee(@RequestBody Employee user) {
        this.employeeService.insertEmployee(user);
    }

    // This method may return a user by id
    @GetMapping("{id}")
    public Optional<Employee> selectEmployee(@PathVariable long id) {
        return this.employeeService.selectEmployee(id);
    }

    // This method update the name of a user by id
    @PatchMapping("{id}")
    public void updateEmployee(@PathVariable long id, @RequestBody Employee user){
        this.employeeService.updateEmployee(id, user);
    }

    // This method deletes an enterprise by id
    @DeleteMapping("{id}")
    public void deleteEmployee (@PathVariable long id){
        this.employeeService.deleteEmployee(id);
    }

    /**Profile crud methods */
    @PostMapping("profile")
    public void insertProfile(@RequestBody Profile profile) {
        this.profileService.insertProfile(profile);
    }

    // This method may return a user by id
    @GetMapping("profile/{id}")
    public Optional<Profile> selectOne(@PathVariable String id) {
        return this.profileService.selectProfile(id);
    }

    // This method update the name of a user by id
    @PatchMapping("profile/{id}")
    public void updateOne(@PathVariable String id, @RequestBody Profile profile){
        this.profileService.updateProfile(id, profile);
    }

    // This method deletes an enterprise by id
    @DeleteMapping("profile/{id}")
    public void deleteOne (@PathVariable String id){
        this.profileService.deleteProfile(id);
    }

}
