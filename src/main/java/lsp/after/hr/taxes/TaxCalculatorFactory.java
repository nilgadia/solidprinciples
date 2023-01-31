package lsp.after.hr.taxes;

import lsp.after.hr.personnel.Employee;
import lsp.after.hr.personnel.FullTimeEmployee;
import lsp.after.hr.personnel.Intern;
import lsp.after.hr.personnel.PartTimeEmployee;

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
