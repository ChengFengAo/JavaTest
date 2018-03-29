package cn.school.thoughtworks.section3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String element : object.get("value")) {
            collectionA.forEach((k, v) -> {
                if (k == element) {
                  collectionA.put(k,v-1);
                }
            });
        }

        return collectionA;
    }
}
