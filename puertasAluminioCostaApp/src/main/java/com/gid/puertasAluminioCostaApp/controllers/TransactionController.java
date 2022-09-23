package com.gid.puertasAluminioCostaApp.controllers;

import com.gid.puertasAluminioCostaApp.entities.Transaction;
import com.gid.puertasAluminioCostaApp.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController

// There's setting the enterprise route
@RequestMapping("enterprise")
public class TransactionController {

    // There's declaring the enterprise service@RequestMapping("enterprise")
    private final EnterpriseService enterpriseService;

    // There's initializing the enterprise service
    public TransactionController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    // This method may return a movement by id
    @GetMapping("{id}/movements")
    public ArrayList<Transaction> selectTransactions(@PathVariable long id) {
        return this.enterpriseService.selectTransactions(id);
    }

    // This method creates a new movement
    @PostMapping ("{id}/movements")
    public void insertTransaction(@PathVariable long id, @RequestBody Transaction transaction) {
        this.enterpriseService.insertTransaction(id, transaction);
    }

    // This method update the movement of an enterprise by idTransaction
    @PatchMapping("{id}/movements/{idTransaction}")
    public void updateOne(@PathVariable long id, @PathVariable long idTransaction, @RequestBody Transaction transactionData){
        this.enterpriseService.updateTransaction(id, idTransaction, transactionData);
    }

    // This method deletes a movement by id
    @DeleteMapping("{id}/movements/{idTransaction}")
    public void deleteOne (@PathVariable long id, @PathVariable long idTransaction){
        this.enterpriseService.deleteTransaction(id, idTransaction);
    }

}