package solutions.algorithms._0_999._981_Time_Based_Key_Value_Store;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {


    Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> integerStringSortedMap;
        if (map.containsKey(key)) {
            integerStringSortedMap = map.get(key);
        } else {
            integerStringSortedMap = new TreeMap<>();
            map.put(key, integerStringSortedMap);
        }
        integerStringSortedMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> integerStringSortedMap = map.get(key);
        if (integerStringSortedMap == null) {
            return "";
        } else {
            Integer index = integerStringSortedMap.floorKey(timestamp);
            if (index != null) {
                return integerStringSortedMap.get(index);
            } else {
                return "";
            }
        }
    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */