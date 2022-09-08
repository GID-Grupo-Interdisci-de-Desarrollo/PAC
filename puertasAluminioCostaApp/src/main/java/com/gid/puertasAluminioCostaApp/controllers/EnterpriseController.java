package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    IEmpresaService EmpresaService;

    public EnterpriseController(IEmpresaService EmpresaService){
        this.EmpresaService = EmpresaService
    }

    @GetMapping ("")
    public List <Enterprise> listEnterprise() {return this.service.getListaEmpresa();}

    @PostMapping ("")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        return this.service.crearEmpresa(enterprise);
    }


    @RequestMapping ("[id]")
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
