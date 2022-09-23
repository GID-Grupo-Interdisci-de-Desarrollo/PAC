package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

// There's setting the enterprise route
@RequestMapping("enterprise")
public class EnterpriseController {

    // There's declaring the enterprise service
    private final EnterpriseService enterpriseService;

    // There's initializing the enterprise service
    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    // This method returns an enterprise arrayList
    @GetMapping ("")
    public List<Enterprise> selectEnterprises() { return this.enterpriseService.selectEnterprises() ;}

    // This method creates a new enterprise
    @PostMapping ("")
    public void insertEnterprises(@RequestBody Enterprise enterprise) {
        this.enterpriseService.insertEnterprise(enterprise);
    }

    // This method may return an enterprise by id
    @GetMapping("{id}")
    public Optional<Enterprise> selectEnterprise(@PathVariable long id) {
        return this.enterpriseService.selectEnterprise(id);
    }

    // This method update the enterprise name by id
    @PatchMapping("{id}")
    public void updateOne(@PathVariable long id, @RequestBody Enterprise enterprise){
        this.enterpriseService.updateEnterprise(id, enterprise);
    }

    // This method deletes an enterprise by id
    @DeleteMapping("{id}")
    public void deleteEnterprise (@PathVariable long id){
        this.enterpriseService.deleteEnterprise(id);
    }

}
