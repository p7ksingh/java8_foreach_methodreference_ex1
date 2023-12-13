package com.example.java8program.collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId("101");
        employee1.setName("pankaj");
        employee1.setAddress("Bihar");
        Employee employee2 = new Employee();
        employee2.setId("102");
        employee2.setName("pankaj");
        employee2.setAddress("Bihar");
        Employee employee3 = new Employee();
        employee3.setId("103");
        employee3.setName("pankaj");
        employee3.setAddress("Bihar");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.stream().forEach(e -> System.out.println(e));

        employees.stream().forEach(System.out::println);

    }
}
