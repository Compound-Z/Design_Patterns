public class Main {
    public static void main(String[] args) {
        Director dir = new Director();
        CarBuilder carBuilder = new CarBuilder();
        dir.constructSUV(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car: " + car.getCarType());


        CarManualBuilder carManualBuilder = new CarManualBuilder();
        dir.constructSportCar(carManualBuilder);

        Manual manual = carManualBuilder.getResult();
        System.out.println("Car manual: " + manual.print());

    }
}
