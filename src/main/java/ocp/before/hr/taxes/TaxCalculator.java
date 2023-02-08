package ocp.before.hr.taxes;

import ocp.before.hr.personnel.Employee;
import ocp.before.hr.personnel.FullTimeEmployee;
import ocp.before.hr.personnel.Intern;
import ocp.before.hr.personnel.PartTimeEmployee;

public class TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;


    public double calculate(Employee employee) {
        return BASE_HEALTH_INSURANCE +
                (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

    }

    // The new requirement v2 can be implemented like this
//    public double calculate(Employee employee) {
//        int monthlyIncome = employee.getMonthlyIncome();
//        if(employee instanceof FullTimeEmployee){
//            return BASE_HEALTH_INSURANCE +
//                    (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
//                    (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
//        }
//        if(employee instanceof PartTimeEmployee){
//            return BASE_HEALTH_INSURANCE +
//                    (employee.getMonthlyIncome() * 10) / 100 +
//                    (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
//        }
//        if(employee instanceof Intern){
//            if(monthlyIncome > 350){
//                return 0;
//            }else {
//                return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
//            }
//        }
//        return 0;
//    }

}
