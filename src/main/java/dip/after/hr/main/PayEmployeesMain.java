package dip.after.hr.main;

import dip.after.hr.notifications.EmailSender;
import dip.after.hr.notifications.EmployeeNotifier;
import dip.after.hr.payment.PaymentProcessor;
import dip.after.hr.persistence.EmployeeFileRepository;
import dip.after.hr.persistence.EmployeeFileSerializer;
import dip.after.hr.persistence.EmployeeRepository;

public class PayEmployeesMain {

    /*
    Will take a couple of seconds to execute due to the
    sending of mails.
     */

    public static void main(String[] args) {

        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository =
                new EmployeeFileRepository(serializer);
        EmployeeNotifier employeeNotifier = new EmailSender();
        PaymentProcessor paymentProcessor = new PaymentProcessor(
                employeeRepository,
                employeeNotifier);

        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
