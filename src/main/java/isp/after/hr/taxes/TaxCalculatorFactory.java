package isp.after.hr.taxes;

import isp.after.hr.personnel.Employee;
import isp.after.hr.personnel.FullTimeEmployee;
import isp.after.hr.personnel.Intern;
import isp.after.hr.personnel.PartTimeEmployee;

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
