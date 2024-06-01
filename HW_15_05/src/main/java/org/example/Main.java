package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Task 1
        List<String> countries = new ArrayList<>(
                List.of ("Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden", "Austria"
                )
        );

        List<String> words = new ArrayList<>(
                List.of (
                "Andorra", "Canada", "First", "candy", "Austria", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba"
                )
        );
        countries.retainAll(words);
        System.out.println(countries);

        System.out.println(
                shared(
                new int [] {1, 2, 5, 5, 8, 9, 7, 10},
                new int [] {1, 0, 6, 15, 6, 4, 7, 0}
                )
        );

}
// Task 2
    public static List<Integer> shared (int [] a, int [] b) {
        List<Integer> a1 = new ArrayList<>();
        for (int i : a){
            a1.add(i);
        }
        List<Integer> a2 = new ArrayList<>();
        for (int i : b){
            a2.add(i);
        }
        a1.retainAll(a2);
        return a1;
    }

}