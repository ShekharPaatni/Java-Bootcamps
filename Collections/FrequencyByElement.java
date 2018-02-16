
import java.util.*;

public class FrequencyByElement {
    public static void main(String[] args) {
        int[] arr = {15,10,10,10,15,2,2,8,8};
        LinkedHashMap<Integer, Integer> obj = new LinkedHashMap<>();
        for (int i =0; i < arr.length; i++) {
            if (obj.containsKey(arr[i])) {
                int count = (int)obj.get(arr[i]);
                obj.put(arr[i], count+1);
            }else
                obj.put(arr[i], 1);
        }
        List<Integer> keys =  new ArrayList<>(obj.keySet());
        Collections.sort(keys, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return obj.get(o2) -obj.get(o1);
            }
        });

        System.out.println("Without Lambda Expression");
        printDetail(keys, obj);

        //Lamda Expression
        List<Integer> keysin =  new ArrayList<>(obj.keySet());
        keysin.sort((o12, o22) -> obj.get(o22) - obj.get(o12));
        System.out.println("With Lambda Expression");
        printDetail(keysin, obj);
    }
    public static void printDetail(List<Integer> keys, LinkedHashMap<Integer, Integer> obj){
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            int element = (int)iterator.next();
            int element_occur = obj.get(element);
            for (int i =0; i< element_occur; i++)
                System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println("**********************");
    }
}
