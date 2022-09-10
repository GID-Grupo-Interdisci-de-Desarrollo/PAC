/**package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

// There's setting the enterprise route
@RequestMapping("enterprise")
public class TransactionController {
    // There's declaring the enterprise service
    private final EnterpriseService enterpriseService;

    // There's initializing the enterprise service
    public TransactionController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    // This method may return a movement by id
    @GetMapping("{id}/movements")
    public Optional<Enterprise> selectOne(@PathVariable long id) {
        return this.enterpriseService.selectEnterprise(id);
    }

    // This method creates a new movement
    @PostMapping ("{id}/movements")
    public void insertOne(@RequestBody Enterprise enterprise) {
        this.enterpriseService.insertEnterprise(enterprise);
    }

    // This method update the movement of an enterprise by id
    /**@PatchMapping("{id}/movements")
    public void updateOne(@PathVariable long id, @RequestBody Enterprise enterprise){
        this.enterpriseService.updateOne(id, enterprise);
    }

    // This method deletes a movement by id
    @DeleteMapping("{id}/movements}")
    public void deleteOne (@PathVariable long id){
        this.enterpriseService.deleteEnterprise(id);
    }

}*/