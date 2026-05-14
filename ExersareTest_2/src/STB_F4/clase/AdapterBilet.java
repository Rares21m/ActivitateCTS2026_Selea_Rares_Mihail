package STB_F4.clase;


public class AdapterBilet extends BiletSubteran {

    private BiletTerestru biletTerestru;

    public AdapterBilet(BiletTerestru biletTerestru) {
        this.biletTerestru = biletTerestru;
    }

    @Override
    public void scaneazaBilet() {
        biletTerestru.validareBilet();
    }
}
