package Observer_4.clase;

public interface INotificare {
    void abonarePacient(IPacient pacient);
    void dezabonarePacient(IPacient pacient);
    void notificaPacienti(String mesaj);
}
