public class RunCar{
    public static void main(String[] args) {
       Car c1 = new Car("Volvo", "V70", 2.4f);
       Car c2 = new Car("Bugatti", "Veyron", 16.4f);
       Car c3 = new Car("Honda", "Integra Type-R", 1.8f); 

       c1.isABrand("Bugatti");
       c2.isABrand("Honda");

       c1.engineSizeLargerThan(2.0f,"Volvo");
    }
}