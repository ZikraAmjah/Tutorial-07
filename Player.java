public class Player {
    private String Name;
    private int age;
    private String Type;
    private String Statistics;

    public PLayer(String Name, int age, String Type, String Statistics){
        this.Name = Name;
        this.age = age;
        this.Statistics = Statistics;
        this.Type = Type;
    }

    void viewDetails(){
        System.out.println("Player Name: "+ Name);
        System.out.println("Player age: "+ age);
        System.out.println("Player Statistics: "+ Statistics);
        System.out.println("Player Type: "+ Type);
    }

    void getAverage(){
        System.out.println("Player Average: ");
    }

    void getBestPerformance(){
        System.out.println("Player Performance:"  );
    }

    void getType(){
        System.out.println("Player Type: "+ Type);
    }

}

