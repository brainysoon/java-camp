package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

import static cn.school.thoughtworks.constant.GlobalConstants.VALUE_PROPERTY;

public class PracticeA {

    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        object.get(VALUE_PROPERTY).forEach(item -> collectionA.forEach((key, value) -> {
            if (key.equals(item)) {
                collectionA.put(key, value - 1);
            }
        }));
        return collectionA;
    }
}
