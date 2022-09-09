package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.services.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enterprises/[id]/movements")
public class TransactionController {
    /*
    @Autowired
    IEnterpriseService EnterpriseService;
*/
    //GET
    @RequestMapping(value="{id}", method = RequestMethod.GET, produces = "application/json");
    @ResponseBody
    public Enterprise findById(@PathVariable long id){
        return EnterpriseService.selectOne(id);

    }
    //POST
    @RequestMapping(value = "{id}", method = RequestMethod.POST, produces = "application/json");
    @ResponseBody

    public Enterprise create(@RequestBody Enterprise enterprise){
        return EnterpriseService.insertOne(enterprise);
    }

    //PATCH
    @RequestMapping(value="{id}", method = RequestMethod.PATCH, produces = "application/json");
    @ResponseBody
    public Enterprise update(@RequestBody Enterprise enterprise, @PathVariable long id) {
        return EnterpriseService.updateUser(id, enterprise);
    }

    //DELETE
    @RequestMapping(value="{id}", method = RequestMethod.PATCH, produces = "application/json");
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        EnterpriseService.deleteUser(id);
    }

}
