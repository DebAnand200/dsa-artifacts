package java_8.optional_class;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> name = getName();
        if(name.isPresent()){
            System.out.println(name);
        }

//        name.ifPresentOrElse(x->System.out.println(name));
    }

    public static Optional<String> getName(){
        String name = null;
//        return Optional.of(name);
//        return Optional.ofNullable(name);
        return Optional.empty();

    }
}
