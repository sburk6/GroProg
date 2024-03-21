Diese Anwendung ist auf Windows 10 und mit Java Corretto 21.0.2 entwickelt und getestet worden.
Im Ordner IHK_GroProg/program liegt ein Startskript "run_gro_pro.py" welches mit Python 3.9 entwickelt wurde.
Die Lauffähigkeit des Programms und des Startskripts ist ausschließlich auf dieser Plattform garantiert.
Es muss dieses Java und Python auf dem Rechner installiert sein zum Ausführen des Programms.

Normalerweise sollte das Programm ebenfalls auf Linux oder mit neueren Java Versionen funktionieren.
Das Startskript sollte auch mit anderen Python 3 Versionen laufen.

Die Anwendung kann ausgeführt werden, indem man im Terminal den folgenden Command eingibt:

`python <pathTo>/run_gro_pro.py -i <inputFile> -o <outputFile> (-l [true, false, file]) (-lvl [info, warning]) (-h)`

Die `<>`-Elemente müssen ersetzt werden.
Parameter innerhalb von runden Klammern`()` sind optional.
`[]`-Elemente beschreiben vorhandene Auswahlmöglichkeiten.

Durch das Nutzen des -h Parameters (oder --help) kann folgende Parametererklärung aufgerufen werden (Das Programm wird danach beendet):

    Benutzung: -i <inputFile> -o <outputFile> (-l [true, false, file]) (-lvl [info, warning]) (-h)
    
    Kurzbeschreibung hier.
                    
    Erforderliche Parameter:
    -i <inputFile>, --input <inputFile>                     Pfad der Eingabedatei
    -o <outputFile>, --output <outputFile>                  Pfad der Ausgabedatei
 
    Optionale Parameter:
    -l [true, false, file], -log [true, false, file]        Log in der Konsole oder in Datei, default: "false"
    --loglvl [info, warning]                                Nur Informationen oder Warnungen loggen, default: "all"
    -h, --help                                              Diese Hilfenachricht anzeigen und Programm beenden

Mithilfe von `-l` beziehungsweise `-log` lässt sich der Log entweder in der Konsole oder in einer Datei (im aktuellen Verzeichnis) ausgeben. 
Standardmäßig wird nur angezeigt, ob das Programm erfolgreich durchgelaufen ist oder ob ein Fehler aufgetreten ist.

Bei einem Fehler wird dieser ebenfalls in der Konsole ausgegeben.

Mit `-lvl` beziehungsweise `--loglvl` kann man sich nur die Informationen oder Warnungen anzeigen lassen.
Der Standard ist dabei, dass alle Logs ausgegeben werden.


