package de.db.mosaik.tdd

import org.junit.Test

import org.junit.Assert.*

/**
 * Übung 1: TDD Pattern Triangulate
 *
 * Es wird ein einfacher Service zur Umwandlung der deutschen in die englische Uhrzeit implementiert.
 * Folgende Anforderungen sind zu berücksichtigen:
 *  1. In England ist es eine Stunde früher als in Deutschland.
 *  2. In England wird das 12h Format, in Deutschland das 24h Format verwendet.
 *  3. Es muss der Tagesüberlauf (zwischen 0 und 1 Uhr) berücksichtigt werden.
 *
 *  Technische Vorgaben: Der Systemarchitekt hat entschieden für den Service keine Standard-
 *  Zeitbibliotheken (Yoda oder ähnliches) einzusetzen. Der Service muss also selbst die Logik
 *  für die Zeitumwandlung liefern.
 */
class TimeConversionServiceTest {

    /**
     * Aufgabe 1: Sorge dafür, dass folgender Testfall erfolgreich durchläuft.
     * Schreibe zunächst so wenig Code wie möglich um die Assertion zu erfüllen.
     */
    @Test
    fun test_5oClockInGermany_ShouldBe4oClockInBritain() {
        val service = TimeConversionService()
        val germanTime = PrimitiveTime(5)
        val actual = service.convertToEnglishTime(germanTime)
        assertEquals(PrimitiveTime(4), actual)
    }

    /**
     * Aufgabe 2: Definiere ein Beispiel, dass die 2. Anforderung erfüllt.
     * Implementiere anschließend den erforderlichen Business Code.
     * Anmerkung: PrimitiveTime darf für Englisch nur Werte zwischen 0 und 11 annehmen.
     */

    /**
     * Aufgabe 3: Definiere ein Beispiel, dass die 3. Anforderung erfüllt.
     * Implementiere anschließend den erforderlichen Business Code.
     * Anmerkung: für den Anwender ist der aktuelle Tag irrelevant.
     */
}
