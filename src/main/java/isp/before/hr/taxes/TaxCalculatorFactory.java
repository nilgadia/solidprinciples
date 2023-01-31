package isp.before.hr.taxes;

import isp.before.hr.personnel.Employee;
import isp.before.hr.personnel.FullTimeEmployee;
import isp.before.hr.personnel.Intern;
import isp.before.hr.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new RuntimeException("Invalid employee type");
    }
}
