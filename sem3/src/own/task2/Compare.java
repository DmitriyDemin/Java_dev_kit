/*Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
 элементы одного типа по парно по индексам.
 */

package own.task2;

import java.util.Arrays;

public class Compare {

    public static <T , U > boolean compareArrays(T[] a, U[] b){

        if (a.getClass() != b.getClass() || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer [] arr1 = {1,4};
        Integer [] arr2 = {1,3};
        Integer [] arr4 = {1,2,3};
        Integer [] arr5 = {1,3};
        Integer [] arr6 = {1,2};
        Integer [] arr7 = {1,2};
        String [] arr8 = {"один","два"};
        String [] arr9 = {"один","два"};
        Character [] arr10 = {'5','6'};
        Character [] arr11 = {'5','6'};


        System.out.print("при сравнении "+ Arrays.toString(arr1) + " и " + Arrays.toString(arr2) + " результат -");
        System.out.println(compareArrays(arr1,arr2));
        System.out.print("при сравнении "+ Arrays.toString(arr2) + " и " + Arrays.toString(arr4) + " результат -");
        System.out.println(compareArrays(arr2,arr4));
        System.out.print("при сравнении "+ Arrays.toString(arr6) + " и " + Arrays.toString(arr7) + " результат -");
        System.out.println(compareArrays(arr6,arr7));
        System.out.print("при сравнении "+ Arrays.toString(arr8) + " и " + Arrays.toString(arr9) + " результат -");
        System.out.println(compareArrays(arr8,arr9));
        System.out.print("при сравнении "+ Arrays.toString(arr10) + " и " + Arrays.toString(arr11) + " результат -");
        System.out.println(compareArrays(arr10,arr11));
    }
}
