// Class FurnitureFactory extending the HouseFactory
public class FurnitureFactory extends HouseFactory{
    public HouseEntity create(String item)
    {
        if (item.equals("Sink")) return new Furniture("Sink");
        else if (item.equals("Counter"))
            return new Furniture("Counter");
        else if (item.equals("Bed"))
            return new Furniture("Bed");
        else if (item.equals("Dresser"))
            return new Furniture("Dresser");
        else if (item.equals("Bathtub"))
            return new Furniture("Bathtub");
        else return null;
    }
}
