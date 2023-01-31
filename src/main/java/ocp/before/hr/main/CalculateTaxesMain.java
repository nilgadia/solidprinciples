package ocp.before.hr.main;

import ocp.before.hr.logging.ConsoleLogger;
import ocp.before.hr.persistence.EmployeeFileSerializer;
import ocp.before.hr.persistence.EmployeeRepository;
import ocp.before.hr.personnel.Employee;
import ocp.before.hr.taxes.TaxCalculator;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CalculateTaxesMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        TaxCalculator taxCalculator = new TaxCalculator();

        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            consoleLogger.writeInfo(employee.getFullName() + " taxes: " + formattedTax);

            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
        }
        consoleLogger.writeInfo("Total taxes = " + currencyFormatter.format(totalTaxes));
    }
}
