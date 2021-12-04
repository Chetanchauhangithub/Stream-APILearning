package work;

import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {


        //Stream API -collection process
        //collection - goupp of object


        //1. Blank stream

        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));
    }

}
