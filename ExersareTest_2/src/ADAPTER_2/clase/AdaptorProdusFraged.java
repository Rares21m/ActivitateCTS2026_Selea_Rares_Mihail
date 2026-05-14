package ADAPTER_2.clase;

public class AdaptorProdusFraged extends ProdusFraged{
    PachetStandard pachetStandard;

    public AdaptorProdusFraged(PachetStandard pachetStandard) {
        this.pachetStandard = pachetStandard;
    }

    @Override
    public void livrareSpecialaCuAtentie() {
        pachetStandard.livreazaPachet();
    }
}
