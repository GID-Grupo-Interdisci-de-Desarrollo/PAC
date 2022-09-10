package com.gid.puertasAluminioCostaApp.repositories;

import com.gid.puertasAluminioCostaApp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
