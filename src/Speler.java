public class Speler {
    private int speler;
    private int total;


    public void addSpeler(int amount){
        total += amount;
        speler++;
    }

    public int totalSpeler() {
        if (speler <= 12) {
            return speler;
        } else {
            return 12;
        }
    }
}
