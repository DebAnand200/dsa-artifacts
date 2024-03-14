package java_8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("deb",9700);
        map.put("atulya",3200);
        map.put("deepak",6300);
        map.put("subhasis",9500);
        map.put("pallavi",9500);
        map.put("srinivas",9500);
        map.put("sripati",9700);
        map.put("basu",5700);
        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(2, map);
        Map.Entry<Integer, List<String>> dynamicNthHighestSalary = getDynamicNthHighestSalary(2, map);
//        System.out.println(nthHighestSalary);
        System.out.println(dynamicNthHighestSalary);
    }

    public static  Map.Entry<String,Integer> getNthHighestSalary(int n, Map<String,Integer> map){
         return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(n-1);
    }

    public static  Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int n, Map<String,Integer> map){
        Map.Entry<Integer, List<String>> resultSalaryList = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(n - 1);
        return resultSalaryList;
    }


}
