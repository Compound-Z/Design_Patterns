public class THMilk extends Milk{
    private String factory;
    public THMilk(String factory){
        this.factory = factory;
    }
    @Override
    public String getMilk() {
        return factory + " THMilk";
    }
}