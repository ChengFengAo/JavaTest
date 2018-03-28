package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String tmp = collection1.get(i);
            if (tmp.length() == 1) {
                if (result.containsKey(tmp)) {
                    result.put(tmp, result.get(tmp) + 1);
                } else {
                    result.put(tmp, 1);
                }
            }
            else {
                if (tmp.contains("-") || tmp.contains(":")) {
                    String first = tmp.substring(0, 1);
                    int last = Integer.parseInt(tmp.substring(2, 3));
                    if (result.containsKey(first)) {
                        result.put(first, last + 1);
                    } else {
                        result.put(first, last);
                    }
                }
            else {
                    String first = tmp.substring(0,1);
                    int s= tmp.indexOf("["), e = tmp.indexOf("]");
                    int last = Integer.parseInt(tmp.substring(s+1,e));
                    if (result.containsKey(first)) {
                        result.put(first,result.get(first)+last);
                    } else {
                        result.put(first, last);
                    }
                }

            }
        }
        return result;
    }
}