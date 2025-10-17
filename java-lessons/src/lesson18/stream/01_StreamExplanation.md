# Stream API

<br />

The **Streams API** was introduced in Java 8 and is widely used for processing **data collections** (such as lists or sets). It allows developers to work with this data simply, using cleaner, more maintainable code, and avoiding common runtime errors.

<br />

A **Stream** is a sequence of objects that can pass through several chained methods to produce a desired result, such as filtering or sorting data.

<br />

Many people confuse a **Stream** with a **data structure**, but they are different things. **A Stream does not store data. Instead, it processes data from a structure**, like a **Collection** (list, set) or an **Array**.

<br />

The simplified processing of collections using Streams was made possible by incorporating the **Functional Paradigm** and **Lambda Expressions**. The goal is to iterate over each element of the collection and perform actions like filtering, mapping, or transforming the data.

<br />

* **Functional Paradigm:** Unlike imperative programming, which uses a set of instructions for the computer to execute, functional programming uses **mathematical functions** (lambda expressions). These functions receive data, apply operations, and return a result. The input does not change, but the operations can be altered to modify the output.

<br />

* **Lambda Expression:** A block of code that accepts parameters and returns a value. Unlike a traditional method, a lambda expression has no name and can be defined directly within the body of a method.

<br />

------

## Stream Pipeline

<br />

The Stream pipeline is composed of two types of operations:

<br />

### 1. Intermediate Operations

<br />

These are operations that **return a new Stream**. They allow you to chain several operations, such as filtering or mapping data. Each intermediate operation creates a new Stream, enabling you to continue processing the data.

<br />

### 2. Terminal Operations

<br />

These are operations that **finalize the Stream processing** and return a result, such as a value or an object. After a terminal operation is executed, the Stream cannot be altered or receive new intermediate or terminal operations. This means the Stream is consumed and cannot be reused.

<br />

Here, you can see a complete diagram of the Stream pipeline:

<br />

![Java Stream Pipeline Diagram](https://ik.imagekit.io/alanbrunoscience/Aleatory/Stream_Pipeline.svg?updatedAt=1759939081710)

<br />

---

## Streams vs. Collections

<br />

At first glance, **Collections** and **Streams** may seem similar, as both deal with sequences of data. But what is the difference?

<br />

> **"Collections represent data, while Streams represent the results of operations performed on that data."**

<br />

The main difference lies in **when** the data is processed:

<br />

* **Collections** are data structures that store elements in memory. Every value is computed and added to the collection when inserted; the data is ready for use the moment it is stored.

<br />

* **Streams**, on the other hand, are sequences of data that **are only processed on demand** (lazily). This means elements are **calculated as you traverse** the Stream, performing operations like filtering, mapping, or transforming.

<br />

When working with the **`Collection`** interface, you must **manage the iteration** of elements manually (using loops). This is called **external iteration**. When you use a **Stream**, the iteration is done automatically by the Stream itself, through **internal iteration**. The Stream is responsible for processing the data and applying the defined operations, typically using **lambda expressions** provided by the developer.

<br />

It is important to understand that:

<br />

* A Stream **is not a data structure**. It only **receives** a Collection and performs operations on it.

<br />

* A Stream **does not alter the original Collection**. It generates **new results** based on the applied operations, but the original data structure remains unchanged.

<br />

### Summary of Differences: Streams vs. Collections

<br />

| Streams                                                      | Collections                                                  |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| Do not store data. They **operate** on the source **Collection**, processing its data. | Store and maintain **all data** in structures like List, Set, among others. |
| Use **functional interfaces**, such as lambda expressions, making the code more concise and functional. | Do not inherently use functional interfaces. The code tends to be more imperative. |
| Are **consumable**. Once processed, a Stream cannot be reused and must be created again for another operation. | Are **not consumable**. A Collection can be traversed multiple times without needing recreation. |
| Support **sequential and parallel processing**, allowing you to choose between optimized performance or simplicity. | Support **parallel processing**, but the **Map** Collection often has better performance in this case. |
| Are **not modifiable**. It is not possible to add or remove elements directly from a Stream. | Are **modifiable**. It is possible to add, remove, or change elements directly in the Collection. |
| **Internal iteration**. The Stream performs the iteration automatically, applying the developer-defined operations. | **External iteration**. Iteration is done manually, usually with loops, such as `for-each`. |

<br />

* **Sequential Processing:** Operations are executed **one after the other**, in the order they were written in the code.

<br />

* **Parallel Processing:** Operations are executed **simultaneously**, in parallel, aiming to **increase performance**. This is useful when the **order of operations doesn't matter**, allowing multiple operations to be done at once, better leveraging the power of multiple processors.

<br />

### Syntax

```java
// Collection of numbers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Generate the Stream from the Collection
Stream<Integer> numbersStream = numbers.stream();

// Generate the Stream from a list of numbers directly
Stream<Integer> newNumbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
```

<br />

Both forms above provide us with a Stream Object. We call the **`stream()`** method on the Collection Object or pass the values directly to the **`Stream.of()`** method.

<br />

---

## Intermediate Methods

<br />

**Intermediate Methods** or **Intermediate Operations** are methods that **return a new Stream**. This allows you to continue chaining more operations on the data. They **do not alter the original Stream** but create a new one, enabling multiple transformations in a chained manner.

<br />

Now, let's explore the **most used intermediate methods** of the Stream API. In the following code examples, we will use these three Collections:

<br />

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> unorderedNumbers = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo", "São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
```

<br />

Let's go to the code examples!

<br />

***Source: <https://github.com/conteudoGeneration/cookbook_java_fullstack/blob/main/01_java/19.md>***

<br />

---

<br />

<div align="center">
    <a href="./">
        <img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/left-arrow.png?updatedAt=1760740671610" alt="Voltar para o nível anterior" style="width: 50px; height: auto; display: block; margin: 0 auto;" />
    </a>
</div>

<br />
