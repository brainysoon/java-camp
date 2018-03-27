package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {

    private static final String VALUE = "value";

    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {

        return collection1.stream()
                .filter(collection2.get(VALUE)::contains)
                .collect(Collectors.toList());
    }
}
