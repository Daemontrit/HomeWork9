import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OneDayAutobus {
    public static void main(String[] args) {
        ArrayList<int[]> stop=new ArrayList<>();
        stop.add(new int[]{3, 0});
        stop.add(new int[]{15, 9});
        stop.add(new int[]{7, 8});
        stop.add(new int[]{18, 10});
        stop.add(new int[]{3, 2});
        stop.add(new int[]{0, 10});
        Stream stream=stop.stream();
        int list = stop.stream().mapToInt((m)->m[0]-m[1]).sum();
        System.out.println(list);



//        int count=0;
//        int passagir=0;
//        for (int i = 0; i < stop.size(); i++) {
//             count+= stop.get(i)[0] ;
//             passagir+=stop.get(i)[1];
//        }
//        System.out.println(count-passagir);
        //Stream<Object> itog=stop.stream().map((m)->m[0]-m[1]).forEach();

    }
}
