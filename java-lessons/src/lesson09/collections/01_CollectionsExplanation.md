# Collections in Java

<br />

## 1. What are Collections in Java?

<br />

⚠️ **Array Problems:** when we create an array in Java, it has a **fixed size**. Example:

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

Java has a library called **Collections** (in the `java.util` package) that solves this problem. It allows **storing data flexibly (without a fixed size) and with ready-made tools (methods)** for:

<br />

• Adding;

• Removing;

• Searching;

• Organizing data;

• Among others.

<br />

Collections use arrays "behind the scenes," but they hide the complicated part of automatically increasing/decreasing the size (encapsulation). Thus, **the data stored in the collection is encapsulated and access to the data is only possible through predefined methods**.

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

Collections **do not directly accept primitive types**. For example, you **cannot** do:

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

> **Wrapper** = "wrapping" the primitive in an object, so that it works in collections and has extra methods. In other words, **Wrapper** means to wrap. ***They are Classes that add functionality to primitive types***. The Wrapper Class **transforms a primitive into an Object and adds Methods**.

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
 │     │     └── Queue (queue - FIFO: First In, First Out)
 │     │         ├── LinkedList
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

• **`ArrayList`**: fast for searching elements;

• **`LinkedList`**: fast for inserting/removing at any position.

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

The **`ArrayList`** Collection is the natural choice when a resizable vector is needed, which is much more efficient for reading, as it is internally implemented with vectors, making it ideal for random access to the stored data:

<br />

```java
ArrayList<T> grades = new ArrayList<T>();

```

<br />

• The default no-argument constructor creates a new, empty **`ArrayList`** Class Object;

• The item **`<T>`** in Java represents a **Java Type Generic**. It is used to define the type of Object that will be stored in the Collection. The data type must necessarily be an Object, which can be from a Wrapper Class or a Class created by the developer.

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

The **`Iterable`** interface is the root of the entire collection hierarchy, which means that every class and interface implements it. The main function of an iterator is to **allow the user to traverse all the objects of any of the Collections**, present in the Collections Package, as if they were simple sequences of data items. It is like a "cursor" that navigates element by element.

<br />

The Iterator should be used whenever we want to enumerate elements in all interfaces implemented by Collections: **`Set`**, **`List`**, **`Queue`**, **`Dequeue`**, and all classes implementing the **`Map`** interface.

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

• The Iterator only supports forward direction iteration, meaning unidirectional;

• The Iterator **DOES NOT** support parallel element iteration, meaning it only supports sequential iteration.

<br />

> 📌 ***Tip***
>
>
>
> To perform parallel iteration, we use another Interface, called **`SplitIterator`**, which divides the Collection into smaller parts and traverses these parts simultaneously.

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

**`Set`** is an **UNORDERED COLLECTION OF OBJECTS**, which **DOES NOT ALLOW THE STORAGE OF DUPLICATE VALUES**, meaning it allows **ONLY UNIQUE VALUES**. This interface contains methods inherited from the Collection Interface and adds a feature that restricts the insertion of duplicate elements. This class also allows the insertion of a single null element (NULL), although it is not recommended.

<br />

The objects we insert into the **`Set`** Collection **WILL NOT, NECESSARILY, BE INSERTED IN THE SAME ORDER** and this order is not constant over time. The **`Set`** Collection **DOES NOT HAVE A METHOD TO GET THE OBJECT FROM ITS INDEX**, as we saw in the List Collection.

<br />

Objects are inserted into the **`Set`** **Collection** based on their **HASHCODE**. The **HASHCODE** is a 7-digit integer, calculated from the **Hashcode()** Method. From the Object's **Hashcode**, obtained by the **Hashcode()** method, the **`Set`** Collection determines the position where the Object will be stored in the **HashMap**. Since it is a calculated number, **THE POSITION OF THE ELEMENT WILL BE RANDOM**.

<br />

**`HashSet`** internally uses **HashMap** to store its elements. Whenever you create a **`HashSet`** object, an associated **HashMap** object is also created. This **HashMap** object is used to store the elements inserted into the **`HashSet`**. The elements added to the **`HashSet`** are stored as keys in this **HashMap** object. The value associated with these keys will be a constant (PRESENT).

<br />

In summary, for each object inserted into the **`Set`** Collection, the **Hash** function is executed, that is, the object's **hashcode()** is calculated. From this calculation, the object's position in the HashMap is defined, without considering the order of insertion. The elements that were added to the Set Collection are inserted into the HashMap in the **"Key"** property of the HashMap item, while the **"Value"** property will always receive the **PRESENT** constant.

<br />

> 📌 **Attention!**
>
>
>
> The focus of the **`Set`** Collection is not the ordering and position of element insertion in the Collection, but rather to ensure the exclusivity of its elements, i.e., unique values, without repetitions.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.3.1. `Set` Syntax

<br />

```java
Set<T> setNumbers = new HashSet<T>();

```

<br />

In our course, we will study the **`Set`** Collection, Subclass **`HashSet`**. The default no-argument constructor creates a new, empty **`HashSet`** Class object.

<br />

The item **`<T>`** in Java represents a **Java Type Generic**. It is used to define the type of object that will be stored in the Collection. The data type must necessarily be an object, which can be from a **Wrapper Class** or a **Class created by the developer**.

<br />

---------------------------------------------------------------------------------------------------------------

### 2.1.3.2. Set Collection Methods

<br />

In the table below, we list the main methods for working with the **`Set`** Collection:

<br />

| Method           | Description                                                  |
| ---------------- | ------------------------------------------------------------ |
| add(Object)      | Adds an object to the Set Collection.                        |
| remove(Object)   | Deletes the Object stored in the Set Collection.             |
| clear()          | Clears the Set Collection.                                   |
| size()           | Returns the size of the Set Collection (number of stored elements). |
| isEmpty()        | Returns **"true"** if the Set Collection is empty.           |
| contains(Object) | Returns **"true"** if the Object exists in the **`Set`** Collection. |
| hashCode()       | Returns the **HashCode** of the element.                     |

<br />

---------------------------------------------------------------------------------------------------------------

## 3. General Summary

<br />

| **Concept**     | **Corrected Definition (English)**                           |
| --------------- | ------------------------------------------------------------ |
| **Collections** | Interfaces in Java used to manipulate dynamic, flexible-sized groups of data of the same type. |
| **Array**       | A native data structure that holds a **fixed number** of values of a single type. |
| **ArrayList**   | The **`List`** implementation that is **backed by a dynamic array**. It preserves insertion order and allows fast random access by index. |
| **Queue**       | An Interface defining the **FIFO** (First In - First Out) behavior, where the first element inserted is the first one to be retrieved/removed. |
| **Set**         | An Interface ensuring the collection stores only **unique values** (no duplicates). |
| **HashSet**     | The most common **implementation** of `Set`, using hash tables internally to guarantee uniqueness and fast lookups. |
| **Map**         | A structure used for **fast data retrieval**. It stores data in the form of **key-value pairs** (and is not formally part of the Collection Interface). |
| **HashMap**     | The most used **implementation** of `Map`, based on hashing for near constant-time (O(1)) data access. |
| **Iterator**    | An **Interface** that provides a standardized way to traverse (iterate over) all objects in a Collection and is the explicit mechanism used for safe removal of elements during iteration. |

<br />

---

<br />

<div align="center">
    <a href="./">
        <img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/left-arrow.png?updatedAt=1760740671610" alt="Voltar para o nível anterior" style="width: 50px; height: auto; display: block; margin: 0 auto;" />
    </a>
</div>

<br />
