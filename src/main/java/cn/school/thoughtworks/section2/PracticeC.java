package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {

    private static final List<String> NUMBER_SEPARATOR_CHAIN = Arrays.asList("-", "[", ":");
    private static final String SQUARE_BRACKET_END = "]";

    Map<String, Integer> countSameElements(List<String> collection1) {

        return collection1.stream().collect(Collectors.groupingBy(item -> {
                    for (String separator : NUMBER_SEPARATOR_CHAIN) {
                        if (item.contains(separator)) {
                            int keyEndIndex = item.indexOf(separator);
                            return item.substring(0, keyEndIndex);
                        }
                    }
                    return item;
                },
                Collectors.reducing(0, item -> {
                    for (String separator : NUMBER_SEPARATOR_CHAIN) {
                        if (item.contains(separator)) {
                            int numberBeginIndex = item.indexOf(separator);
                            int numberEndIndex = item.contains(SQUARE_BRACKET_END) ? item.length() - 1 : item.length();
                            return Integer.parseInt(item.substring(numberBeginIndex + 1, numberEndIndex));
                        }
                    }
                    return 1;
                }, Integer::sum)));
    }
}
