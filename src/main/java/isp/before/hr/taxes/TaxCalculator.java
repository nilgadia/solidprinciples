package isp.before.hr.taxes;

import isp.before.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
