package interview;

import java.util.*;

public class PhonePeInterview {

    public ArrayList<String> nameSorted(ArrayList<String> nameList) {
        System.out.println("Original " + Arrays.toString(nameList.toArray()));

        HashMap<Integer, String> uniqueName = new HashMap<>();
        for (String s : nameList) {
            int count = (int) s.toLowerCase().chars().distinct().count();
            uniqueName.put(count, s);
        }

        Map<Integer, String> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
        reverseSortedMap.putAll(uniqueName);

        ArrayList<String> newNameList = new ArrayList<>(reverseSortedMap.values());
        Collections.sort(newNameList);

        System.out.println("nameSorted " + Arrays.toString(newNameList.toArray()));
        return newNameList;
    }
}