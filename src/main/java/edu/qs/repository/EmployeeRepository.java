package edu.qs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.qs.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Page<Employee> findByFirstNameContainingOrLastNameContaining(String keyword, String keyword2, Pageable pageable);

}