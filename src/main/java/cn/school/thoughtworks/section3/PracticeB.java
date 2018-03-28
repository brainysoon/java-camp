package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {

    private static final String VALUE = "value";

    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        object.get(VALUE).forEach(item -> collectionA.forEach((key, value) -> {
            if (key.equals(item)) {
                collectionA.put(key, value - value / 3);
            }
        }));
        return collectionA;
    }
}
