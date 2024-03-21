# CPRO2221-Assign3

SOLID Principles Project Documentation
Overview

This project aims to demonstrate the understanding and application of the following three fundamental SOLID design principles: the Single Responsibility Principle (SRP), the Liskov Substitution Principle (LSP), and the Interface Segregation Principle (ISP). The project showcases the importance of SOLID principles in creating maintainable, scalable, and robust software systems.
Chosen SOLID Principles
Single Responsibility Principle (SRP)

    Importance: SRP ensures that a class has only one reason to change, enhancing its cohesiveness and making it easier to understand and maintain. It promotes modularity and simplifies the testing process.
    Application: I applied SRP by refactoring a Teacher class, which initially handled multiple responsibilities, into distinct classes each focused on a single responsibility, such as personal information management, course teaching activities, and assignment grading.

Liskov Substitution Principle (LSP)

    Importance: LSP states that objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program. This principle is crucial for ensuring that inheritance hierarchies are designed with substitutability in mind, promoting reusability and robustness.
    Application: In my project, I corrected an LSP violation involving Rectangle and Square classes by eliminating the inheritance relationship and instead adhering to a common interface, allowing both shapes to be used interchangeably without issue.

Interface Segregation Principle (ISP)

    Importance: ISP advocates for splitting large interfaces into smaller, more specific ones so that clients only depend on the interfaces they use. This principle reduces the impact of changes, minimizes recompilation, and improves code readability.
    Application: I addressed an ISP violation by dividing an IDevice interface into smaller interfaces, such as IDevice and ITemperatureDevice, allowing device classes like Light and Thermostat to implement only the functionalities relevant to them.

Project Structure

The project is structured into two main directories: Violated and Solved, each containing subdirectories for the principles SRP, LSP, and ISP. These directories include examples of principle violations and their refactored solutions, demonstrating the application of SOLID principles.

Conclusion

This project explains the significance of adhering to SOLID principles in software development. By analyzing and correcting violations of SRP, LSP, and ISP, I showed how these principles contribute to the development of software that is easier to maintain, extend, and scale.
