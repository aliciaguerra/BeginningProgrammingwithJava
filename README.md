#Java


#Classes
Every class in Java can be composed by the following elements:
- <b>Fields or Member Variables:</b> Fields are variables that hold data specific to an object. For example, an employee might
 might have an ID number. There is one field for each object in the class.
- <b>Member Methods:</b> Member methods perform operations on an object. For example, an employee might have a method to issue
his paycheck or access his name.
- <b>Static fields:</b> Static fields are common to any object of the same class. For instance, a static field within the 
employee class could keep track of the last ID number issued. Only one static field exists for each class.
- <b>Static Methods:</b> Static methods are methods that do not affect a specific object.
- <b>Inner Classes:</b> Sometimes it is useful to contain a class within another one if it is useless outside of the class
 or should not be accessed outside the class.
- <b>Constructors:</b> A special method that generates a new object.
- <b>Parameterized Types:</b> Parameterized types can be assigned to a class during definition. The parameterized types will be
substituted with the types specified at the class's instantiation. It is done by the compiler. It is similar to the C language
macro "#define" statement, where a preprocessor evaluates the macros.

#Generics
- In 2004, generics were added to the Java programming language.
- Prior to the introduction of generics, each variable declaration had to be of a specific type.
