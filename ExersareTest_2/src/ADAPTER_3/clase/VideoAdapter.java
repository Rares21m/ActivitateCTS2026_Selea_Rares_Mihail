package ADAPTER_3.clase;

public class VideoAdapter implements VideoPlayer{
    private UltraHDLib ultraHDLib;

    public VideoAdapter(UltraHDLib ultraHDLib) {
        this.ultraHDLib = ultraHDLib;
    }

    @Override
    public void playStream(String numeFisier) {
        ultraHDLib.renderHighResVideo(numeFisier);
    }
}
