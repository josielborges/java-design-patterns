# java-design-patterns
JAVA Design Patterns training

## Strategy

Strategy pattern (also known as the **policy pattern**) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

Deferring the decision about which algorithm to use until runtime allows the calling code to be more flexible and reusable.

Typically the strategy pattern stores a reference to some code in a data structure and retrieves it. This can be achieved by mechanisms such as the native function pointer, the first-class function, classes or class instances in object-oriented programming languages, or accessing the language implementation's internal storage of code via reflection.

### Application

The pattern is applied in situations in which many classes are related and the difference between theirs is just the acting mode, so the Strategy will config a class that has many given known behaviors. Also it can be used when there is a need to change the algorithm, in other words, it can implement distinct codes that get the same objective, although it has certain situations that das more advantageous than others.

Another good reason to use this pattern is an application which it has a client and it can not be exposed to an algorithm data structure. Besides that, when a class has many behaviors and uses various additional commands, the performance could be unsatisfactory, because there is a possibility of existing a lot of conditions, that can make the code slower. With the pattern could get off these conditions, creating new classes with these strategies, improving the performance.
