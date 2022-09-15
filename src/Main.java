import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("0230123","dsad",213);
//        phone.receiveCall("Tariel");
//        phone.sendMessage("123","123","3");
        Solver();
//        FlowerSolver();
//        Car car = new Car("Toyota", 2.5);
//        car.info();
//        car.start();
//        car.turnLeft();
//        car.turnRight();
//        car.stop();


    }
    //8
    static public void Solver() {
        Sweets candy = new Sweets(100, "candy", 0.7,"Belarus");
        Sweets chocolate = new Sweets(200, "chocolate", 0.55,"Russia");
        Sweets cookie = new Sweets(200, "cookie", 0.6,"KG");
        Sweets lolipop = new Sweets(150, "lolipop", 0.95,"USA");
        String[][] result = new String[4][4];
        result[0][0] = (candy.getName()) ;
        result[0][1] = String.valueOf((candy.getSugar()));
        result[0][2] = String.valueOf((candy.getWeight()));
        result[0][3] = candy.getOrigin();
        result[1][0] =(chocolate.getName());
        result[1][1] = String.valueOf((chocolate.getSugar()));
        result[1][2] = String.valueOf((chocolate.getWeight()));
        result[1][3] = chocolate.getOrigin();
        result[2][0] =(cookie.getName());
        result[2][1] = String.valueOf((cookie.getSugar()));
        result[2][2]= String.valueOf((cookie.getWeight()));
        result[2][3] = cookie.getOrigin();
        result[3][0] = lolipop.getName();
        result[3][1] = String.valueOf(cookie.getSugar());
        result[3][2] = String.valueOf(cookie.getWeight());
        result[3][3] = cookie.getOrigin();
        printerTwoDimensional(result);
        System.out.println("Вы хотите сортировать по весу или содержанию сахара?(1 или 2)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            Arrays.sort(result, Comparator.comparingInt(o -> Integer.parseInt(o[2])));

        }
        else if(choice==2){
            Arrays.sort(result, Comparator.comparingDouble(o -> Double.parseDouble(o[1])));
        }



        printerTwoDimensional(result);

        int price = 0;
        for(int i = 0;i<result.length;i++){
            price += Integer.parseInt(result[i][2]);
        }
        System.out.println(price+" - цена букета");
        SweetDiapason(result);

    }
    static void SweetDiapason(String[][]a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало диапазона (процент содержания сахара не выше 1.0)");
        double beginning = sc.nextDouble();
        System.out.println("Введите конец диапазона");
        ArrayList<String> numbers = new ArrayList<>();
        double end = sc.nextDouble();
        for(int i = 0;i< a.length;i++){
            if(beginning <= Double.parseDouble(a[i][1]) && Double.parseDouble(a[i][1])<= end) numbers.add(a[i][0]);
        }
        System.out.println("Сладости которые находится в данном диапазоне: "+numbers);
    }

    //7
    static public void FlowerSolver(){
        ArrayList<String> decorations = new ArrayList<>();
        decorations.add("toy");
        decorations.add("lenta");
        Flowers tulpan = new Flowers("tulpan",20,"Spain",decorations,20,0.85);
        Flowers rose = new Flowers("rose",30,"KG",decorations,25,0.78);
        Flowers landysh = new Flowers("landys",40,"KZ",decorations,50,0.93);
        Flowers begonia = new Flowers("begonia",50,"Russia",decorations,40,0.81);
        Flowers lotos = new Flowers("lotos",100,"China",decorations,15,0.74);
        String[][] a = new String[5][4];
        a[0]= new String[]{tulpan.getName(), String.valueOf(tulpan.getPrice()), tulpan.getOrigin(), String.valueOf(tulpan.getLength()), String.valueOf(tulpan.getFreshness())};;
        a[1]= new String[]{rose.getName(), String.valueOf(rose.getPrice()),tulpan.getOrigin(),String.valueOf(rose.getLength()),String.valueOf(rose.getFreshness())};
        a[2]=new String[]{landysh.getName(), String.valueOf(landysh.getPrice()),tulpan.getOrigin(),String.valueOf(landysh.getLength()),String.valueOf(landysh.getFreshness())};
        a[3] = new String[]{begonia.getName(), String.valueOf(begonia.getPrice()),begonia.getOrigin(),String.valueOf(begonia.getLength()),String.valueOf(begonia.getFreshness())};
        a[4]  = new String[]{lotos.getName(), String.valueOf(lotos.getPrice()),lotos.getOrigin(),String.valueOf(lotos.getLength()),String.valueOf(lotos.getFreshness())};

        printerTwoDimensional(sorter(a));
        int price = 0;
        for(int i = 0;i<a.length;i++){
            price += Integer.parseInt(a[i][1]);
        }
        System.out.println(price+" - цена букета");

        FlowerDiapason(a);
    }
    static void printerTwoDimensional(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");


    }
    // 7 продолжение,метод для нахождения диапозона
    static void FlowerDiapason(String[][]a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало диапазона,(длина стебля цветов)");
        int beginning = sc.nextInt();
        System.out.println("Введите конец диапазона");
        ArrayList<String> numbers = new ArrayList<>();
        int end = sc.nextInt();
        for(int i = 0;i< a.length;i++){
            if(beginning<= Integer.parseInt(a[i][3]) && Integer.parseInt(a[i][3])<= end) numbers.add(a[i][0]);
        }
        System.out.println("Цветы длина которых находится в данном диапазоне: "+numbers);
    }
    static String[][] sorter(String[][]a){
            Arrays.sort(a, Comparator.comparingDouble(o -> Double.valueOf(o[4])));
        return a;
    }
    //двумерный принтер
    static void printerTwoDimensional(ArrayList<String[]> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).length; j++) {
                System.out.print(a.get(i)[j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
    //одномерный принтер
    static void printerOneDimensional(String[]a ){
        for(int i = 0;i<a.length;i++){
            if(i!=a.length-1) {
                System.out.print(a[i] + ", ");
            }else {
                System.out.println(a[i]);
            }
        }
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
    }class Sweets{
    private String weight;
    private String name;
    private String sugar;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public Sweets(String weight, String name, String sugar) {
        this.weight = weight;
        this.name = name;
        this.sugar = sugar;
    }
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
    private String origin;

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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Sweets(int weight, String name, double sugar, String origin) {
        this.weight = weight;
        this.name = name;
        this.sugar = sugar;
        this.origin = origin;
    }
}
//7 class

class Flowers{
    private String name;
    private int price;
    private String origin;
    private ArrayList<String> decoration;
    private int length;

    public Flowers(String name, int price, String origin, ArrayList<String> decoration, int length, double freshness) {
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.decoration = decoration;
        this.length = length;
        this.freshness = freshness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<String> getDecoration() {
        return decoration;
    }

    public void setDecoration(ArrayList<String> decoration) {
        this.decoration = decoration;
    }

    public double getFreshness() {
        return freshness;
    }

    public void setFreshness(double freshness) {
        this.freshness = freshness;
    }

    private double freshness;
}



