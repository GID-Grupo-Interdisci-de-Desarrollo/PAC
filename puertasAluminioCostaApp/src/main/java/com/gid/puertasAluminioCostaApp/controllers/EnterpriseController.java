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
    public List<Enterprise> selectAll() { return this.enterpriseService.selectAll() ;}

    // This method creates a new enterprise
    @PostMapping ("")
    public void insertOne(@RequestBody Enterprise enterprise) {
        this.enterpriseService.insertOne(enterprise);
    }

    // This method may return an enterprise by id
    @GetMapping("{id}")
    public Optional<Enterprise> selectOne(@PathVariable long id) {
        return this.enterpriseService.selectOne(id);
    }

    // This method update the enterprise name by id
    /** @PatchMapping
    public void updateOne(@PathVariable long id, @RequestBody String name){
        this.enterpriseService.updateEnterprise(id, name);
    }*/

    // This method deletes an enterprise by id
    @DeleteMapping("{id}")
    public void deleteOne (@PathVariable long id){
        this.enterpriseService.deleteOne(id);
    }

}
