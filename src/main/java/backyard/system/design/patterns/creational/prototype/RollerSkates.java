package backyard.system.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Setter
public class RollerSkates extends Item{

    @Setter
    private double numberOfWheels;

    public  RollerSkates(RollerSkates rollerSkates) {
        this.name=rollerSkates.name;
        this.price=rollerSkates.price;
        this.description=rollerSkates.description;
        this.numberOfWheels=rollerSkates.numberOfWheels;
    }

    public RollerSkates(String name,double price,String description,double numberOfWheels){
        this.name=name;
        this.price=price;
        this.description=description;
        this.numberOfWheels=numberOfWheels;
    }


    @Override
    Item copy() {
        return new RollerSkates(this);
    }
}
