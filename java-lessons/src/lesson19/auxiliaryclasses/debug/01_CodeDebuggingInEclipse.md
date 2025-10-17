# Code Debugging in Eclipse/STS

<br />

Code **Debug** (debugging) allows a developer to execute a program interactively while observing the source code and the changes that variables undergo during execution.

<br />

A **Breakpoint** in the source code specifies where the program execution should stop during debugging. Once the execution stops the program at the indicated point, you can execute line by line, step-by-step, and investigate variables, change their content, among other actions.

<br />

To exemplify how Debugging works, create a new Java Project and insert the code below:

<br />

```java
package lesson19.auxiliaryclasses.debug;

import java.util.Scanner;

public class Example01TestDebug {

 public static void main(String[] args) {

  try (Scanner input = new Scanner(System.in)) {

   int[] arrayIntegers = new int[5];

   System.out.println("********** Data Input **********\n");
   for (int i = 0; i < arrayIntegers.length; i++) {
    System.out.printf("%d) Enter the integer for the position [%d]: ", (i + 1), i);
    arrayIntegers[i] = input.nextInt();
   }

   System.out.println("\n\n********** Data Output **********\n");
   for (int i = 0; i < arrayIntegers.length; i++) {
    if (i != arrayIntegers.length - 1) {
     System.out.printf("%d) Element of the position [%d] = %d;%n", (i + 1), i, arrayIntegers[i]);
    } else {
     System.out.printf("%d) Element of the position [%d] = %d.%n", (i + 1), i, arrayIntegers[i]);
    }

   }

  }

 }

}

```

<br />

If you execute the code above in the traditional way, you will observe that data entry for the array will be requested, and at the end, all the data inserted into the array will be displayed, as seen below:

<br />

```bash
********** Data Input **********

1) Enter the integer for the position [0]: 1
2) Enter the integer for the position [1]: 2
3) Enter the integer for the position [2]: 3
4) Enter the integer for the position [3]: 4
5) Enter the integer for the position [4]: 5


********** Data Output **********

1) Element of the position [0] = 1;
2) Element of the position [1] = 2;
3) Element of the position [2] = 3;
4) Element of the position [3] = 4;
5) Element of the position [4] = 5.
    
```

<br />

## 1. Executing The Code In Debug Mode

<br />

First, we need to define a Breakpoint. Let's insert a Breakpoint on line 14, which is the Loop responsible for inserting data into the array:

<br />

1. On line 14, click on the number 14 with the right mouse button:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code01.png?updatedAt=1760647358306" title="Code" /></div>

   <br />

2. In the menu that opens, click the **Toggle Breakpoint** option:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code02.png?updatedAt=1760647866134" alt="Code print"/></div>

​ <br />

3. You will observe that a small circle (dot) will be added next to the number 14, indicating that the Breakpoint has been added.

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code03.png?updatedAt=1760648854161" alt="Code print"/></div>

   <br />

### 1.1. Enabling Debug Mode

<br />

Next, let's run the code in **Debug** mode:

<br />

1. On the main toolbar, click the **Debug** icon (a beetle icon), as shown in the image below:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code04.png?updatedAt=1760649416843" alt="Code print"/></div>

   <br />

2. Next, the following message will be displayed, asking if you wish to execute the **Debug**. Click the **Switch** button:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code05.png?updatedAt=1760649582494" alt="Code print"/></div>

   <br />

3. The window below will open:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code06.png?updatedAt=1760732100061" alt="STS Eclipse Debug Mode"/></div>

   <br />

4. The main change in **Debug** mode is the **Variables window**:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code07.png?updatedAt=1760732716643" alt="Debug Mode Variables Window"/></div>

   <br />

5. In the window above, you can monitor all changes to all variables in your program and identify any errors.

​ <br />

6. Eclipse provides buttons on the main toolbar (see the image below) to control the execution of the program you're debugging. It's usually easiest to use the corresponding shortcut keys to control this execution.

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code08.png?updatedAt=1760733758638" alt="
   Debug Control Buttons"/></div>

   <br />

| **Key** | **Command**     | **Description**                                              |
| ------- | --------------- | ------------------------------------------------------------ |
| **F5**  | **Step Into**   | Executes the currently selected line and moves to the next line in your program. If the selected line is a method, it executes all debugger steps in the associated code. |
| **F6**  | **Step Over**   | F6 steps *over* the method call, meaning it executes a method without debugging (stepping into) it. |
| **F7**  | **Step Return** | F7 proceeds to the caller of the currently executed method. This finishes the execution of the current method and returns to its caller. |
| **F8**  | **Resume**      | F8 tells the Eclipse debugger to resume the execution of the program code until it reaches the next breakpoint or checkpoint. |

​ <br />

7. In the animation below, we will see the execution of our code in **Debug** mode. Note that the **F6 command (Step Over) was used to execute the code step-by-step** starting from the Breakpoint:

   <br />

   <div align="center">
    <img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/DebuggingTheCodeDef.gif?updatedAt=1760737359517" alt="Running the Code In Debug Mode" />
   </div>

   <br />

   → ***Notice in the animation above, in the Variables window, that for each number entered, a new position in the vector is filled.***

   <br />

8. To return to **Java mode** (Eclipse's default window), click the Java button, located at the end of the main Toolbar, as shown in the image below:

   <br />

   <div align="center"><img src="https://ik.imagekit.io/alanbrunoscience/Aleatory/Code09.png?updatedAt=1760737939475" alt="
   Java Mode"/></div>

   <br />

***Source: <https://github.com/conteudoGeneration/cookbook_java_fullstack/blob/main/01_java/b05.md>***
