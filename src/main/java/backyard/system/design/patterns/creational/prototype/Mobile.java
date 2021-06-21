package backyard.system.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mobile extends Item{
    private String screenDescription;

    public  Mobile(Mobile mobile) {
        this.name=mobile.name;
        this.price=mobile.price;
        this.description=mobile.description;
        this.screenDescription=mobile.screenDescription;
    }

    public Mobile(String name,double price,String description,String screenDescription){
        this.name=name;
        this.price=price;
        this.description=description;
        this.screenDescription=screenDescription;
    }
}
