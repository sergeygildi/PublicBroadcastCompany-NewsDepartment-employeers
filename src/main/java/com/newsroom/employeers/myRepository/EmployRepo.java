package com.newsroom.employeers.myRepository;

import com.newsroom.employeers.domains.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployRepo extends CrudRepository<Employee, Long> {


}
