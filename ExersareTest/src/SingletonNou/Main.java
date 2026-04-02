package SingletonNou;

public class Main {
    public static void main(String[] args) {
        ConexiuneBD instanta=ConexiuneBD.getInstanta("HTTP",234);
        System.out.println(instanta);
        ConexiuneBD instanta2=ConexiuneBD.getInstanta("HTTPS",2453);
        System.out.println(instanta2);
    }
}
