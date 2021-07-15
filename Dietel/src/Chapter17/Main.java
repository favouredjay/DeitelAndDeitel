package Chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ManipulatingAStream [] streams ={ new ManipulatingAStream(83, "Electric Sander", 7, 57.98),
                new ManipulatingAStream(24, "Power saw" ,18, 99.99),
                new ManipulatingAStream(7, "Sledge hammer", 11, 21.50),
                new ManipulatingAStream(77,  "Hammer", 76, 11.99),
                new ManipulatingAStream(39, "Lawn mower", 3 ,79.50),
                new ManipulatingAStream(68, "Screwdriver", 106, 6.99),
                new ManipulatingAStream(56, "Jig saw", 21, 11.00),
                new ManipulatingAStream(3, "Wrench", 34, 7.50)};

        List<ManipulatingAStream> list = Arrays.asList(streams);
        System.out.printf("%s%n", "Sort by Part Description");
        list.stream()
                .sorted(Comparator.comparing(ManipulatingAStream::getPartDescription))
               .forEach(System.out::println);

        }
    }

