package com.dctr.service;

import com.dctr.model.Employee;

import com.dctr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService{


    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void updateUser(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void createUser(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void createOrUpdateUser(Employee employee) {
        if(null == employee.getId()){
            createUser(employee);
            return;
        }
            updateUser(employee);
    }

    @Override
    public Employee getUserById(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
