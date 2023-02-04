## Single Responsibility Principle 
>><pre> Every function, class or module should have <br> one and only one reason to change.</pre>
#### Example of Responsibilities
* Business Logic
* User Interface
* Persistence
* Logging
* Orchestration
* Users
>><pre>Always identify the reasons to<br>change that your components have<br>   and reduce them to <br>     a single one</pre>
***Why Should You Use SRP?***
<pre>

It makes code easier to understand, fix and maintain

Classes are less coupled and more resilient to change

More testable design
</pre>
***Identify Multiple Reasons to Change***
* If Statements
<pre>
  if(employee.getMonthlyIncome()>2000){
     // Some logic here
  } else {
     // Some other logic here
  }
</pre>
* Switch Statements
<pre>
  switch(employee.getNbHoursPerWork()){
     case 40:
       // logic for full time
     case 20:
       // logic for part time
  }
</pre>
* Monster Method
<pre>
  Income getIncome(Employee e) {
     Income income = employeeRepository.getIncome(e.id);
     StateAuthorityAPI.send(income, e.fullName);
     Payslip payslip = PayslipGenerator.get(income);
     JSONObject payslipJson = convertToJson(payslip);
     EmailService.send(e.email, payslipJson);

     ----
     return income;
  }
</pre>
* God Class
<pre>
  class Utils {
     void saveToDb(Object o) {...}
     void convertToJson(Object o){...}
     byte[] serialize(Object o){...}
     String toFriendlyDate(LocalDateTime date){...}
     int roundDoubleToInt(Double val){...}
  }
</pre>
* People
<pre>
   Report generate(){
      // Method used by HR and Management actors
      // Each one will want different features at same point in time
   }
</pre>
#### SRP Example
<pre>
   class ConsoleLogger {
      void logInfo(String msg) {
         System.out.println(msg);
      }
      void logError(String msg, Exception e) {...}
   }
</pre>
#### Danger of Multiple Responsibilities
****Symptoms of Not Using SRP****
* Code is more difficult to read and reason about
* Decreased quality due to testing difficulty
* Side effects
* High Coupling
#### Coupling
<pre>
The level of inter-dependency between various software components.
  Income getIncome(Employee e) {
     RepositoryImpl repo = new RepositoryImpl( srv, port, db);
     Income income = repo.getIncome(e.id);
     ----
     return income;
  } 
  Solution
  Income getIncome(Employee e, Repository repo) {
     Income income = repo.getIncome(e.id);
     ----
     return income;
  } 
</pre>
<pre>
If Module A Knows too much about Module B,
changes to the internals of Module B may break
functionality in Module A.
</pre>
>><pre>"We want to design components<br>that are self-contained:<br>independent, and with a single,<br>well-defined purpose" <br>Andrew Hunt & David Thomas, The Pragmatic Programmer</pre>
