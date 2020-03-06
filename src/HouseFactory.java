// Declaring the HouseFactory class as abstract
public abstract class HouseFactory {
//     creating the create method with type HouseEntity
    public abstract HouseEntity create(String item);

    public HouseEntity buildHouse(String type)
    {
        HouseEntity house = create(type);
        return house;
    }
}
