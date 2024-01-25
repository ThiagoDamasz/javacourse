package application;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x:result){
            System.out.println(x);
        }

        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("null");
        System.out.println(name);
    }
}