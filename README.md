# OO DESIGN PATTERNS LAB
- Course Code : BCGL504
- Credits : 1

## Course objectives:
* To introduce students to the fundamental principles and concepts of design patterns and their role in object-oriented software development.
* To equip students with the skills to identify and apply the most appropriate design patterns to solve common software design problems.
* To develop the ability to analyze the advantages and disadvantages of different design patterns in real-world applications.
* To provide hands-on experience in implementing various design patterns using object-oriented programming languages.

## Lab Experiments

1. Design and implement ShapeFactory class that generates different types of Shape
objects (Circle, Square, Rectangle) based on input parameters using Factory Design
Pattern.

2. Design and Implement an AbstractFactory class to create families of related or
dependent objects with respect to decathlon store without specifying their concrete
classes using Abstract Factory.

3. Design and implement a complex object like a House using a step-by-step Builder
pattern, allowing different representations of the house (wooden, brick, etc.).

4. Design and Implement to Extend a Coffee object with dynamic features (e.g., milk,
sugar, whipped cream) using Decorators.

5. Design and Implement a Logger class ensuring a single instance throughout the
application

6. Design and implement an Adapter Pattern for a Music System.

7. Design and Implement an Observer pattern for a news agency to notify subscribers
of updates.

8. Design and Implement a Façade pattern for home theatre system.

9. Design and Implement a Template Method for Document Processing (word, pdf,
excel)

10. Design and Implement weather monitoring system that notifies multiple display
devices whenever the weather conditions change that follows the Observer Design
Pattern.

11. Design and Implement a Proxy pattern to control access to an object (e.g., a protected
resource or remote service).

12. Design and Implement a Mediator pattern to manage communication between a set
of objects (e.g., chat room with multiple participants).

## UML Relations and their meaning

* <u>Association</u> - General relationship between two classes without specifying the nature of relationship.

* <u>Directed</u> Association - Similar to association, but it also gives information about the direction of relationship.

* <u>Aggregation</u> - The relationship where a child can exist independently from the parent. Deleting the parent class will not affect the child's class.

* <u>Dependency</u> - Indicates that one class is dependent on another class.

* <u>Generalization</u> - Generalization is nothing but inheritance. where a class inherits another class.

* <u>Interface Realization</u> - One model depends on another model. For example, interface and class.

## Access Specifier Notations

Access specifiers can be specified at the begining when creating a method or attribute. Ex : "+ getDescription()"

* "+" =  Public
* "-" =  Private
* "#" =  Protected

## Points to be Remembered when drawing Class Diagrams

* Return type of any method can be specified after the method name seperated by a colon. Ex : "getData(): int".

* Parameters are passed to the methods where the parameter name is followed by its data type seperated by a colon. Ex: "name: String".

* [x] isAbstract must be ticked to mark a class <b>Abstract</b> and is denoted by Italic Class name in diagram.

* [x] isLeaf must be ticked to mark a method or attribute <b>Final</b>.

* [x] isStatic must be ticked to mark a method or attribute <b>Static</b> and is denoted by underline in diagram.

## Software Used

### For Designing : 

<img src="https://staruml.io/image/staruml_logo.png" width="50" />

[StarUml](https://staruml.io/)

### For Execution : 

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/800px-IntelliJ_IDEA_Icon.svg.png" width="50" />

[IntelliJ IDEA](https://www.jetbrains.com/idea/)