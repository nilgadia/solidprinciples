package lsp.before.hr.taxes;

import lsp.before.hr.personnel.Employee;
import lsp.before.hr.personnel.FullTimeEmployee;
import lsp.before.hr.personnel.Intern;
import lsp.before.hr.personnel.PartTimeEmployee;

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
