package SingletonExersare3;

public class Logger {
    private String numeAplicatie;
    private static Logger instanta=null;

    private Logger(String numeAplicatie) {
        this.numeAplicatie = numeAplicatie;
    }

    public String getNumeAplicatie() {
        return numeAplicatie;
    }

    public void logInfo(String mesaj){
        System.out.println("[info][" + numeAplicatie + "] "+ mesaj);
    }

    public void logError(String mesaj){
        System.out.println("[error][" + numeAplicatie + "] "+ mesaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logger{");
        sb.append("numeAplicatie='").append(numeAplicatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Logger getInstance(String numeAplicatie){
        if(instanta==null){
            instanta=new Logger(numeAplicatie);
        }
        return instanta;
    }
}
