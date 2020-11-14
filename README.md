# Welcome to Singleton Design pattern 👋
![Version](https://img.shields.io/badge/version-1.0-blue.svg?cacheSeconds=2592000)
[![License: GNU](https://img.shields.io/badge/License-GNU-yellow.svg)](#)

> simple explanation with example of singleton design pattern in java

## purpose of Singleton

The purpose of the singleton class is to control object creation, limiting the number of objects to only one. The singleton allows only one entry point to create the new instance of the class. Singletons are often useful where we have to control the resources, such as database connections or sockets.


There are many ways this can be done in Java. All these ways differs in their implementation of the pattern, but in the end, they all achieve the same end result of a single instance.

In this repo i describe only 3 ways : Eger, lazy & threadsafe

## Order

1- Eager 

2- Lazy

3- ThreadSafe

4- Main

## Description 
1- Eager     : Eager initialization is easy to implement but it may cause resource and CPU time wastage. 
   Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class.

2- Lazy      : Using Static block in Eager initialization we can provide exception handling and also can control over instance.

3-ThreadSafe : By Using synchronized we can create singleton class in multi-threading environment also but it can cause slow performanc


## Install

```sh
// just clone the project
```


## Author

👤 **Asri Ilyass**

* Website: fb.com/asr.ilyass
* Github: [@mr-ilyass](https://github.com/mr-ilyass)
* LinkedIn: [@ilyass-asri](https://linkedin.com/in/ilyass-asri)

## Show your support

Give a ⭐️ if this project helped you!


***
