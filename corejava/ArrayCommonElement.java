

//Find common elements between two arrays.
public class ArrayCommonElement {
    public static void main(String[] args) {
        int[] first_arr = {10,15,25,30,40,15,25,40,45,100,100,18,20};
        int[] second_arr = {25,10,15,18,100,15};
        int[]  duplicate_remove = removeDuplicate(first_arr);
        for (int i=0; i< duplicate_remove.length; i++) {
            for (int j =0; j<second_arr.length; j++) {
                if (duplicate_remove[i] == second_arr[j]) {
                    System.out.println(duplicate_remove[i]);
                    break;
                }
            }
        }
    }
    public static int[] removeDuplicate(int[] firstarr) {
        int[] arr = new int[firstarr.length];
        boolean status = true;
        int increment = 0;
        for (int i = 0; i < firstarr.length; i++) {
            status = true;
            for (int j = i+1; j < firstarr.length; j++) {
                if (firstarr[i] == firstarr[j]) {
                    status = false;
                }
            }
            if (status) {
                arr[increment] = firstarr[i];
                increment++;
            }
        }
        return arr;
    }
}
