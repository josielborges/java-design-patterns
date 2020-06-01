# Java Design Patterns

JAVA Design Patterns training, testing and cataloging.

This list all common Patterns and which situations they can be used. 

It also an example, or examples, of implementations in JAVA language for each pattern.

## Strategy

Strategy pattern (also known as the **policy pattern**) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

Deferring the decision about which algorithm to use until runtime allows the calling code to be more flexible and reusable.

Typically the strategy pattern stores a reference to some code in a data structure and retrieves it. This can be achieved by mechanisms such as the native function pointer, the first-class function, classes or class instances in object-oriented programming languages, or accessing the language implementation's internal storage of code via reflection.

#### When to use?

In situations in which many classes are related and the difference between theirs is just the acting mode, so the Strategy will config a class that has many given known behaviors. Also it can be used when there is a need to change the algorithm, in other words, it can implement distinct codes that get the same objective, although it has certain situations that das more advantageous than others.

[code][strategy-code]

## Chain of Responsability

Chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to the end of this chain. Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime.

#### When to use?

When there is a list of commands to be executed in a specific scenario and is known what is the next step should be validated, when the previous don't satisfy the condition.

[code][chain-of-responsability-code]

## Template Method

The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods in the same class as the template method.

The helper methods may be either abstract methods, for which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. Subclasses can (but are not required to) customize the operation by overriding the hook methods. The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.

#### When to use?

When different algorithms have the same structure.

[code][template-method-code]

## Decorator

Decorator pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is structurally nearly identical to the chain of responsibility pattern, the difference being that in a chain of responsibility, exactly one of the classes handles the request, while for the decorator, all classes handle the request.

#### When to use?

It can be used when it is figured that there as behaviors that can be composed of other classes behaviors in the same hierarchy. The Decorator introduces the flexibility in compound these behaviors, just choosing the time of instantiation, and what circumstances that do the job.

[code][decorator-code]

## State

The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.

The state pattern is used in computer programming to encapsulate varying behavior for the same object, based on its internal state. This can be a cleaner way for an object to change its behavior at runtime without resorting to conditional statements and thus improve maintainability.

#### When to use?

In general, the control of possibles transitions are many and complex and because of that, it can make the implementation not trivial. The State aid in maintain the control of states simple and organized through the creation of classes that represents each state and knows how to control the transitions.

[code][state-code]

## Builder

The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation.

#### When to use?

When we have a complex object to be created, that has many attributes or has a complex implementation logic, it can be used to hide all of that.

[code][builder-code]

## Observer

The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

#### When to use?

When the coupling of the class is increasing, or when there are many different actions to be executed after a certain process, we could implement Observer.

[code][observer-code]

[chain-of-responsability-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/chainofresponsability

[strategy-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/strategy

[template-method-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/templatemethod

[decorator-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/decorator

[state-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/state

[builder-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/builder

[observer-code]: https://github.com/josielborges/java-design-patterns/tree/master/src/br/com/josielborges/designpatterns/observer