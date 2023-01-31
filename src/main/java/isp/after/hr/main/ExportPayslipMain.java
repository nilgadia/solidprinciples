package isp.after.hr.main;

import isp.after.hr.documents.Payslip;
import isp.after.hr.logging.ConsoleLogger;
import isp.after.hr.persistence.EmployeeFileSerializer;
import isp.after.hr.persistence.EmployeeRepository;
import isp.after.hr.personnel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        for (Employee employee : employees){
            Payslip payslip = new Payslip(employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase();
            System.out.println(exportableText);
        }
    }
}
