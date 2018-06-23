package main;
        import java.util.Collections;
        import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int []T_1 = new int[]{5,-2,3,8,6};
        int []T_2 = new int[]{-5,-5,-5,-42,6,12};
        int []T_3 = new int[]{1,-2,3,4,7,5,-2,6,10,7,12,13};
        int []T_4 = new int[]{1,-1};
        int []T_5 = new int[]{1,1,1,1,1};

        System.out.print("\n" + solution.solution(T_1)+ " days of winter");
        solution.show_list(T_1);
        System.out.print("\n" + solution.solution(T_2)+ " days of winter");
        solution.show_list(T_2);
        System.out.print("\n" + solution.solution(T_3)+ " days of winter");
        solution.show_list(T_3);
        System.out.print( solution.solution(T_4)+ " days of winter"+"\n");
        solution.show_list(T_4);
        System.out.print( solution.solution(T_5)+ " days of winter"+"\n");
        solution.show_list(T_5);


    }
}
