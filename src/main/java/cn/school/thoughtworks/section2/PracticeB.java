package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.school.thoughtworks.constant.GlobalConstants.NUMBER_SEPARATOR;

public class PracticeB {

    Map<String, Integer> countSameElements(List<String> collection1) {

        return collection1.stream().collect(Collectors.groupingBy(item -> item.split(NUMBER_SEPARATOR)[0],
                Collectors.reducing(0, item -> {
                    if (item.contains(NUMBER_SEPARATOR)) {
                        return Integer.parseInt(item.split(NUMBER_SEPARATOR)[1]);
                    }
                    return 1;
                }, Integer::sum)));
    }
}
