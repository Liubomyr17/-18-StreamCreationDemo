package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        String arr[] = new String[]{"AA", "BB", "CC"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        Stream<String> of = Stream.of("A", "B", "C", "D");
        System.out.println("----------------------");
        of.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Kishan");
        list.add("Raj");
        list.add("Mohan");

        System.out.println("----------------------");
        Stream<String> stream2 = list.stream();

        stream2.forEach(System.out::println);

    }}