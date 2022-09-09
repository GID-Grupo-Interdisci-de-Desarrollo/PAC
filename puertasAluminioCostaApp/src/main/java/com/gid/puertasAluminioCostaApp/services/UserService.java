package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.User;
import com.gid.puertasAluminioCostaApp.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    // There's declaring the user repository
    private final IUserRepository userRepository;

    // There's initializing the user repository
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // This method returns a user arrayList
    public ArrayList<User> selectAll(){
        return (ArrayList<User>) userRepository.findAll();
    }

    // This method may return a user by id
    public Optional<User> selectOne(long id){
        return this.userRepository.findById(id);
    }

    // This method creates a new user
    public void insertOne(User user){
        this.userRepository.save(user);
    }

    // This method update the name of a user by id
    /**public void updateUser(long id, String name){

        User myUser = this.userRepository.findById(id);

        myUser.setName(name);
        this.userRepository.save(myUser);

    }*/

    // This method deletes an enterprise by id
    public void deleteOne(long id){
        this.userRepository.deleteById(id);
    }

}
