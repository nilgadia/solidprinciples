package ocp.after.hr.taxes;

import ocp.after.hr.personnel.Employee;
import ocp.after.hr.personnel.FullTimeEmployee;
import ocp.after.hr.personnel.Intern;
import ocp.after.hr.personnel.PartTimeEmployee;

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
