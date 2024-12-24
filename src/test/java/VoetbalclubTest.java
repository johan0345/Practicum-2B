package test.java;

import main.Voetbalclub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VoetbalclubTest {

    @Test
    void testClubNaamNaarFC() {
        // Test als naam null is
        Voetbalclub club1 = new Voetbalclub(null);
        assertEquals("FC", club1.toString().split(" ")[0], "De clubnaam moet 'FC' zijn als de naam null is.");

        // Test als naam een lege string heeft
        Voetbalclub club2 = new Voetbalclub("");
        assertEquals("FC", club2.toString().split(" ")[0], "De clubnaam moet 'FC' zijn als de naam leeg is.");
    }

    @Test
    void testFoutieveInvoer() {
        Voetbalclub club = new Voetbalclub("Voetbalclub 1");

        // Goeie resultaten
        club.verwerkResultaat('w'); // 3 punten
        club.verwerkResultaat('g'); // 1 punt
        club.verwerkResultaat('v'); // 0 punten

        // Foute resultaten
        club.verwerkResultaat('x'); // Foutieve invoer
        club.verwerkResultaat('1'); // Foutieve invoer
        club.verwerkResultaat('#'); // Foutieve invoer

        // Verwachte output
        System.out.println(club);

        // Punten en gespeelde wedstrijden controleren
        assert club.aantalPunten() == 4 : "Punten moeten gelijk zijn aan 4";
        assert club.aantalGespeeld() == 3 : "Aantal gespeelde wedstrijden moet 3 zijn";
    }
}