package Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {
    IntStream.range(1,100).forEach(System.out::print);
    System.out.println();
    IntStream.range(1,20).skip(10).forEach(x->System.out.print(x));
    System.out.println();
    System.out.println(IntStream.range(1,10).sum());
    System.out.println();
    Stream.of("Ava","Sree","Eva").sorted().findFirst().ifPresent(System.out::print);
        System.out.println();
    String[] names={"Sarika","Kevin","bruno","Srikanth","sachin","Kapil"};
        Arrays.stream(names).filter(x->x.startsWith("s")).sorted().forEach(System.out::println);

    Arrays.stream(new int[] {2,4,6,8,9}).map(x->x*x).average().ifPresent(System.out::println);

    List<String> list=Arrays.asList("Azad","Anu",null,"Pallavi","Murali","megha","Aruna","Pinku");
    list.stream().filter(x->x!=null).map(String::toLowerCase).filter(x->x.startsWith("a")).sorted().forEach(System.out::println);

    Stream<String> bands= Files.lines(Paths.get("C:\\Users\\sreeroop.shiv.u.k\\git\\Basics\\src\\main\\java\\Java8\\bands.txt"));
    bands.sorted().filter(x->x.length()>4).forEach(System.out::print);
    bands.close();

    List<String> band=Files.lines(Paths.get("C:\\Users\\sreeroop.shiv.u.k\\git\\Basics\\src\\main\\java\\Java8\\bands.txt")).filter(x->x.length()<10).collect(Collectors.toList());
    band.forEach(x->System.out.println(x));

    long count=Files.lines(Paths.get("C:\\Users\\sreeroop.shiv.u.k\\git\\Basics\\src\\main\\java\\Java8\\bands2.txt")).map(x->x.split(":")).filter(x->x.length==3).count();
     System.out.println("Rows passed="+count);

     Stream<String> rating=Files.lines(Paths.get("C:\\Users\\sreeroop.shiv.u.k\\git\\Basics\\src\\main\\java\\Java8\\bands2.txt"));
        Map<String,Float> rated=rating.map(x->x.split(":")).filter(x->x.length==3).filter(x->Float.parseFloat(x[1])>1).collect(Collectors.toMap(x->x[0], (x -> Float.parseFloat(x[1]))));
        rating.close();
        for(String key:rated.keySet()){
            System.out.println(key+" "+rated.get(key));
        }

        IntSummaryStatistics summary=IntStream.of(1,5,9,0,4,5,76,8).summaryStatistics();
        System.out.println(summary);


        //reduction

        double total=Stream.of(3.6,6.7,9.0).reduce(0.0,(Double a,Double b)->a+b); //0.0 is starting value //a is the sum rotated
        System.out.println(total);
}
}
