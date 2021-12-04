package work;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        //creating list and filter all even numbers from list

        List<Integer> list=List.of(1,2,3,4,5,6,54);   //Immutable list

        //list.add(23);

        System.out.println("Orignal list: "+list);

                List <Integer> list2 = new ArrayList<>();

                list2.add(12);
                list2.add(32);
                list2.add(22);
                list2.add(44);

//        System.out.println(list2);


        List<Integer> list3 = Arrays.asList(23,45,66,88,76,45);

//        System.out.println(list3);

        List<Integer> listEven = new ArrayList<>();

        for(Integer i : list){

            if(i%2==0){
                listEven.add(i);
            }

        }

        System.out.println("List of even number without stream: "+listEven);

        List<Integer> newList= list.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println("List of even number using Stream: "+newList);

        List<Integer> newNumbers = list.stream().filter(i->i>=5).collect(Collectors.toList());
        System.out.println("New number greater then or equals 5 : "+newNumbers);
    }
}
