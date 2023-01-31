package dip.before.hr.taxes;

import dip.before.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
