package dip.after.hr.taxes;

import dip.after.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
