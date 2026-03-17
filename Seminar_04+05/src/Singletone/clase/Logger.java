package Singletone.clase;
//De obicei la test putem primi interfata sau clasa abstracta
public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instanta=null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afiseazaLog(String text){
        System.out.println("Log cu ID " + cod + " , efectuat de utilizatorul cu numele "+sender+" este din categoria : "+categorie+" si are textul : "+text);
        this.cod++;
    }

    public static synchronized Logger getInstanta(String sender, String categorie){
        if( instanta==null){
            instanta = new Logger(sender,categorie);
        }
        return instanta;
    }

}
