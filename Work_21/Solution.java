package Work_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution<T, K, V> {
    private T genericField;
    private K keyField;
    private V valueField;

    public Solution(T genericField, K keyField, V valueField) {
        this.genericField = genericField;
        this.keyField = keyField;
        this.valueField = valueField;
    }

    public List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public Map<K, V> newHashMap(Object... keyValuePairs) {
        if (keyValuePairs.length % 2 != 0) {
            throw new IllegalArgumentException("The number of arguments must be even.");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            K key = (K) keyValuePairs[i];
            V value = (V) keyValuePairs[i + 1];
            map.put(key, value);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<String, Integer, Double> solution = new Solution<>("Hello", 42, 3.14);

        List<String> stringList = solution.newArrayList("one", "two", "three");
        Set<String> stringSet = solution.newHashSet("one", "two", "three");
//        Map<Integer, String> map = solution.newHashMap(1, "One", 2, "Two", 3, "Three");

        System.out.println(stringList);
        System.out.println(stringSet);
//        System.out.println(map);
    }
}
