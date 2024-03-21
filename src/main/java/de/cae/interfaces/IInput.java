package de.cae.interfaces;

import de.cae.util.IPOException;

/**
 * Ein Interface welches dem IPO Model (Input-Process-Output) entspricht.
 *
 * @param <T> Eingelesenes Objekt
 */
public interface IInput<T> {

    /**
     * Einlesen eines Objekts
     *
     * @return das eingelesene Objekt in einem geeignetem Datentyp, der bei der Implementation zu wählen ist.
     */
    public T readFile() throws IPOException;
}
