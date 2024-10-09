package Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class optionalExample {
    private static Optional<String> getname(){
        String name="CodemindTechnology";
        return Optional.of(name);
    }
    public static void main(String[] args)  {
        Optional<String> name=getname();
        Optional<String> name1= name.map(x->x.toUpperCase());
        //String name1=name.orElseThrow(NoSuchElementException::new);
        //String name1=name.orElseGet(()-> "Saurabh");
        //String  name1=name.isPresent()?name.get():"NA";
          System.out.println(name1);
    }

}
