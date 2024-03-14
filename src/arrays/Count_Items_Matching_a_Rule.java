package arrays;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {

        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        String ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int j = 0;
        if(ruleKey.equals("type")){
            j = 0;
       }else if(ruleKey.equals("color")){
            j = 1;
        }else{
            j = 2;
       }
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if(ruleValue.equals(items.get(i).get(j))){
                count++;
            }
        }
        return count;
    }
}
