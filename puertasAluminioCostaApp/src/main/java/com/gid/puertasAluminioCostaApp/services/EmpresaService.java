package com.gid.puertasAluminioCostaApp.services;
import com.gid.puertasAluminioCostaApp.entities.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    // Se prepara el servicio para la inicialización del repositorio.

    /*

     *IEmpresaRepository IEmpresaRepository;

     *public empresaService(IEmpresaRepository IEmpresaRepository) {
     *this.IEmpresaRepository = IEmpresaRepository;
     *}

     */

    public List<Empresa> selectAll(){
        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new ArrayList<Empresa>();
    }

    public Empresa selectOne(int id){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new Empresa("UnaEmpresa", "direccion", 122345456, "dfghj");

    }

    public void insertOne(String nombre, String direccion, int telefono, String nit){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        new Empresa(nombre, direccion, telefono, nit);

    }

    public void updateUser(int id){

    }

    public void deleteUser(int id){

    }



}
