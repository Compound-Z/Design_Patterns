public class VinaMilk extends Milk{
    private String factory;
    public VinaMilk(String factory){
        this.factory = factory;
    }
    @Override
    public String getMilk() {
        return factory + " VinaMilk";
    }
}
