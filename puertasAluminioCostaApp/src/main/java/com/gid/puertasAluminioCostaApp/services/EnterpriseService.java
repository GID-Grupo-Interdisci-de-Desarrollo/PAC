package com.gid.puertasAluminioCostaApp.services;
import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.repositories.IEnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EnterpriseService {

    // There's declaring the enterprise repository
    private final IEnterpriseRepository enterpriseRepository;

    // There's initializing the enterprise repository
    public EnterpriseService(IEnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    // This method returns an enterprise arrayList
    public ArrayList<Enterprise> selectAll(){
        return (ArrayList<Enterprise>) this.enterpriseRepository.findAll();
    }

    // This method may return an enterprise by id
    public Optional<Enterprise> selectOne(long id){

        return this.enterpriseRepository.findById(id);

    }

    // This method creates a new enterprise
    public void insertOne(Enterprise enterprise){

        this.enterpriseRepository.save(enterprise);

    }

    // This method update the enterprise name by id
    /** public void updateEnterprise(long id, String name) {

     Enterprise myEnterprise = this.enterpriseRepository.findById(id);

     myEnterprise.setName(name);
     this.enterpriseRepository.save(myEnterprise);

     }*/

    // This method deletes an enterprise by id
    public void deleteOne(long id){

        this.enterpriseRepository.deleteById(id);

    }

}
