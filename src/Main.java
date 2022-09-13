import com.company.vehicles.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("0230123","dsad",213);
//        phone.receiveCall("Tariel");
//        phone.sendMessage("123","123","3");
//        Solver();
        Car car = new Car("Toyota", 2.5);
        car.info();
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();


    }
    static public void Solver() {
        Sweets candy = new Sweets(100, "candy", 0.8);
        Sweets chocolate = new Sweets(200, "chocolate", 0.7);
        Sweets cookie = new Sweets(400, "cookie", 0.6);
        String result = "";
        result += "{" + candy.getName() + ", " + candy.getSugar() + ", " + candy.getWeight() + "},";
        result += "{" + chocolate.getName() + ", " + chocolate.getSugar() + ", " + chocolate.getWeight() + "},";
        result += "{" + cookie.getName() + ", " + cookie.getSugar() + ", " + cookie.getWeight() + "}.";
        System.out.println(result);

    }

}
//Task number 1
 class Phone{
    private String number;
    private String model;

     public Phone(String number, String model, int weight) {
         this.number = number;
         this.model = model;
         this.weight = weight;

     }

     public String getNumber() {
         return number;
     }

     public String getModel() {
         return model;
     }

     public int getWeight() {
         return weight;
     }

     private int weight;

    public static void receiveCall(String name){
        System.out.println("Звонит "+name);

    }
    public static void receiveCall(String name, String number){
        System.out.println("Звонит "+ name+ " c номером "+ number);
    }
    public static void sendMessage(String ... numbers){
        String called = "";
        for(int i = 0;i<numbers.length;i++){
            if(i != numbers.length-1) {
                called += (numbers[i]) + ", ";
            }else {
                called += numbers[i];
            }
        }
        System.out.println("Вам звонили: "+called.trim());
    }

}

class Sweets{
    private int weight;
    private String name;
    private double sugar;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public Sweets(int weight, String name, double sugar) {
        this.weight = weight;
        this.name = name;
        this.sugar = sugar;
    }
}




