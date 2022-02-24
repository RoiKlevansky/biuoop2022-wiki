# Setup Assignment

The goal of this assignment is to get you through the technical requirements of the assignments of this course.
You will not be graded for this assignment. However, we strongly suggest you submit it, to verify that 
you have all prerequisite ready and you understand all submission instructions before you get into "real" assignments.  

Assignments should be submitted through the [Submission System](http://submit.cs.biu.ac.il).

### Personal Info Form

In order to allow grading of your assignments, we need to map your submit user to your personal information (ID, name, etc.).
Check in this [file](https://docs.google.com/spreadsheets/d/1zyWTNI7h5aiUtrmYSyP7kXO6xjpTtKEuRhc7z4GMEis/edit#gid=0)
if your ID is mapped to your submit user. 
The column `identifier` corresponds to the first letter of your submit user + the last 6 digits of your ID.
If your corresponding record starts with a capitalized F or if your ID is missing, please fill in a short [personal info form](https://forms.gle/ornZe2XJBN1Ey7PD6). 


**Please fill the form now before proceeding, otherwise your assignments couldn't be graded.**      

## Working Environment Guide

We have prepared a detailed [technical guide](https://docs.google.com/document/d/1L5ryhn8VO73n19YRb6iNMXXYl0vDo0m84YIN3_Rd3Ao/edit?usp=sharing) 
with general things you should probably know, especially when working from Windows. Have a look.
In addition, Ayal Klein (TA of the course in 2020) prepared very useful [videos](https://www.youtube.com/watch?v=Sr8iEftSWfI&list=PLtQ-fYSVAsxrvXVIKUtriFwz53Pn1N1m-&index=1)
 in hebrew, explaining how to install JDK 13 (we will use JDK 15) and some other stuff. 


## Install Java

Install the Java Development Kit (JDK). 
This year, we will use the most recent Java version, which is Java 15.
Download the installation file from [here](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) and run it.

## Make sure that your installation is working

Open up a terminal window, and issue the following commands:

```
java -version

javac -version
```

You should see output similar to:
```
java 15.0.2 2021-01-19
Java(TM) SE Runtime Environment (build 15.0.2+7-27)
Java HotSpot(TM) 64-Bit Server VM (build 15.0.2+7-27, mixed mode, sharing)
```

and
```
javac 15.0.2
```

## Write, Compile and Run a simple program

1. Create a file named `HelloWorld.java`
2. Enter the following content:
```java
/**
 * @author Someone
 */
public class HelloWorld {
   /**
    * This is a traditional demo class to demonstrate how to
    *  write, build and run a Java program.
    *
    * @param args command line arguments.
    */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}
```
3. Compile the program using: `javac HelloWorld.java`
4. Verify that a corresponding `HelloWorld.class` file is created.
5. Run the compiled program: `java HelloWorld`

You should see the output
```
Hi
Hi
Hi
Hi
Hi
```


## Install Ant 

Please follow [[Installing Ant]] for installing ant on your computer. 



## Make sure you understand the Submission Instructions

Please read the general [[Submission Instructions]] for the course. 
You must fully understand and follow these instructions for every assignment in this course.
Now is a good time to carefully read it and to follow the instructions provided there. 



You may ask questions on [piazza](https://piazza.com/class/kkzbow4lvwx2uc).