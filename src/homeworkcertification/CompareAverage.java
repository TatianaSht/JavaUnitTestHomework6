package homeworkcertification;

import java.util.List;

public class CompareAverage {

    /**
     * Первый список чисел.
     */
    private final List<Integer> integerList1;

    /**
     * Второй списко чисел.
     */
    private final List<Integer> integerList2;

//    private final CalcAverage calcAverage;

    /**
     * @param one         Первый список чисел.
     * @param two         Второй списко чисел.
     */
    public CompareAverage(final List<Integer> one, final List<Integer> two) {
        this.integerList1 = one;
        this.integerList2 = two;
    }

    /**
     *
     * @param listOne Первый список чисел.
     * @param listTwo Второй списко чисел.
     * @return Результат сравнения средних значений списков.
     */
        public String info(final Average listOne, final Average listTwo) {
            double averageList1 = listOne.avgValue();
            double averageList2 = listTwo.avgValue();

        if (averageList1 > averageList2) {
            return "Первый список имеет большее среднее значение.";
        } else if (averageList2 > averageList1) {
            return "Второй список имеет большее среднее значение.";
        }
        return "Средние значения равны.";
    }
}
