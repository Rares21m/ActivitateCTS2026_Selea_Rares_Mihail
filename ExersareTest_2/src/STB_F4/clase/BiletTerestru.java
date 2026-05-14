package STB_F4.clase;

public class BiletTerestru {
    private String serie;
    private double sold;

    public BiletTerestru(String serie, double sold) {
        this.serie = serie;
        this.sold = sold;
    }

    public void validareBilet(){
        if(this.sold>0){
            System.out.println("Biletul Terestru "+serie+" este validat");
        }
        else {
            System.out.println("Biletul Terestru "+serie+" -Fonduri insuficiente");

        }
    }
}
