package de.cae;

import de.cae.interfaces.IInput;
import de.cae.util.CmdParser;
import de.cae.util.IPOException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var cmdParser = new CmdParser(args);
        final long start = System.currentTimeMillis();
        /*
        try{
            //TODO starte Programm
        } catch (IPOException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.exit(1);
        }
        */
        final long end = System.currentTimeMillis();
        LOGGER.log(Level.INFO, "Programmlaufzeit: " + (end - start) + " Millisekunden");
    }
}