import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));


        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest summerForest = new Forest(hares);


        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        summerForest.printHares();

        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        Forest.setSeason("зима");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        summerForest.printHares();
    }
}
class MountainHare {
    // добавьте переменные и конструктор
    private int age;
    private double weight;
    private int jumpLength;
    private static String color = "серо-рыжий";
    public MountainHare(int age, double weight,int jumpLength){
        this.age= age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
    public static  void setColor(String newColor) {
        color = newColor;
    }



    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
class Forest {
    private ArrayList<MountainHare> hares;
    private  static String season = "лето";
    public Forest(ArrayList<MountainHare>hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public  static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
