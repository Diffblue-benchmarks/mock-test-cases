# Mock Test Cases
A Maven project of simple test cases that can be used to evaluate whether an analysis gives unnecessary mocking/reflection.
The methods in the `Target` class depend in various ways on the other classes in the project.
To benchmark an analysis, you should set it up to try to find tests for the methods in `Target`.
Explanations of each test case can be found in the `Target.java` source.
