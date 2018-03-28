package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.util.DecreaseUtils;

import java.util.List;
import java.util.Map;

public class PracticeB {

    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        DecreaseUtils.decreaseCountByEveryThreeTimesOf(collectionA, object);
        return collectionA;
    }
}
