package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.Employee;
import com.gid.puertasAluminioCostaApp.entities.Profile;
import com.gid.puertasAluminioCostaApp.repositories.IEmployeeRepository;
import com.gid.puertasAluminioCostaApp.repositories.IProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {

    // There's declaring the employee and profile repositories
    private final IEmployeeRepository employeeRepository;

    // There's initializing the employee and profile repositories
    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**Employee Methods*/

    // This method returns an employee arrayList
    public ArrayList<Employee> selectEmployees(){
        return (ArrayList<Employee>) employeeRepository.findAll();
    }

    // This method may return an employee by id
    public Optional<Employee> selectEmployee(long id){
        return this.employeeRepository.findById(id);
    }

    // This method creates a new employee
    public void insertEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    // This method update the name of an employee by id
    public void updateEmployee(long id, Employee employee){

        Employee myEmployee = this.employeeRepository.findById(id).get();

        boolean updated = false;
        if(StringUtils.hasLength(employee.getEmail())){
            myEmployee.setEmail(employee.getEmail());
            myEmployee.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }
        if(employee.getRole() != null){
            myEmployee.setRole(employee.getRole());
            myEmployee.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }
        if(employee.getEnterprise() != null){
            myEmployee.setEnterprise(employee.getEnterprise());
            myEmployee.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }

        if(updated){
            this.employeeRepository.save(myEmployee);
        }

    }

    // This method deletes an employee by id
    public void deleteEmployee(long id){
        this.employeeRepository.deleteById(id);
    }

}
