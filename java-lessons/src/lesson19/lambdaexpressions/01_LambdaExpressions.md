# Lambda Expressions

<br />

A **Lambda Expression** is a concise way to represent an **anonymous function**—that is, a function without a name—that can be defined and used directly within the body of a method. This construct takes parameters and returns a value, behaving similarly to a regular method but without the need for explicit declaration within a class.

<br />

Lambda Expressions were introduced in Java starting with version 8, as part of the effort to incorporate **Functional Programming** concepts into the language. With them, it became possible to write code that is more **concise, readable, and expressive**. They also facilitated the use of APIs that operate with functions as arguments, such as the **`forEach()`** method and the **Streams API** framework. This addition significantly increased the language's flexibility, especially in scenarios involving functional collection processing and reactive programming.

<br />

---

## The Role of Functional Interfaces

<br />

It's important to highlight that, unlike traditional functions defined with a name and body inside classes, **Lambda Expressions in Java directly depend on Functional Interfaces to work**. They do not exist in isolation: they can only be used when associated with a **Functional Interface**—an interface with **exactly ONE abstract method**.

<br />

This association **allows the compiler to know which operation must be executed**. Without a Functional Interface as a base, the Lambda Expression lacks context and therefore cannot be applied. This characteristic is what makes the use of lambdas so powerful yet safe, ensuring clarity in defining behaviors concisely.

<br />

---

## Syntax

<br />

```java
parameter list -> function body
```

<br />


A Lambda Expression consists of three main components: a set of **parameters**, the **Lambda Operator (`->`)**, and the **function body**.

<br />

### Components

<br />

1. **Parameter List:** This contains the arguments for the function, which can be empty or non-empty.
2. **Lambda Operator:** The Lambda Operator (or **arrow** `->`) is used to separate the parameter list from the function body.
3. **Function Body:** This contains the function statement(s) for the Lambda Expression.

<br />

The input parameters are on the left side of the Lambda Operator, and the function body is on the right side. This concise syntax significantly **reduces the volume of code**, often condensing what might be five lines of code into a single line.

<br />
