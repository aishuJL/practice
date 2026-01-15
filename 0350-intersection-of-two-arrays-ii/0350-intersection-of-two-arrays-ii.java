import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // STEP 1: Count elements of nums1
        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];

            if (map.containsKey(value)) {
                int oldCount = map.get(value);
                map.put(value, oldCount + 1);
            } else {
                map.put(value, 1);
            }
        }

        // STEP 2: Store answer in list
        ArrayList<Integer> resultList = new ArrayList<>();

        // STEP 3: Check nums2 against map
        for (int i = 0; i < nums2.length; i++) {
            int value = nums2[i];

            if (map.containsKey(value)) {
                int count = map.get(value);

                if (count > 0) {
                    resultList.add(value);
                    map.put(value, count - 1);
                }
            }
        }

        // STEP 4: Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
