package ocp.after.hr.taxes;

import ocp.after.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
