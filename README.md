# Java Design Patterns
JAVA Design Patterns training and cataloging.

## Strategy

Strategy pattern (also known as the **policy pattern**) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

Deferring the decision about which algorithm to use until runtime allows the calling code to be more flexible and reusable.

Typically the strategy pattern stores a reference to some code in a data structure and retrieves it. This can be achieved by mechanisms such as the native function pointer, the first-class function, classes or class instances in object-oriented programming languages, or accessing the language implementation's internal storage of code via reflection.

#### Application

The pattern is applied in situations in which many classes are related and the difference between theirs is just the acting mode, so the Strategy will config a class that has many given known behaviors. Also it can be used when there is a need to change the algorithm, in other words, it can implement distinct codes that get the same objective, although it has certain situations that das more advantageous than others.

Another good reason to use this pattern is an application which it has a client and it can not be exposed to an algorithm data structure. Besides that, when a class has many behaviors and uses various additional commands, the performance could be unsatisfactory, because there is a possibility of existing a lot of conditions, that can make the code slower. With the pattern could get off these conditions, creating new classes with these strategies, improving the performance.

[code][strategy-code]

## Chain of Responsability

Chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to the end of this chain. Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime.

[code][chain-of-responsability-code]

## Template Method

The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods in the same class as the template method.

The helper methods may be either abstract methods, for which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. Subclasses can (but are not required to) customize the operation by overriding the hook methods. The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.

[code][template-method-code]

## Decorator

Decorator pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is structurally nearly identical to the chain of responsibility pattern, the difference being that in a chain of responsibility, exactly one of the classes handles the request, while for the decorator, all classes handle the request.

[code][decorator-code]

## State

The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.

The state pattern is used in computer programming to encapsulate varying behavior for the same object, based on its internal state. This can be a cleaner way for an object to change its behavior at runtime without resorting to conditional statements and thus improve maintainability.

[code][state-code]


[chain-of-responsability-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/chainofresponsability

[strategy-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/strategy

[template-method-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/templatemethod

[decorator-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/decorator

[state-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/state