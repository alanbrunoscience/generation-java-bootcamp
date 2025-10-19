# Collections in Java

<br />

## 1. What are Collections in Java?

<br />

⚠️ **Array Limitations:** When you create an array in Java, it has a **fixed size** determined at initialization. Example:

<br />

```java
int[] numeros = new int[3];

numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;

// If you try to add more, it throws an error

```

<br />

This means that if you need to store more elements later, you cannot increase the size of this array.

<br />

---------------------------------------------------------------------------------------------------------------

### 1.1. Solution: Collections

<br />

The **Java Collections Framework** (JCF) is a set of interfaces and classes in the **`java.util`** package that addresses these limitations. It allows **storing data flexibly (without a fixed size) and with ready-made tools (methods)** for:

<br />

• Adding;

• Removing;

• Searching;

• Organizing data;

• Among others.

<br />

Internally, many collection implementations (like **`ArrayList`**) use arrays. They automatically handle resizing the underlying array, hiding this complexity from the user (**encapsulation**). Access to the elements is managed through the collection's methods.

<br />

---------------------------------------------------------------------------------------------------------------

### 1.2. Practical Example with `ArrayList`

<br />

```java
import java.util.ArrayList;

public class Example {
 public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
   
        // Adding elements
        names.add("Ana");
        names.add("Carlos");
        names.add("Maria");

        System.out.println(names); // [Ana, Carlos, Maria]

        // Removing an element
        names.remove("Carlos");
        System.out.println(names); // [Ana, Maria]

        // Searching for an element by index
        System.out.println(names.get(0)); // Ana
 }
}

```

<br />

Unlike arrays, you can **GROW** or **SHRINK** this list whenever you want.

<br />

---------------------------------------------------------------------------------------------------------------

### 1.3. Why use Collections?

<br />

Each collection type has different advantages:

<br />

1. Some are faster for **SEARCHING** an element (e.g., **`HashSet`**);

2. Others maintain the **ORDER OF ELEMENTS** (e.g., **`ArrayList`**);

3. Others are organized as key/value pairs (e.g., **`HashMap`**).

<br />

---------------------------------------------------------------------------------------------------------------

### 1.4. Primitive Types and Wrappers

<br />

Collections **cannot store primitive types directly**. They require **objects** to be used as type parameters (generics):

<br />

```java
ArrayList<int> list; // ❌ Does not work

```

<br />

But you can use the corresponding **Wrapper** class:

<br />

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);

System.out.println(list); // [10, 20]

```

<br />

#### Wrapper Table

| Primitive Type | Wrapper   |
| -------------- | --------- |
| int            | Integer   |
| double         | Double    |
| float          | Float     |
| char           | Character |
| boolean        | Boolean   |
| long           | Long      |
| short          | Short     |
| byte           | Byte      |

<br />

> **Wrapper** =  A class (e.g., **`Integer`**, **`Boolean`**) that encapsulates a primitive type value within an object. This allows primitive values to be used in generic types (like **`Collections`**) and provides useful utility methods (e.g., **`Integer.parseInt()`**). The process of converting a primitive to a Wrapper object is called **Autoboxing**.

<br />

Example:

<br />

```java
Integer wholeNumber = 2;

```

<br />

In this example, an Object of the Integer wrapper Class, called **`wholeNumber`**, is being created, containing the value 2.

<br />

---------------------------------------------------------------------------------------------------------------

### 1.5. Wrapper Example

<br />

```java
public class WrapperExample {
    public static void main(String[] args) {
        Integer number = 2; // Object of the Integer class
        System.out.println(number + 10); // 12
        System.out.println(number.toString()); // "2"
    }
}

```

<br />

Here, **`Integer`** is an object that contains the value 2 and also offers **ready-made method**s, such as **`.toString()`**.

<br />

---------------------------------------------------------------------------------------------------------------

### 1.6. Summary

<br />

👉 A very didactic summary:

<br />

• **Arrays** = fixed size;

• **Collections** = flexible size + useful tools;

• **Wrappers** = "box" that transforms primitive types into objects, to be used in Collections.

<br />

---------------------------------------------------------------------------------------------------------------

## 2. Map of Collections in Java

<br />

```bash
Collections Framework
 ├── Main Interfaces
 │     ├── Collection (root interface)
 │     │     ├── List (ordered, allows repetition)
 │     │     │     ├── ArrayList
 │     │     │     ├── LinkedList
 │     │     │     └── Vector
 │     │     │         └── Stack (stack – LIFO: Last In, First Out)
 │     │     │
 │     │     ├── Set (no repetition)
 │     │     │     ├── HashSet (unordered)
 │     │     │     ├── LinkedHashSet (insertion order)
 │     │     │     └── TreeSet (sorted)
 │     │     │
 │     │     └── Queue (interface for FIFO — First In, First Out — behavior)
 │     │         ├── LinkedList (implements 'List' and 'Queue'/'Deque')
 │     │         ├── PriorityQueue (priority order)
 │     │         └── ArrayDeque (Deque: double-ended queue – inserts/removes on both sides)
 │     │
 │     └── Iterator (interface to traverse collections)
 │
 └── Map (key → value)  [not a subinterface of Collection, but it is part of it]
     ├── HashMap
     ├── LinkedHashMap
     ├── TreeMap
     └── Hashtable (old, synchronized)

```

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1. `List`

<br />

1. Accepts repeated elements;

2. Maintains insertion order;

3. Accesses elements by index (**`get(0)`**, **`get(1)`**, ...).

<br />

#### Main implementations

<br />

• **`ArrayList`**: **Fast for element access by index** (random access: ***O(1)***), but generally slower for insertions/removals in the middle (***O(n)***);

• **`LinkedList`**: **Fast for insertions/removals at the beginning or end** (***O(1)***). Inserting/removing at a specific position is ***O(n)*** to find the position, then ***O(1)*** for the actual link update.

<br />

Example:

<br />

```java
List<String> list = new ArrayList<>();
list.add("Ana");
list.add("Ana"); // allowed
System.out.println(list); // [Ana, Ana]

```

<br />

#### **Some observations about the code above:**

<br />

• Since **`List`** is an interface, **you cannot create a `List` object directly**. Instead, you use a class that implements the **`List`** interface, such as:

<br />

└── **`ArrayList`** - like a resizable array with fast random access;

└── **`LinkedList`** - like a train of wagons that you can easily attach or remove.

<br />

📌 **Tip**: Use **`List`** when you care about order, duplicates can occur, and you want to **access elements by index**.

<br />

#### List of Common Methods

| Method   | Description                                     |
| -------- | ----------------------------------------------- |
| add()    | Adds an element to the end of the list.         |
| get()    | Returns the element at the specified position.  |
| set()    | Replaces the element at the specified position. |
| remove() | Removes the element at the specified position.  |
| size()   | Returns the number of elements in the list.     |

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.1. `ArrayList`

<br />

The **`ArrayList`** class is the natural choice when a dynamic, resizable list is needed. It is internally implemented using an **array**, making it highly efficient for **random access** (retrieving an element by its **index**, which is an ***O(1)*** operation).

<br />

```java
ArrayList<T> grades = new ArrayList<T>();

```

<br />

• The default no-argument constructor creates a new, empty **`ArrayList`** Class Object;

• The item **`<T>`** in Java represents a **Type Parameter** used in **Generics**. It is used to define the type of object that will be stored in the Collection. The data type must necessarily be an object, which can be from a **Wrapper Class** or a **Class created by the developer**.

<br />

```java
import java.util.ArrayList;

ArrayList<String> cities = new ArrayList<String>();

```

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.1.1. Main Methods of the `List` Interface

<br />

| Method                          | Description                                                  |
| ------------------------------- | ------------------------------------------------------------ |
| add(Object)                     | Adds an object to the end of the list.                       |
| add(Index,Object)               | Adds an object to the indicated position (shifts existing elements forward). |
| get(Index)                      | Retrieves an object by index.                                |
| indexOf(Object)                 | Searches for an object and returns the index of the first occurrence of the object. |
| set(Index,Object)               | Replaces the object at the position indicated in the method's first parameter with the object sent in the method's second parameter. |
| remove(Index)                   | Deletes the object stored at the indicated index position.   |
| remove(Object)                  | Deletes the object sent as a parameter to the method.        |
| clear()                         | Clears the list.                                             |
| size()                          | Returns the size of the list (number of stored elements).    |
| isEmpty()                       | Returns **"true"** if the list is empty.                     |
| contains(Object)                | Returns **"true"** if there is an occurrence of the element in the list. |
| sort(null)                      | Sorts the elements of the list in ascending order.           |
| sort(Comparator.reverseOrder()) | Sorts the elements of the list in descending order.          |

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.1.2. Example Code

<br />

```java
package lesson09.collections;

import java.util.ArrayList;
import java.util.Locale;

public class Example01ArrayList {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Creates the Collection ArrayList, of type Double, called 'grades'
        ArrayList<Double> grades = new ArrayList<Double>();

        // Creates an Object of the Double Wrapper Class
        Double y = Double.valueOf(9);

        // Insert grades into ArrayList 'grades'
        grades.add(y);
        grades.add(7.0);
        grades.add(5.0);
        grades.add(4.0);
        grades.add(10.0);
        grades.add(4.0);

        System.out.println("****** Working With ArrayList ******\n");

        // Display notes added in 'grades'
        System.out.printf("→ Grades registered: %s;\n", grades); // [9.0, 7.0, 5.0, 4.0, 10.0, 4.0]

        /*
         * Displays the position (index) of a given note.
         * If there are two identical notes, the position of the first note found will be displayed.
         */
        System.out.printf("\n→ The position of the first occurrence of '%.2f' on list is: %d;\n", 4.0, grades.indexOf(4.0)); // 3

        // Displays whether a given grade exists in the list
        System.out.printf("\n→ Is grade '%.2f' on the list? %b;\n", 5.0, grades.contains(5.0)); // true

        // Displays the registered grade in a determined position (index)
        System.out.printf("\n→ At the position '%d', the registered grade is: %.2f;\n", 4, grades.get(4)); // 10.00

        // Changes the grade 5.0 to 6.0 and shows that the change was made
        System.out.printf("\n→ Previous grades: %s;\n", grades); // [9.0, 7.0, 5.0, 4.0, 10.0, 4.0]

        grades.set(grades.indexOf(5d), 6.0d);
        System.out.printf("→ The grade '%.2f' was changed to '%.2f': %s;\n", 5d, 6.0d, grades); // [9.0, 7.0, 6.0, 4.0, 10.0, 4.0]

        // Remove grade '4.0' and show that the deletion was successful. Note that only the first grade '4.0' was deleted.
        grades.remove(grades.indexOf(4.0));
        System.out.printf("\n→ The grade '%.2f' was removed: %s;\n", 4.0, grades); // [9.0, 7.0, 6.0, 10.0, 4.0]

        // Checks if the list is empty
        System.out.printf("\n→ Is the list empty? %b;\n", grades.isEmpty()); // false

        // Displays the size of the list (number of elements)
        System.out.printf("\n→ The list size is: %d;\n", grades.size()); // 5

        // Clears the list and shows that it is empty
        grades.clear();
        System.out.printf("\n→ The list is empty: %s.\n", grades); // []

    }
}

```

<br />

The **ArrayList** Collection always **preserves the order in which the objects were inserted**, ensuring that the new object is added after the last existing element.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.2. Iterator

<br />

The **`Iterable`** interface is the **root interface for the enhanced `for` loop (or "for-each" loop)**. The **`Collection`** interface is the root of the Collections **hierarchy**, and it extends **`Iterable`**. The main function of an iterator is to **allow the user to traverse all the objects of any of the Collections**, present in the Collections Package, as if they were simple sequences of data items. It is like a "cursor" that navigates element by element.

<br />

The **`Iterator`** is used to traverse (**`Set`**, **`List`**, **`Queue`**, **`Deque`**) elements. **`Map`** is not a sub-interface of **`Collection`**, so you iterate over its **key set**, **value collection**, or **entry set**.

<br />

#### Syntax

<br />

```java
Iterator<T> iteratorName = collectionName.iterator();

```

<br />

The item **`<T>`** in Java represents a **Java Type Generic**. It is used to define the type of object that will be stored in the Collection. The data type must necessarily be an object, which can be from a **Wrapper** class or a **class created by the developer**.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.2.1. Main Methods of the Iterator

<br />

| Method    | Description                                                  |
| --------- | ------------------------------------------------------------ |
| hasNext() | Returns **"true"** if there are still elements to iterate over. |
| next()    | Returns the next element in the collection. It throws the **"NoSuchElementException"** exception if no other element is present. |
| remove()  | Removes the last element returned by **next()**.             |

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.2.2. What Are the Advantages and Disadvantages of Using the Iterator Interface?

<br />

✅ The main advantages of the **Iterator** interface are:

<br />

• We can use this interface with any Collection;

• It is a universal Iterator (cursor) for Collections;

• Method names are simple and easy to use.

<br />

❌ The main limitations of the Iterator Interface are:

<br />

• The **`Iterator`** only supports **forward** iteration (unidirectional). The **`ListIterator`** (specific to the `List` interface) supports bidirectional iteration;

• The **`Iterator`** does not natively support **parallel** processing. The **`Spliterator`** interface is used to traverse elements and is designed to support **parallel traversal and bulk operations**, making it the foundation for parallel streams.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.2.3. Example - `ArrayList` Collection and `Iterator`

<br />

```java
package lesson09.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Example02ArrayListAndIterator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Creates the Collection ArrayList, of type Double, called 'grades'
        ArrayList<Double> grades = new ArrayList<Double>();

        // Creates an Object of the Double Wrapper Class
        Double y = Double.valueOf(9);

        // Insert grades into ArrayList 'grades'
        grades.add(y);
        grades.add(7.0);
        grades.add(5.0);
        grades.add(4.0);
        grades.add(10.0);
        grades.add(4.0);

        // Display grades added in 'grades' through the For... Each loop
        System.out.println("*** Display Registered Grades - For... Each ***\n");
        int count = 1;
        for (Double grade : grades) {
            System.out.printf("→ %dº grade: %.2f\n", count, grade);
            count++;
        }

        // Display grades added in 'grades' through the For... Each loop
        System.out.println("\n*** Display Registered Grades - Iterator Interface ***\n");

        Iterator<Double> iGrades = grades.iterator();

        int count2 = 1;

        while (iGrades.hasNext()) {
            System.out.printf("→ %dº grade: %.2f\n", count2, iGrades.next());
            count2++;
        }

    }
}

```

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.3. `Set` Collection

<br />

The **`Set`** interface, part of the **Java Collections Framework**, defines a collection that **cannot contain duplicate elements**. It is used to model mathematical sets.

<br />

Unlike **`List`**, **`Set`** implementations generally do not guarantee the order of elements, and critically, **do not support access by index** (like `get(index)`), as the concept of a fixed position contradicts its mathematical nature.

<br />

Key characteristics and implementation details include:

<br />

- **No Duplicates:** The primary rule is that a **`Set`** ensures every element is unique.

<br />

- **Ordering Varies by Implementation:**

  - **`HashSet`** is the most common implementation; it makes **no guarantee of element order** (it is **unordered**);

  - **`LinkedHashSet`** maintains the **insertion order** of elements;
  
  - **`TreeSet`** maintains elements in **natural sort order** or by a specified **`Comparator`**.

<br />

#### How `HashSet` Works Internally (Hashing)

<br />

The **`HashSet`** implementation achieves its high performance for basic operations (add, remove, contains) by using a technique called **hashing**.

<br />

- **Internal Storage:** A **`HashSet`** internally uses a **`HashMap`** to store its elements. When you create a **`HashSet`** object, an associated **`HashMap`** object is created.

​<br />

- **Key-Value Mapping:**

  - The elements you add to the **`HashSet`** are stored as the **keys** in the internal **`HashMap`**.

  - The **value** associated with these keys is a constant, placeholder object (often referred to as **`PRESENT`**).

<br />

- **Hash Code Calculation:** When an object is added to the **`HashSet`**, the object's **`hashCode()`** method is called.

  - The **hash code** is an **`int` value** (a 32-bit signed integer), not specifically a "7-digit integer."

  - This hash code is used to determine which internal **bucket** the element will be stored in, enabling **near constant-time (*O(1)*) performance** for lookups.

<br />

In summary, for **`HashSet`**, the focus is on **ensuring the exclusivity of its elements** using the efficiency of hashing, rather than maintaining a specific order or position.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.3.1. `Set` Syntax

<br />

```java
Set<T> setNumbers = new HashSet<T>();

```

<br />

Here, **`Set`** is the interface, and **`HashSet`** is a concrete class implementing that interface. The item **`<T>`** in Java represents a **Type Parameter** used in **Generics** to define the type of object that will be stored in the Collection (it must be a **Wrapper Class** or a **developer-defined Class**).

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.3.2. Set Collection Methods

<br />

The **`Set`** interface inherits many standard methods from the **`Collection`** interface, including:

<br />

| Method           | Description                                                  |
| ---------------- | ------------------------------------------------------------ |
| add(Object)      | Adds an object to the **`Set`**. Returns **`true`** if the element was added (i.e., it was not a duplicate), or **`false`** otherwise. |
| remove(Object)   | Deletes the specified object from the **`Set`**.             |
| clear()          | Removes all elements from the **`Set`**.                     |
| size()           | Returns the number of elements in the **`Set`**.             |
| isEmpty()        | Returns **`true`** if the **`Set`** contains no elements.    |
| contains(Object) | Returns **`true`** if the specified object exists in the **`Set`**. |
| hashCode()       | Returns the hash code value for the **`Set`** (equal to the sum of the hash codes of all elements). |

<br />

---------------------------------------------------------------------------------------------------------------

## 3. General Summary

<br />

| **Concept**     | **Definition**                                               |
| --------------- | ------------------------------------------------------------ |
| **Collections** | The **root interface** of the Collections Framework, used to manipulate **dynamic, flexible-sized groups of objects**. |
| **Array**       | A native data structure that holds a **fixed number** of elements of a single type, **primitives or objects**. |
| **ArrayList**   | The **`List`** implementation that uses a **resizable array** internally. It preserves insertion order and offers **O(1)** (constant-time) access by index. |
| **Queue**       | An Interface defining the **FIFO** (First In - First Out) behavior, where elements are typically added to the **tail** and removed from the **head**. |
| **Set**         | An Interface ensuring the collection stores only **unique elements**; it **does not support index-based access**. |
| **Map**         | An independent interface (not a sub-interface of **`Collection`**) that stores data as **key-value pairs**, where each **key is unique**. |
| **HashMap**     | The most used **implementation** of **`Map`**, based on hashing for near **constant-time (*O(1)*) performance** on basic operations like **`get`** and **`put`**. |
| **Iterator**    | An **Interface** providing a standardized, **unidirectional** mechanism to traverse a collection and perform **safe element removal** during iteration. |

<br />

---

<br />

<div align="center">
    <a href="./">
        <img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/left-arrow.png?updatedAt=1760740671610" alt="Voltar para o nível anterior" style="width: 50px; height: auto; display: block; margin: 0 auto;" />
    </a>
</div>

<br />
