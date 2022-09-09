package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    IEmpresaService EmpresaService;

    public EnterpriseController(IEmpresaService EnterpriseService){ this.EmpresaService = EnterpriceService}

    //GET
    @GetMapping ("")
    public List <Enterprise> listEnterprise() {return this.service.getListaEmpresa();}

    //POST
    @PostMapping ("")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        return this.service.insertOne(enterprise);
    }

    //GET
    @RequestMapping ("[id]")
    @GetMapping
    public String getSelectOne() {
        return "nombre obtenido";
    }

    //PATCH
    @PatchMapping
    public String updateUser(){
        return "usuario actualizado";
    }


    //DELETE
    @DeleteMapping
    public String deleteUser (){
        return "nombre eliminado";
    }

}
