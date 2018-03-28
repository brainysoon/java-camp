package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.school.thoughtworks.constant.GlobalConstants.VALUE_PROPERTY;

public class PracticeC {

    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {

        return collection1.stream()
                .filter(collection2.get(VALUE_PROPERTY)::contains)
                .collect(Collectors.toList());
    }
}
