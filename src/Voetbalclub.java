public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Verwijder spaties
    public Voetbalclub(String naam) {
        this.naam = naam.trim();
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen++;
        } else if (ch == 'g') {
            aantalGelijk++;
        } else if (ch == 'v') {
            aantalVerloren++;
        }
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString() {
        return naam + " " + aantalGespeeld() + " gespeeld, " +
                aantalGewonnen + " gewonnen, " + aantalGelijk + " gelijk, " +
                aantalVerloren + " verloren. Punten: " + aantalPunten();
    }
}
