class Computer{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        if (cost > 5) return "pen";
        return "Nothing";
    }
}

public class computer{
    public static void main(String a[]){
        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMePen(12));
    }
}