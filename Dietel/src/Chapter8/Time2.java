package Chapter8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Time2 implements Comparator<TimeComparator> {

    public static void main(String[] args) {
        List<TimeComparator> list = new ArrayList<>();
        list.add(new TimeComparator(12, 30, 05));
        list.add(new TimeComparator(13, 40, 10));
        list.add(new TimeComparator(20, 40, 02));

        System.out.println(list);
        System.out.println();
        list.sort(new Time2());
        System.out.println(list);


    }

    @Override
    public int compare(TimeComparator time1, TimeComparator time2) {
    int hourDifference = time1.getHours() - time2.getHours();
            if(hourDifference != 0)
                return hourDifference;
        int minutesDifference = time1.getMinutes() - time2.getMinutes();
        if(minutesDifference != 0)
            return minutesDifference;
        int secondsDifference = time1.getSeconds() - time2.getSeconds();
        if(secondsDifference != 0){

        }
        return secondsDifference;
    }
}
