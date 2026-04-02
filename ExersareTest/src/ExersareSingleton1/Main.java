package ExersareSingleton1;

public class Main {
    public static void main(String[] args) {
        ConfigurareAplicatie instance=ConfigurareAplicatie.getInstance("romana",4,"online");
        System.out.println(instance);

        ConfigurareAplicatie instance2=ConfigurareAplicatie.getInstance("engleza",5,"fizic");
        System.out.println(instance2);
    }
}
