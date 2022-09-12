import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("0230123","dsad",213);
        phone.receiveCall("Tariel");
        phone.sendMessage("123","123","3");
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
    private int weight = 100;
    private String[] shapes = 


}
class Candys extends Sweets{

}