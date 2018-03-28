package cn.school.thoughtworks.section2;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String tmp = collection1.get(i);
            if(tmp.length()==1)
            {
                if(result.containsKey(tmp))
                {
                    result.put(tmp,result.get(tmp) + 1);
                }
                else
                {
                    result.put(tmp,1);
                }
            }
            else
            {
                result.put(tmp.substring(0,1),Integer.parseInt(tmp.substring(2,3)));
            }
        }

        return result;
    }
}
