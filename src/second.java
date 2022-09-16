
public class second {
// 5 Task
    public static void main(String[] args) {
        Student st = new Student();
        Student[] stud = new Student[5];
        Student stud1 = new Student(1, "Исмаилов", "Эмирхан", "Бакытбекович", "25,08,2004", "Бишкек", "0770683229", "Агрономия", 3, "Ain-1-21");
        Student stud2 = new Student(2, "Жээнбеков", "Эрбол", "Дмитриевич", "29,04,2004", "Бишкек", "0770797979", "Экономика", 5, "Ain-1-21");
        Student stud3 = new Student(3, "Акматов", "Тариэл", "Григорьевна", "7,02,2003", "Бишкек", "0555555555", "Агрономия", 1, "Ain-2-21");
        Student stud4 = new Student(4, "Курбанов", "Джурат", "Васильевич", "21,06,2001", "Бишкек", "0222455445", "Программирование", 3, "Ain-3-21");
        Student stud5 = new Student(5, "Токторбаев", "Айдар", "Сергеевна", "16,10,2004", "Бишкек", "0999344334", "Агрономия", 1, "MIN-1-21");

        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;

        for (Student s : stud) {
            s.show();
        }
        System.out.println("Факультет Аграномии:");
        for (Student s : stud) {
            s.fakultet();
        }
        System.out.println("Список факультетов и курсов: ");
        System.out.println("Факультет АГРОНОМИЯ");
        System.out.println("1 КУРС:");
        for (Student s : stud) {
            s.listFakultet("Агрономия", 1);
        }

        System.out.println("Студенты с 2003г рождения:");
        for (Student s : stud) {
            s.vozrast(2003);
        }
    }
}

class Student{
    private int id;
    private String familia;
    private String name;
    private String otchestvo;
    private String birthday;
    private String adress;
    private String phoneNumber;
    private String fakultet;
    private int kurs;
    private String group;

    public Student(){

    }

    public Student(int id, String familia, String name, String otchestvo, String birthday, String adress, String phoneNumber,
                   String fakultet, int kurs, String group){
        this.id = id;
        this.familia = familia;
        this.name = name;
        this.otchestvo = otchestvo;
        this.birthday = birthday;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.group = group;
    }

    public int getId(){
        return id;
    }
    public String getFamilia(){
        return familia;
    }
    public String getName(){
        return name;
    }
    public String getOtchestvo(){
        return otchestvo;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getAdress(){
        return adress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getFakultet(){
        return fakultet;
    }
    public int getKurs(){
        return kurs;
    }
    public String getGroup(){
        return group;
    }



    public void show(){
        System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                + " " + getKurs() + " " + getGroup());
    }

    public void fakultet(){
        if(this.getFakultet().equals("Агрономия")){
            System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                    + " " + getKurs() + " " + getGroup());
        }
    }
    public void listFakultet(String fakultet, int kurs){

        if(getFakultet().equals(fakultet) && getKurs() == kurs){

            System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                    + " " + getKurs() + " " + getGroup());
        }
    }

    public void vozrast(int years){
        String[] strBirthday = getBirthday().split(",");
        //System.out.print(strBirthday[0] + " " + strBirthday[1] + " " + strBirthday[2]);
        int year = (int)Integer.valueOf(strBirthday[2]);
        if(year >= years){
            System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                    + " " + getKurs() + " " + getGroup());
        }
    }

}