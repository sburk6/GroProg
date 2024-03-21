package de.cae.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CmdParser {

    private static final Logger ROOT_LOGGER = Logger.getLogger("");
    private static final Logger LOGGER = Logger.getLogger(CmdParser.class.getName());
    private static final String INPUT = "--input";
    private static final String OUTPUT = "--output";
    private static final String LOG = "--log";
    private static final String Log_LEVEL = "--loglvl";
    private static final String HELP = "--help";



    public CmdParser(String[] args){

        for(var i = 0; i < args.length; ++i){
            switch (args[i]){
                case INPUT, "-i" ->{

                }
                case OUTPUT, "-o" -> {}
                case LOG, "-l" -> {}
                case Log_LEVEL, "-lvl" -> {}
                case HELP, "-h" -> {
                    printHelp();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid argument: " + args[i]);
                    printHelp();
                    System.exit(0);
                }
            }
        }


    }

    private void printHelp(){
        //TODO Beschreibung anpassen
         System.out.println(
                """
                    Benutzung: -i <inputFile> -o <outputFile> (-l [true, false, file]) (-lvl[info, warning]) (-h)
                    
                    Kurzbeschreibung hier.
                    
                    Erforderliche Parameter:
                    -i <inputFile>, --input <inputFile>                     Pfad der Eingabedatei
                    -o <outputFile>, --output <outputFile>                  Pfad der Ausgabedatei
                    
                    Optionale Parameter:
                    -l [true, false, file], -log [true, false, file]        Log in der Konsole oder in Datei, default = "false"
                    --loglvl [info, warning]                                Nur Informationen oder Warnungen loggen
                    -h, --help                                              Diese Hilfenachricht anzeigen und Programm beenden
                """);
    }

    public enum LogOption {
        TRUE("true"),
        FALSE("false"),
        FILE("file");
        private final String value;

        LogOption(String value) {
            this.value = value;
        }

        public static LogOption getOption(String value) {
            for (var option : LogOption.values()) {
                if (option.value.equals(value)) {
                    return option;
                }
            }
            return FALSE;
        }
    }
}
