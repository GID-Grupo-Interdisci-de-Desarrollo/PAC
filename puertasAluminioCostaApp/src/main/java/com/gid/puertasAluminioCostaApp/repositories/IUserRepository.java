package com.gid.puertasAluminioCostaApp.repositories;

import com.gid.puertasAluminioCostaApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
