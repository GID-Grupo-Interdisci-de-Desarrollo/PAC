package com.gid.puertasAluminioCostaApp.services;
import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.repositories.IEnterpriseRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
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

}
