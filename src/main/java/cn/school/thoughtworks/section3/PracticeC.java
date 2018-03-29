package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for(String element: collectionA)
        {
            if(collection3.containsKey(element))
            {
                collection3.put(element,collection3.get(element)+1);
            }
            else {
                collection3.put(element,1);
            }
        }
        for (String element:object.get("value"))
        {
        collection3.forEach((k,v) ->
                {
                    if(k==element)
                    {
                        collection3.put(k,v-v/3);
                    }
                }
        );}
        return collection3;
    }
}
