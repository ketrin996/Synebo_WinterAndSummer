package main;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    private List<Integer> Array_Temperature;
    private int size;
    private int first_value;

    public Solution() {
    }

    // Условие, минимум 1 день лето, минимум 1 день зимы
    public int solution(int[] T) {
        size = T.length; // длина начального массива
        int size = this.size;
        Array_Temperature = new ArrayList<Integer>(size);


        if (T[0] > T[size - 1]) {
            System.out.println("\n" + "Error, winter > summer");
            return 0;
        } else {
            for (int value : T)
                Array_Temperature.add(value);//инициализация массива как списка
        }

        Set<Integer> set = new HashSet<Integer>(Array_Temperature);

        int first_value = Array_Temperature.get(0);
        List<Integer> cut_arr = Array_Temperature.subList(1, size); // создаем массив без 0-ого элемента
        int min = Collections.min(cut_arr);// находим минимум правой части
        int min_index = cut_arr.indexOf(min);
        int tmp = 0;
        size = cut_arr.size();

        if (set.size() == 1) {
            System.out.println("\n" + "Error, no days of summer" );
            return 0;
        }
        else
            {

            while (min < first_value) { // сравнение с первым элементов массив

                cut_arr = cut_arr.subList(min_index + 1, size);
                size = cut_arr.size();
                min = Collections.min(cut_arr);
                tmp += min_index + 1;
                min_index = cut_arr.indexOf(min);

            }

            List<Integer> Left_cut_arr;

            if (tmp <= 2) {
                Left_cut_arr = Array_Temperature.subList(1, 2);

            }
            else {
                Left_cut_arr = Array_Temperature.subList(1, tmp);
            }

            min_index = cut_arr.size()-1;

            while (min_index >= 0 && cut_arr.get(min_index) >= Collections.max(Left_cut_arr))
            {

                min_index --;
            }
        }

        return min_index + tmp +2;
    }


    public void show_list(int[] T) {

        Set<Integer> set = new HashSet<Integer>(Array_Temperature);
        if ((set.size() != 1) && (T[0] < T[T.length - 1])) {
            System.out.println("\n" + "Year's sequance of temperature:");
            for (int i = 0; i < size; i++) {
                System.out.print(Array_Temperature.get(i) + " ");
            }
        }

    }
}






