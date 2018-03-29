package cn.school.thoughtworks.section3;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for (String element : collectionA) {
            if (element.length() == 1) {
                if (collection3.containsKey(element)) {
                    collection3.put(element, collection3.get(element) + 1);
                } else {
                    collection3.put(element, 1);
                }
            } else {
                collection3.put(element.substring(0, 1), Integer.parseInt(element.substring(2, 3)));
            }
        }

        for (String element : object.get("value")) {
            collection3.forEach(
                    (k, v) -> {
                        if (element.equals(k))
                        {
                           // System.out.print(k);
                            collection3.put(element, v - v / 3);
                        }
                    });
        }
        return collection3;
    }
}
