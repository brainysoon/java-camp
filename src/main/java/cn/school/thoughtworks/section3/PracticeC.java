package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {

    private static final String VALUE = "value";

    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {

        Map<String, Integer> collection3 = collectionA.stream().collect(Collectors.groupingBy(String::toString,
                Collectors.reducing(0, item -> 1, Integer::sum)));

        object.get(VALUE).forEach(item -> collection3.forEach((key, value) -> {
            if (key.equals(item)) {
                collection3.put(key, value - value / 3);
            }
        }));
        return collection3;
    }
}
