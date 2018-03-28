package cn.school.thoughtworks.util;

import java.util.List;
import java.util.Map;

import static cn.school.thoughtworks.constant.GlobalConstants.VALUE_PROPERTY;

public class DecreaseUtils {

    public static void decreaseCountByEveryThreeTimesOf(Map<String, Integer> countMap, Map<String, List<String>> objectReferMap) {

        objectReferMap.get(VALUE_PROPERTY).forEach(item -> countMap.forEach((key, value) -> {
            if (key.equals(item)) {
                countMap.put(key, value - value / 3);
            }
        }));
    }
}
