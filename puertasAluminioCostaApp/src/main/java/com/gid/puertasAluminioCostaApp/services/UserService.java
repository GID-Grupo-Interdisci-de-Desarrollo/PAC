package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // Se prepara el servicio para la inicialización del repositorio.

    /*

    *IUsuarioRepository IUsuarioRepository;

    *public UsuarioService(IUsuarioRepository IUsuarioRepository) {
        *this.IUsuarioRepository = IUsuarioRepository;
    *}

    */

    public List<User> selectAll(){
        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new ArrayList<User>();
    }

    public User selectOne(int id){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        return new User(
                "Pepito",
                "Pérez",
                new Enterprise(),
                "usuario"
        );

    }

    public void insertOne(String name, String email, Enterprise enterprise, String rol){

        // Esto es una lógica innecesaria, solo se hace para evitar el error en el commit
        new User(name, email, enterprise, rol);

    }

    public void updateUser(int id){

    }

    public void deleteUser(int id){

    }

}
