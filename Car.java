public class Car{
    private String brand;
    private String model;
    private float engineSize;

public Car (String brand, String model, float engineSize){
    this.brand = brand;
    this.model = model;
    this.engineSize = engineSize;
    }

public void engineSizeLargerThan(float engine, String brand) {
    if (this.engineSize >= engine) {
        System.out.println("Yes engine is larger than" + engineSize);
    }
    else {
        System.out.println("No it is not!");
    }
}
    
    public void isABrand(String brand) {

// if (expression) true/false{
//   code here
//}
//else{
//    code here
//}
        if(this.brand.equals(brand)) {
            System.out.println("Yes it is a" + brand);
        }
        else{
            System.out.println("No it is not a" + brand);
        }
    }

}