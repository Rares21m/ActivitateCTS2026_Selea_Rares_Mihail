package SingletonExersare3;

public class Main {
    public static void main(String[] args) {
        Logger instanta=Logger.getInstance("Microsoft");
        System.out.println(instanta);
        instanta.logError("Aplicatia nu poate rula pe acest cont");
        instanta.logInfo("Aplicatie ruleaza in fundal");

        Logger instanta2=Logger.getInstance("Photoshop");
        System.out.println(instanta2);
    }
}
