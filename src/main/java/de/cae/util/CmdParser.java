package de.cae.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CmdParser {

    private static final Logger ROOT_LOGGER = Logger.getLogger("");
    private static final Logger LOGGER = Logger.getLogger(CmdParser.class.getName());
    private static final String INPUT = "--input";
    private static final String OUTPUT = "--output";
    private static final String LOG = "--log";
    private static final String LOG_LEVEL = "--loglvl";
    private static final String HELP = "--help";

    private String inputPath;
    private String outputPath;

    /**
     * Erstellt eine neue Instanz und verarbeitet die übergebenen Argumente
     *
     * @param args Programmargumente
     */
    public CmdParser(String[] args){
        var log = LogOption.FALSE;
        for(var i = 0; i < args.length; ++i){
            switch (args[i]){
                case INPUT, "-i" ->{
                    this.inputPath = args[++i];
                }
                case OUTPUT, "-o" -> {
                    this.outputPath = args[++i];
                }
                case LOG, "-l" -> {
                    try{
                        log = LogOption.getOption(args[++i]);
                    } catch (IllegalArgumentException e) {
                        LOGGER.log(Level.WARNING, "Konnte " + args[i]
                                + " Keiner Log-Option (true, false und file mit false als default) zuordnen");
                    }
                }
                case LOG_LEVEL, "-lvl" -> {
                    Level logLevel;
                    switch (args[++i]){
                        case "info" -> logLevel = Level.INFO;
                        case "warning" -> logLevel = Level.WARNING;
                        default -> {
                            logLevel = Level.ALL;
                            LOGGER.log(Level.WARNING, "Konnte " + args[i]
                                 + " keinem Log-Level (info, warning) zuordnen. 'All' wird als default angenommen.");
                        }
                    }
                    ROOT_LOGGER.setLevel(logLevel);
                }
                case HELP, "-h" -> {
                    printHelp();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid argument: " + args[i] + "\n");
                    printHelp();
                    System.exit(0);
                }
            }
        }


    }

    private void printHelp(){
        //TODO Beschreibung anpassen (AUCH IN README!!!!)
        System.out.println(helpMessage);
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



    private final String helpMessage =
            """
                    Benutzung: -i <inputFile> -o <outputFile> (-l [true, false, file]) (-lvl [info, warning]) (-h)
                    
                    Kurzbeschreibung hier.
                    
                    Erforderliche Parameter:
                    -i <inputFile>, --input <inputFile>                     Pfad der Eingabedatei
                    -o <outputFile>, --output <outputFile>                  Pfad der Ausgabedatei
                    
                    Optionale Parameter:
                    -l [true, false, file], -log [true, false, file]        Log in der Konsole oder in Datei, default: "false"
                    -lvl [info, warning], --loglvl [info, warning]          Nur Informationen oder Warnungen loggen, default: "all"
                    -h, --help                                              Diese Hilfenachricht anzeigen und Programm beenden
            """;

}
