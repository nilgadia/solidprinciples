package dip.after.hr.persistence;

import dip.after.hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void save(Employee employee) throws IOException;
}
