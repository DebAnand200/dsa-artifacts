package java_8.coding_questions;

import java.util.*;
import java.util.stream.Collectors;

public class Check_if_list_is_empty_in_Java_8_using_Optional {
    public static void main(String[] args) {
        List<Notes> noteLst1 = new ArrayList<>();
        noteLst1.add(new Notes(1, "note1", 11));
        noteLst1.add(new Notes(2, "note2", 22));
        noteLst1.add(new Notes(3, "note3", 33));
        noteLst1.add(new Notes(4, "note4", 44));
        noteLst1.add(new Notes(5, "note5", 55));

        noteLst1.add(new Notes(6, "note4", 66));
        List<Notes> noteLst2 = new ArrayList<>();

        List<String> list = Optional.ofNullable(noteLst1)
                .orElseGet(Collections::emptyList) // creates empty immutable List: [] in case of noteList2is null
                .stream()
                .filter(Objects::nonNull) //Loop thru each Object and consider nonNull Objects
                .map(Notes::getTag)// method reference, consider only tag name
                .collect(Collectors.toList());
        System.out.println("list = " + list);
    }
}
