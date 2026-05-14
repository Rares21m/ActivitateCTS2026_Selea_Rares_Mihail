package PROXY_1.clase;

public class RegistruMedicalProxy implements IRegistru{
    RegistruMedical registruMedical;

    @Override
    public void afiseazaDosar(Pacient p, Angajat utilizator) {
       if(utilizator.getRol().equalsIgnoreCase("Medic")){
           if(registruMedical==null) registruMedical=new RegistruMedical();
           registruMedical.afiseazaDosar(p,utilizator);
       }else{
           System.out.println("EROARE: Angajatul "+ utilizator.getNume()+" nu are dreptul al informatiile sensibile");
       }
    }
}
