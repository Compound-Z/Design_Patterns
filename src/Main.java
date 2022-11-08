public class Main {
    public static void main(String[] args) {
        MilkFactory milkFactory = new SouthMilkFac();

        Milk milk = milkFactory.produceMilk(MilkType.VinaMilk);
        System.out.println(milk.getMilk());

        milkFactory = new NorthMilkFac();
        Milk milk2 = milkFactory.produceMilk(MilkType.VinaMilk);
        System.out.println(milk2.getMilk());
        Milk milk3 = milkFactory.produceMilk(MilkType.THTrueMilk);
        System.out.println(milk3.getMilk());


    }


}

