package backyard.system.design.patterns.creational.prototype;

public class Client {

    public static void main(String[] args) {
        Registry registry = new Registry();
        RollerSkates rollerSkates = (RollerSkates)registry.createItem(ItemType.ROLLERSKATES);
        rollerSkates.setDescription("Modified description for movie -1");
        System.out.println(rollerSkates);

        RollerSkates rollerSkates2 = (RollerSkates)registry.createItem(ItemType.ROLLERSKATES);
        rollerSkates2.setDescription("Modified description for movie -2");
        rollerSkates2.setNumberOfWheels(3);
        System.out.println(rollerSkates2);
    }
}
