package de.cae.interfaces;

import de.cae.util.IPOException;

/**
 * Ein Interface welches dem IPO Model (Input-Process-Output) entspricht.
 *
 * @param <T> Auszugebendes Objekt
 */
public interface IOutput<T> {

    /**
     * Ausgeben eines Objekts
     *
     * @param output der in die Ausgabedatei geschrieben werden soll.
     * @return true, falls die Ausgabe erfolgreich war, sonst false.
     */
    public boolean writeToFile(T output) throws IPOException;
}


