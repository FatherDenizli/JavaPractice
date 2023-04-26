package stringmanipulations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {



        /*
        9. How can you remove all duplicates from ArrayList?
         */
        List<String> list=new ArrayList<>();

        list.add("Tom");
        list.add("David");
        list.add("Ali");
        list.add("Sam");
        list.add("David");
        list.add("Cary");
        list.add("Michelle");
        list.add("David");


        HashSet<Object> hashSet=new HashSet<>(list);

        System.out.println(list);
        System.out.println(hashSet);

        HashSet<Object> set=new HashSet<>( );

        for (Object name:list){

            set.add( name);


        }

        System.out.println(set);


























    }























}
