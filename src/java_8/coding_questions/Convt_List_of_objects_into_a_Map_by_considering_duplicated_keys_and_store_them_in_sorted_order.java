package java_8.coding_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Convt_List_of_objects_into_a_Map_by_considering_duplicated_keys_and_store_them_in_sorted_order {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

        LinkedHashMap<String, Integer> map = noteLst.stream()
                .sorted(Comparator
                        .comparingLong(Notes::getId))
                .collect(Collectors.toMap
                        (Notes::getTag, Notes::getPrice,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("map = " + map);

    }
}

class Notes {
    private int id;
    private String tag;
    private int price;

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", price=" + price +
                '}';
    }

    public Notes(int id, String tag, int price) {
        this.id = id;
        this.tag = tag;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
