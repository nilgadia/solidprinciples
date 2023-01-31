## Open Closed Principle
<pre>
Classes, functions, and modules should be closed for
modification, but open for extension.
</pre>
### OCP Definition Explained
>> <pre> Closed for modification <br> Each new feature should not modify existing source code </pre>

>> <pre> Open for extension <br> A component should be extendable to make it behave in new way </pre>
<pre>
Why Should You Apply the OCP?

New features can be added easily and with minimal cost

Minimizes the risk of regression bugs

Enforces decoupling by isolating changes in specific components,
works along with the SRP
</pre>
***SOLID principles are most effective when applied together.***
#### Progressively Applying the OCP
* Start small - Make changes inline. Bug fixes can be implemented this way
* More changes - Consider inheritance
* Many changes / dynamic decision - Consider interfaces and design like strategy.
#### API
***A contract/agreement between different software components on how they should work together***
>><pre>A public framework or API is <br> under your control. <br>But clients might use it in ways<br>that you aren't aware of.</pre>
<pre>
Best Practices for changing APIs

Do not change existing public contracts: data classes, signatures

Expose abstractions to your customers and let them add new feature on top of the framework.

If a breaking change is inevitable, give your clients time to adapt.
</pre>
<pre>
OCP is all about changes. Following this principle will lead
to elegant designs that are easy and painless to extend.
</pre>
