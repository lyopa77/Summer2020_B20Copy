package m;

import day47_Encapsulation.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class streams {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

people.add("john, snow");
people.add("johnnie, cnohh");
people.add("kohn, lnow");
people.add("gohn, anow");

        people.stream().filter(p -> p.startsWith("k")).forEach(p->System.out.println("starts with k: " + p));

    }
        Random random = new Random();
       // random.doubles().limit(1).forEach(System.out::println);
    }





