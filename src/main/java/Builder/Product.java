package Builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    List<String> list;

    public Product() {
        list = new LinkedList<>();
    }

    void add(String part){
        list.add(part);
    }

    void show(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
