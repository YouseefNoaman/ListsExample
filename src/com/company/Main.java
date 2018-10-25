package com.company;
/*
*  a simple List usage and class analysis
*
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(99, "calvin", "lucas"));    // add() is used to add elements to the List
        employeeList.add(new Employee(24, "jane", "john"));

        // employeeList.forEach(employee -> System.out.println(employee));  // this lambda expression is used to print out the employee list


        employeeList.set(1, new Employee(84, "john", "adams"));    // set() is used to replace the object with the provided index, the original item is deleted
        System.out.println(employeeList);

        // add() has another usage to add elements to specific index, but it has a disadvantage as the List is based on the linked list
        // so the elements are shifted to input the specific element, so this operation is O(n) because of shifting, not O(1)
        employeeList.add(1, new Employee(55, "nada", "george"));


        System.out.print("\n" + employeeList);      // this also prints the List, detailing the specific internals of the objects in the List
        System.out.println("\n" + employeeList.contains(new Employee(55, "nada", "george")));   // returns true
        System.out.println(employeeList.equals(new Employee(55, "nada", "george")));


        // removing an item is O(n) as it shifts all the remaining elements to eliminate the empty object's placement in the List.

        // to remove an item from the List, there are 2 ways, to provide the index of the object as following
        int index = employeeList.indexOf(new Employee(84, "john", "adams"));
        employeeList.remove(index);

        // the second way is to write the contents of the object, if it is found it will be deleted, if not found it will do nothing
        employeeList.remove(new Employee(99, "calvin", "lucas"));   // this will delete the corresponding object
        employeeList.remove(new Employee(99, "mike", "martin"));    // this will do nothing

        // this line is used to convert the List to an array data structure, to use the properties of the array and its characteristics
        // it creates an array of the same size as the list of type Employee
        Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee emp : employees) {  // this loop is just to print the array out
            System.out.println(emp);
        }

    }
}
