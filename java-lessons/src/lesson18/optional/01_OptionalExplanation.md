
# 🎁 Understanding Java `Optional`

<br />

## 1. What is `Optional`?

<br />

**`Optional`** is a class introduced in **Java 8** designed to simplify code and prevent one of the most common runtime errors: the **`NullPointerException` (NPE)**.

<br />

It acts as a container or a **box** for an object, clearly communicating whether a value of type **`<T>`** (Generics) is **present** or **absent**.

<br />

### 1.1. Key Advantages of Using `Optional`

<br />

- **Avoids `NullPointerException` errors.**
- **Eliminates the need for explicit null checks** (i.e., `if (variable != null)`).
- Leads to cleaner, more expressive, and more robust code.

<br />

### 1.2. Analogy

<br />

Think of `Optional` as a sealed **box**. When you receive a box, you don't immediately open it; you first check if it contains something.

<br />

- If the box is empty (`Optional.empty()`), you handle the absence.
- If the box contains an item (`Optional.of(value)`), you safely use the item.

<br />

------

## 2. 🏷️ Java Generics: The `<T>` Type

<br />

**Java Generics** are a feature that allows classes, interfaces, and methods to be parameterized by specific types. The `Optional` class is an example of a generic class.

<br />

### 2.1. Key Concepts

<br />

- **Type Parameter:** The letter **`<T>`** (or any capital letter inside the diamond brackets, `< >`) represents the placeholder for a specific object type.
- **Example:** `Optional<String> test`
  - This creates an `Optional` object named `test` that is guaranteed to store only a **`String`**.
- **Main Advantage:** Using Generics avoids the need for constant type casting (like `(String) obj`) and makes the code safer and more readable.

<br />

### 2.2. Generic Syntax

<br />

```java
Optional<Type> variableName;
```

<br />

------

### 2.3. `Optional` helps you achieve the following

<br />

| Task         | Benefit                                                      |
| ------------ | ------------------------------------------------------------ |
| **Safety**   | Avoids runtime `NullPointerException` errors.                |
| **Clarity**  | Clearly communicates that a method's return value *might* be absent. |
| **Elegance** | Allows for functional programming methods (like `map`, `orElse`, `ifPresent`) to handle presence/absence, reducing boilerplate code. |

<br />

---

## 3. ⚙️ `Optional` Syntax and Creation

<br />

There are three main methods used to create an `Optional` instance:

<br />

### 3.1. Syntax Examples

<br />

```java
// Optional with an empty value
Optional<String> optional = Optional.empty();

// Optional with a non-null value
Optional<String> optional = Optional.of(word[5]);

// Handles the possibility of the value being null (Best Practice)
Optional<String> optional = Optional.ofNullable(word[5]);
```

<br />

### 3.2. Creation Methods

<br />

| Method                  | Description                                                  |
| ----------------------- | ------------------------------------------------------------ |
| **`empty()`**           | Returns an **empty** `Optional` instance.                    |
| **`of(value)`**         | Returns an `Optional` with the provided value, but the value **cannot be null**. If it is null, it throws a `NullPointerException`. |
| **`ofNullable(value)`** | If the value is present, returns an `Optional` with the value; otherwise, returns an empty `Optional`. This is one of the **most recommended methods** for creating an `Optional`, especially when you are unsure if the object is, or will be, present. |

<br />

------

## 4. Key `Optional` Methods

<br />

These methods are used to safely interact with the value encapsulated inside the `Optional` container, avoiding null checks and explicit conditional logic.

<br />

| Method                      | Description                                                  |
| --------------------------- | ------------------------------------------------------------ |
| **`isPresent()`**           | Checks if a value is present. Returns **`true`** if present, otherwise **`false`**. |
| **`isEmpty()`**             | Checks if a value is absent. Returns **`true`** if absent, otherwise **`false`**. (Implemented since Java 11) |
| **`get()`**                 | If a value is present, it returns the value; otherwise, it throws a **`NoSuchElementException`**. You should only use `get()` when you are **certain** the `Optional` is not empty. |
| **`ifPresent(Consumer)`**   | If a value is present, it executes the provided action (`Consumer`) on the value; otherwise, it does nothing. |
| **`filter(Predicate)`**     | If a value is present and the value matches the filtering criterion (`Predicate`), it returns an `Optional` with the value; otherwise, it returns an empty `Optional`. |
| **`map(Function)`**         | If a value is present, it returns an `Optional` with the result of applying the mapping function (`Function`) to the value; otherwise, it returns an empty `Optional`. Commonly used with Lambda Expressions. |
| **`flatMap(Function)`**     | Similar to `map`, but is used when the mapping function itself returns an `Optional`. If a value is present, it returns the result of the mapping function; otherwise, it returns an empty `Optional`. |
| **`orElse(other)`**         | Returns the value if present. If the `Optional` is empty, it returns the **default value** provided as a parameter. |
| **`orElseGet(Supplier)`**   | Returns the value if present. If the `Optional` is empty, it returns the result produced by the `Supplier` (a function). This is generally preferred over `orElse()` when the default value is expensive to calculate. |
| **`orElseThrow(Supplier)`** | Returns the value if present. If the `Optional` is empty, it **throws the exception** specified in the parameter. |

<br />
