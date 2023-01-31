package isp.after.hr.taxes;

import isp.after.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
