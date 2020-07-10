import java.util.*;
import java.io.*;

public class PhonePeAlgorithms {
    
    public static void main(String[] args) {
        nameSorted(new ArrayList<String>(Arrays.asList("Shailash", "Rahul", "Moumita")));
        cityNumber(1, 2, new int[]{1, 2, 3, 4, 5, 5});
    }

    public static ArrayList<String> nameSorted(ArrayList<String> nameList) {
        System.out.println("Original " + Arrays.toString(nameList.toArray()));
        
        HashMap<Integer, String> uniqueName = new HashMap<Integer, String>();
        for (int i = 0; i < nameList.size(); i++) {
            int count = (int) nameList.get(i).toLowerCase().chars().distinct().count();
            uniqueName.put(count, nameList.get(i));
        }

        Map<Integer, String> reverseSortedMap = new TreeMap<Integer, String>(Collections.reverseOrder());
        reverseSortedMap.putAll(uniqueName);

        ArrayList<String> newNameList = new ArrayList<String>(reverseSortedMap.values());
        Collections.sort(newNameList);

        System.out.println("nameSorted " + Arrays.toString(newNameList.toArray()));
        return newNameList;
    }

    public static int[] cityNumber(int K, int Y, int[] arr) {
        return arr;
    }
}