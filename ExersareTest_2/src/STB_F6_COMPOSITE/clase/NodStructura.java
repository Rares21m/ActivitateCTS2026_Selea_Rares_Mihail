package STB_F6_COMPOSITE.clase;

public abstract class NodStructura {
        public void adaugaNod(NodStructura nod) {
            throw new UnsupportedOperationException();
        }
        public void stergeNod(NodStructura nod) {
            throw new UnsupportedOperationException();
        }
        public NodStructura getNod(int i) {
            throw new UnsupportedOperationException();
        }

        // Metoda pe care o vor implementa toti
        public abstract void afiseazaDetalii(String indentare);

}
