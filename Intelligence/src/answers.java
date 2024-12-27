public class answers {
//    I. Inheritance and Polymorphism
//* Does every class inherit? If yes, from which class?
//            * No, not every class explicitly inherits.
//            * By default, if no inheritance is specified, a class implicitly
//            inherits from the Object class, which is the root of all classes in Java.
//* What keyword do you need to add to the class header to inherit from another class?
//            * The keyword is extends.
//            * What is the keyword super and what do we use it for?
//* The super keyword is used to:
//              * Call the constructor of the superclass: super(arguments); must be the
//              first statement in the subclass constructor.
//              * Access members (methods and fields) of the superclass: super.methodName(),
//              super. fieldName.
//* Do we always need to call the constructor from the superclass?
//            * Yes, if the superclass has a constructor with parameters, you must
//            explicitly call the superclass constructor using super(...) in the first
//            line of the subclass constructor. If the superclass has a default no-argument
//            constructor, you don't need to explicitly call it, as it's called implicitly.
//* Is there a set place where you need to call the constructor from the superclass?
//            * Yes, the call to the superclass constructor using super(...) must be the
//            first statement within the subclass constructor.
//* What is the difference between overloading a method and overriding it?
//            * Overloading:
//            * Occurs within the same class.
//            * Methods have the same name but different parameters (types, number, or order).
//            * Overriding:
//            * Occurs in a subclass.
//            * The method has the same name, return type, and parameters as the method
//            in the superclass.
// * What is polymorphism? When can we observe it?
//            * Polymorphism allows objects of different classes to be treated as objects
//            of a common type (e.g., a parent class).
//            * We observe it when:
//            * A subclass object is assigned to a variable of the superclass type.
//            * Method overriding is used.
//    II. Code Analysis
//* Why doesn’t the line animals[1].bite(); work?
//            * The animals array is declared as Animal[].
//            * While the Snake class inherits from Animal, the array only "knows" about
//            the methods and properties defined in the Animal class.
//            * The bite() method is specific to the Snake class and is not accessible
//            through the Animal reference.
}
