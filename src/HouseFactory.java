public abstract class HouseFactory {
    public abstract HouseEntity create(String item);

    public HouseEntity buildHouse(String type)
    {
        HouseEntity house = create(type);
        return house;
    }
}