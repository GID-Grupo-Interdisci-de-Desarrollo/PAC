package com.gid.puertasAluminioCostaApp.services;
import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {

    // Se prepara el servicio para la inicialización del repositorio.

    /*

     *IEmpresaRepository IEmpresaRepository;

     *public empresaService(IEmpresaRepository IEmpresaRepository) {
     *this.IEmpresaRepository = IEmpresaRepository;
     *}

     */

    public List<Enterprise> selectAll(){
        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new ArrayList<Enterprise>();
    }

    public Enterprise selectOne(int id){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new Enterprise();

    }

    public void insertOne(String name, String address, int phone, String nit){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        new Enterprise();

    }

    public void updateUser(int id){

    }

    public void deleteUser(int id){

    }



}
