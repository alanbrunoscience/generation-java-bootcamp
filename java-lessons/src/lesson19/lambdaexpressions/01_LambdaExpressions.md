# Lambda Expressions

<br />

A **Lambda Expression** is a concise way to represent an **anonymous function**—that is, a function without a name—that can be defined and used directly within the body of a method. This construct takes parameters and returns a value, behaving similarly to a regular method but without the need for explicit declaration within a class.

<br />

Lambda Expressions were introduced in Java starting with version 8, as part of the effort to incorporate **Functional Programming** concepts into the language. With them, it became possible to write code that is more **concise, readable, and expressive**. They also facilitated the use of APIs that operate with functions as arguments, such as the **`forEach()`** method and the **Streams API** framework. This addition significantly increased the language's flexibility, especially in scenarios involving functional collection processing and reactive programming.

<br />

------

## Syntax

<br />

```java
parameter list -> function body
```

<br />

A Lambda Expression consists of three main components: a set of parameters, the Lambda Operator, and the function body.

<br />

### Components

<br />

1. **Parameter List:** This contains the arguments for the function, which can be empty or non-empty.
2. **Lambda Operator:** The Lambda Operator (or **arrow** `->`) is used to separate the parameter list from the function body.
3. **Function Body:** This contains the function statement(s) for the Lambda Expression.

<br />

The input parameters are on the left side of the Lambda Operator, and the function body is on the right side. This concise syntax significantly **reduces the volume of code**, often condensing what might be five lines of code into a single line.

<br />
