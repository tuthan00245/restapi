package net.javaguides.ttk.repository;

import net.javaguides.ttk.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
