package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.Empresa;
import com.gid.puertasAluminioCostaApp.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    // Se prepara el servicio para la inicialización del repositorio.

    /*

    *IUsuarioRepository IUsuarioRepository;

    *public UsuarioService(IUsuarioRepository IUsuarioRepository) {
        *this.IUsuarioRepository = IUsuarioRepository;
    *}

    */

    public List<Usuario> selectAll(){
        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new ArrayList<Usuario>();
    }

    public Usuario selectOne(int id){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new Usuario(
                "Pepito",
                "Pérez",
                new Empresa(),
                "usuario"
        );

    }

    public void insertOne(String nombre, String correo, Empresa empresa, String rol){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        new Usuario(nombre, correo, empresa, rol);

    }

    public void updateUser(int id){

    }

    public void deleteUser(int id){

    }

}
