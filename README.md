# Java Design Patterns
JAVA Design Patterns training and cataloging.

## Strategy

Strategy pattern (also known as the **policy pattern**) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

Deferring the decision about which algorithm to use until runtime allows the calling code to be more flexible and reusable.

Typically the strategy pattern stores a reference to some code in a data structure and retrieves it. This can be achieved by mechanisms such as the native function pointer, the first-class function, classes or class instances in object-oriented programming languages, or accessing the language implementation's internal storage of code via reflection.

#### Application

The pattern is applied in situations in which many classes are related and the difference between theirs is just the acting mode, so the Strategy will config a class that has many given known behaviors. Also it can be used when there is a need to change the algorithm, in other words, it can implement distinct codes that get the same objective, although it has certain situations that das more advantageous than others.

Another good reason to use this pattern is an application which it has a client and it can not be exposed to an algorithm data structure. Besides that, when a class has many behaviors and uses various additional commands, the performance could be unsatisfactory, because there is a possibility of existing a lot of conditions, that can make the code slower. With the pattern could get off these conditions, creating new classes with these strategies, improving the performance.

## Chain of Responsability

Chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to the end of this chain. Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime.

## Template Method

The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods in the same class as the template method.

The helper methods may be either abstract methods, for which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. Subclasses can (but are not required to) customize the operation by overriding the hook methods. The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.