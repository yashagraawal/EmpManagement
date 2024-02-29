package com.miniproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miniproj.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {
}
