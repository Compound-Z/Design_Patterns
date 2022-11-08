public class NorthMilkFac implements MilkFactory {
    @Override
    public Milk produceMilk(MilkType milkType) {
        return switch (milkType){
            case VinaMilk -> new VinaMilk("From North");
            case THTrueMilk -> new THMilk("From North");
            default -> throw new IllegalStateException("Unexpected value: " + milkType);
        };
    }
}
