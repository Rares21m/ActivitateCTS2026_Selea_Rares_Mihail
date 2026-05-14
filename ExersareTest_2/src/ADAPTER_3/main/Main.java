package ADAPTER_3.main;

import ADAPTER_1.clase.AdapterBanca;
import ADAPTER_3.clase.UltraHDLib;
import ADAPTER_3.clase.VideoAdapter;
import ADAPTER_3.clase.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        UltraHDLib librarieVeche=new UltraHDLib();

        VideoPlayer player=new VideoAdapter(librarieVeche);

        player.playStream("Matrix_3k");
    }
}
