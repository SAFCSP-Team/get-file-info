### Get File Information

#### Objectives
Understand how to access a file's information, such as the file's name, size, and path.

#### Concepts
These concepts are the main used concepts in the project solution, kindly read the provided resources if any is new to you.

| Concepts                     | Resources                                                                                                            |
|------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory   | [Dev.Java ](https://dev.java/learn/java-io/)                                                                         |
| System Properties            | [Java Documenation of System Properties](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html) |


#### Problem
Print out a file's information (name, size, type, owner, created at, and path).


#### Implementation
Do the implementation of the `printFileInfo` method:
1. Initialize a variable with `Path` data type , and assign it `Paths.get(/* file path*/)`.
2. Pass the variable that you have just created to the `printFileInfo(/* file path*/)` method.
2. Assign the correct value to the following.

>* fileName
>* fileOwner
>* fileType
>* fileZie


```java
public static void printFileInfo(String filePath) throws IOException {
        /* Your Code Here */

        String fileName = "";
        var fileOwner = "";
        var fileType = "";
        var fileZie = "";
}
```
