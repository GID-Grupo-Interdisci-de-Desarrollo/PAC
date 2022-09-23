package com.gid.puertasAluminioCostaApp.services;
import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.entities.Transaction;
import com.gid.puertasAluminioCostaApp.repositories.IEnterpriseRepository;
import com.gid.puertasAluminioCostaApp.repositories.ITransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EnterpriseService {

    // There's declaring the enterprise and the transaction repositories
    private final IEnterpriseRepository enterpriseRepository;
    private final ITransactionRepository transactionRepository;

    // There's initializing the enterprise and the transaction repositories
    public EnterpriseService(IEnterpriseRepository enterpriseRepository, ITransactionRepository transactionRepository) {
        this.enterpriseRepository = enterpriseRepository;
        this.transactionRepository = transactionRepository;
    }

    // This method returns an enterprise arrayList
    public ArrayList<Enterprise> selectEnterprises(){
        return (ArrayList<Enterprise>) this.enterpriseRepository.findAll();
    }

    // This method may return an enterprise by id
    public Optional<Enterprise> selectEnterprise(long id){

        return this.enterpriseRepository.findById(id);

    }

    // This method creates a new enterprise
    public void insertEnterprise(Enterprise enterprise){

        this.enterpriseRepository.save(enterprise);

    }

    // This method update the enterprise name by id
    public void updateEnterprise(long id, Enterprise enterprise) {

         Enterprise myEnterprise = this.enterpriseRepository.findById(id).get();

         boolean updated = false;
         if(StringUtils.hasLength(enterprise.getName())){
             myEnterprise.setName(enterprise.getName());
             myEnterprise.setUpdatedAt(new Date(System.currentTimeMillis()));
             updated = true;
         }
        if(StringUtils.hasLength(enterprise.getDocument())){
            myEnterprise.setDocument(enterprise.getDocument());
            myEnterprise.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }
        if(StringUtils.hasLength(enterprise.getPhone())){
            myEnterprise.setPhone(enterprise.getPhone());
            myEnterprise.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }
        if(StringUtils.hasLength(enterprise.getAddress())){
            myEnterprise.setAddress(enterprise.getAddress());
            myEnterprise.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }


         if(updated){
             this.enterpriseRepository.save(myEnterprise);
         }

     }

    // This method deletes an enterprise by id
    public void deleteEnterprise(long id){

        this.enterpriseRepository.deleteById(id);

    }

    /**Enterprise transactions methods*/

    public ArrayList<Transaction> selectTransactions(long idEnterprise){
        Enterprise myEnterprise = this.enterpriseRepository.findById(idEnterprise).get();
        return (ArrayList<Transaction>) this.transactionRepository.findAllByEnterprise(myEnterprise);
    }

    public void insertTransaction(long idEnterprise, Transaction transaction){

        Enterprise myEnterprise = this.enterpriseRepository.findById(idEnterprise).get();

        transaction.setEnterprise(myEnterprise);

        this.transactionRepository.save(transaction);

    }

    public void updateTransaction(long idEnterprise, long idTransaction, Transaction transactionData){

        Enterprise myEnterprise = this.enterpriseRepository.findById(idEnterprise).get();
        ArrayList<Transaction> transactionsEnterprise = (ArrayList<Transaction>) this.transactionRepository.findAllByEnterprise(myEnterprise);

        Transaction myTransaction = null;
        for(Transaction transaction: transactionsEnterprise){
            if(transaction.getId() == idTransaction){
                myTransaction = transaction;
            }
        }

        boolean updated = false;
        if(StringUtils.hasLength(transactionData.getConcept())){
            myTransaction.setConcept(transactionData.getConcept());
            myTransaction.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }

        if(updated){
            this.transactionRepository.save(myTransaction);
        }
    }

    public void deleteTransaction(long idEnterprise, long idTransaction){

        Enterprise myEnterprise = this.enterpriseRepository.findById(idEnterprise).get();
        ArrayList<Transaction> transactionsEnterprise = (ArrayList<Transaction>) this.transactionRepository.findAllByEnterprise(myEnterprise);

        Transaction myTransaction = null;
        for(Transaction transaction: transactionsEnterprise){
            if(transaction.getId() == idTransaction){
                myTransaction = transaction;
            }
        }

        if (myTransaction != null){
            this.transactionRepository.deleteById(myTransaction.getId());
        }

    }

}
