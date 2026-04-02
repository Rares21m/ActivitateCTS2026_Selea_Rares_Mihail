package ExersareBuilder4;

public class Main {
    public static void main(String[] args) {
        CardCalatorie card=new CardCalatorieBuilder().setNumeTitular("Rares").setTipCard(TipCard.ADULT).setNrCalatorii(50).build();
        System.out.println(card);
    }
}
