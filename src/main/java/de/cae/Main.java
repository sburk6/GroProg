package de.cae;

import de.cae.util.CmdParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var cmdParser = new CmdParser(args);
        final long start = System.currentTimeMillis();

        //TODO starte Programm

        final long end = System.currentTimeMillis();
        LOGGER.log(Level.INFO, "Programmlaufzeit: " + (end - start) + " Millisekunden");
    }
}