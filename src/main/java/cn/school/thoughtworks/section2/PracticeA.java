package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<>();
        for(int i=0;i<collection1.size();i++){
            if(result.containsKey(collection1.get(i))){
              int  tmp = result.get(collection1.get(i));
                result.put(collection1.get(i),tmp+1);
            }
            else
            {
                result.put(collection1.get(i),1);
            }
        }
            return result;
    }
}
