package STB_F4.main;

import STB_F4.clase.AdapterBilet;
import STB_F4.clase.BiletSubteran;
import STB_F4.clase.BiletTerestru;

public class Main {
    public static void main(String[] args) {
         BiletTerestru biletSTB=new BiletTerestru("2842fd",-3);

        BiletSubteran biletTerestru=new AdapterBilet(biletSTB);

        biletTerestru.scaneazaBilet();
    }
}
