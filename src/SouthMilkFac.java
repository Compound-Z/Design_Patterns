public class SouthMilkFac implements MilkFactory {
    @Override
    public Milk produceMilk(MilkType milkType) {
        return switch (milkType){
            case VinaMilk -> new VinaMilk(this.getClass().getName());
            case THTrueMilk -> new THMilk(this.getClass().getName());
            default -> throw new IllegalStateException("Unexpected value: " + milkType);
        };
    }
}
