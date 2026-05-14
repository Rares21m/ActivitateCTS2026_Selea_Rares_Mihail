package FLYWEIGHT_2.clase;

public class PozitieCopac {
    private int X;
    private int Y;

    public PozitieCopac(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PozitieCopac{");
        sb.append("X=").append(X);
        sb.append(", Y=").append(Y);
        sb.append('}');
        return sb.toString();
    }
}
