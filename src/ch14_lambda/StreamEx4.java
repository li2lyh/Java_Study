package ch14_lambda;

import java.util.*;
import java.util.stream.*;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
            new String[]{"abc", "def", "jkl"},
            new String[]{"ABC", "GHI", "JKL"}
        );
        
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
        strStrm.map(String::toLowerCase)
               .distinct()
               .sorted()
               .forEach(System.out::println);
        
        System.out.println();
        
        String[] lineArr = {
            "Believe or not It is true",
            "Do or do not There is no try",
        };
        
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                  .map(String::toLowerCase)
                  .distinct()
                  .sorted()
                  .forEach(System.out::println);
        
        System.out.println();
        
        Stream<String> strStrm1 = Stream.of("ААА", "АВС", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bb", "aaa", "ссс", "dd");
        Stream<String> strStream = Stream.concat(strStrm1, strStrm2)
                                        .map(String::toLowerCase)
                                        .distinct();
        
        strStream.forEach(System.out::println);
    }
}
