## Single Responsibility Principle 
<pre>
Every function, class or module should have one and only one 
reason to change.
</pre>
#### Example of Responsibilities
* Business Logic
* User Interface
* Persistence
* Logging
* Orchestration
* Users
>><pre>Always identify the reasons to<br>change that your components have<br>   and reduce them to <br>     a single one</pre>
<pre>
Why Should You Use SRP?

It makes code easier to understand, fix and maintain

Classes are less coupled and more resilient to change

More testable design
</pre>
***Identify Multiple Reasons to Change***
* If Statements
* Switch Statements
* Monster Method
* God Class
* People

#### Danger of Multiple Responsibilities
****Symptoms of Not Using SRP****
* Code is more difficult to read and reason about
* Decreased quality due to testing difficulty
* Side effects
* High Coupling
#### Coupling
The level of inter-dependency between various software components.
<pre>
If Module A Knows too much about Module B,
changes to the internals of Module B may break
functionality in Module A.
</pre>
>><pre>"We want to design components<br>that are self-contained:<br>independent, and with a single,<br>well-defined purpose" <br>Andrew Hunt & David Thomas, The Pragmatic Programmer</pre>
