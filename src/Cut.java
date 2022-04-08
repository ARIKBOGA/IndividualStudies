import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/*
sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
*/

public class Cut {
    public static List<Integer> cutTheSticks(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr.length - i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 2, 2, 8};
        System.out.println(cutTheSticks(arr));
    }
}