# 🧮 Number Summarizer

A Java program that summarizes a collection of numbers into ranges. For example, input `1 2 3 5 6` → output `1-3,5-6`.

## 📚 Introduction

This project implements a Number Range Summarizer in Java. It takes a collection of integers and produces a comma-delimited list of numbers, grouping sequential numbers into ranges. The project includes unit tests using JUnit 5 and is structured as a Maven project, making it easy to build and test on any system.

## 🎯 Project Objectives

- Demonstrate clean and maintainable Java code using Object-Oriented Design  
- Use Maven for dependency management and project structure  
- Implement unit tests to validate correctness  
- Prepare a GitHub-ready project with tests passing for submission

## 🌐 Features Overview

- Accepts any collection of integers as input  
- Outputs numbers grouped into ranges when sequential  
- Handles non-sequential numbers individually  
- Includes JUnit 5 unit tests to verify functionality  
- Works with Java 8 or higher  

## 🛠️ Local Setup Guide

### ✅ Prerequisites

- Java 8 or higher  
- Maven  
- Git  

### 📁 1. Clone the Repository
```bash
git clone https://github.com/hulkingpluto/Numbers-Summarizer.git
cd Numbers-Summarizer
```
### 📁 2. Build and Run
```bash
javac -d out src/main/java/com/example/*.java
java -cp out com.example.Main
```
### 📁 3.Running tests
Option 1:Run all unit tests with Maven:
``bash
mvn test
``
Option 2:Run from file
```bash
Right-click on NumberSummarizerTests.java and select Run Test On Current File.
```

💻 Example Usage
Sample Input:
1,2,3,5,6,8,9,10
Summarized Ranges: 1-3,5-6,8-10
