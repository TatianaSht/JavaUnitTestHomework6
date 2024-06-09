package homeworkcertification;

import java.util.ArrayList;
import java.util.List;

public class Average {

    /**
     * Лист с числами.
     */
    private List<Integer> list = new ArrayList<>();

    /**
     *
     * @param listNum Лист с числами
     */
    public Average(final List<Integer> listNum) {
        this.list = listNum;
    }


     final double avgValue() {
        int average = 0;
        int sum = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (int number : list) {
            sum += number;
        }
        average = sum / list.size();
        return average;
    }
}
