package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {

        return collection1.stream()
                .filter(collection1Item -> collection2.stream().anyMatch(subList -> subList.contains(collection1Item)))
                .collect(Collectors.toList());
    }
}
