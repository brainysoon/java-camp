package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.util.CountUtils;

import java.util.List;
import java.util.Map;

public class PracticeB {

    Map<String, Integer> countSameElements(List<String> collection1) {

        return CountUtils.countItemWithNumberOf(collection1);
    }
}
