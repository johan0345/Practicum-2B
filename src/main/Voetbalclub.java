package main;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Verwijder spaties
    public Voetbalclub(String naam) {
        if (naam == null || naam.trim().isEmpty()) {
            this.naam = "FC";
        } else {
            this.naam = naam.trim();
        }
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen++;
        } else if (ch == 'g') {
            aantalGelijk++;
        } else if (ch == 'v') {
            aantalVerloren++;
        } else {
            // Foutieve invoer
            System.out.println("Foutieve invoer: " + ch);
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
