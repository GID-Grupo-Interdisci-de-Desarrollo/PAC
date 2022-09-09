package com.gid.puertasAluminioCostaApp.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    IUsersService UsersService;

    public UsersController(IUsersService UsersService){
        this.UsersService = UsersService
    }

    @GetMapping ("")
    public List <Users> listUsers() {return this.service.getListaUsers();}

    @PostMapping ("")
    public Users createUsers(@RequestBody Users user) {
        return this.service.createUsers(User);
    }


    @RequestMapping ("/user/[id]")
    @GetMapping
    public String getNombre() {
        return "nombre obtenido";
    }

    @PatchMapping
    public String updateNombre(){
        return "usuario actualizado";
    }

    @DeleteMapping
    public String deleteNombre (){
        return "nombre eliminado";
    }

}