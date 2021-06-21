package backyard.system.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public abstract class Item  {
     String name;
     double price;
     String description;

     abstract Item copy();
}