package java_8.coding_questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_Each_Word_Of_A_String {
    public static void main(String[] args) {
        String str = "micro soft";
        String strFinal = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(strFinal); //orcim tfos
    }
}
