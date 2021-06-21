package backyard.system.design.patterns.creational.prototype;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Registry {
    private Map<ItemType,Item> registry = new HashMap<>();

    public Registry(){
        loadItems();
    }
    private void loadItems(){
        RollerSkates rollerSkates = new RollerSkates("marq inline",
                2000,"inline rollerSkates for 9-12 years age",4);
        registry.put(ItemType.ROLLERSKATES,rollerSkates);

        Mobile mobile = new Mobile("5G Mobile from X company",
                60000,"5G enabled 888 processor smartphone",
                "6.7 inch gorilla glass 6  display");
        registry.put(ItemType.MOBILE,mobile);
    }

    public Item createItem(ItemType itemType){
        Item item = null;
        if(ItemType.ROLLERSKATES.equals(itemType)){
            item = new RollerSkates((RollerSkates) registry.get(itemType));
        }else if(ItemType.MOBILE.equals(itemType)){
            item = new Mobile((Mobile) registry.get(itemType));
        }
        return item;
    }
}
