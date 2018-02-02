package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_sv extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\nF\u00F6ljande alternativ \u00E4r Mac OS X-specifika:\n    -XstartOnFirstThread\n                      k\u00F6r main()-metoden p\u00E5 den f\u00F6rsta (AppKit)-tr\u00E5den\n    -Xdock:name=<applikationsnamn>\n                      \u00E5sidos\u00E4tt det standardapplikationsnamn som visas i dockan\n    -Xdock:icon=<s\u00F6kv\u00E4g till ikonfil>\n                      \u00E5sidos\u00E4tt den standardikon som visas i dockan\n\n" },
            { "java.launcher.X.usage", "\n    -Xbatch           avaktivera bakgrundskompilering\n    -Xbootclasspath/a:<kataloger och zip-/jar-filer avgr\u00E4nsade med {0}>\n                      l\u00E4gg till sist i klass\u00F6kv\u00E4gen f\u00F6r programladdning\n    -Xcheck:jni       utf\u00F6r fler kontroller f\u00F6r JNI-funktioner\n    -Xcomp            tvingar kompilering av metoder vid det f\u00F6rsta anropet\n    -Xdebug           tillhandah\u00E5lls f\u00F6r bak\u00E5tkompatibilitet\n    -Xdiag            visa fler diagnostiska meddelanden\n    -Xfuture          aktivera str\u00E4ngaste kontroller, f\u00F6rv\u00E4ntad framtida standard\n    -Xint             endast exekvering i tolkat l\u00E4ge\n    -Xinternalversion\n                      visar mer detaljerad information om JVM-version \u00E4n\n                      alternativet -version\n    -Xloggc:<fil>    logga GC-status till en fil med tidsst\u00E4mplar\n    -Xmixed           exekvering i blandat l\u00E4ge (standard)\n    -Xmn<storlek>     anger ursprunglig och maximal storlek (i byte) f\u00F6r h\u00F6gen f\u00F6r\n                      generationen med nyare objekt (h\u00F6gen f\u00F6r tilldelning av nya objekt)\n    -Xms<storlek>     ange ursprunglig storlek f\u00F6r Java-heap-utrymmet\n    -Xmx<storlek>     ange st\u00F6rsta storlek f\u00F6r Java-heap-utrymmet\n    -Xnoclassgc       avaktivera klasskr\u00E4pinsamling\n    -Xprof            utdata f\u00F6r processorprofilering (inaktuellt)\n    -Xrs              minska operativsystemssignalanv\u00E4ndning f\u00F6r Java/VM (se dokumentationen)\n    -Xshare:auto      anv\u00E4nd delade klassdata om m\u00F6jligt (standard)\n    -Xshare:off       f\u00F6rs\u00F6k inte anv\u00E4nda delade klassdata\n    -Xshare:on        kr\u00E4v anv\u00E4ndning av delade klassdata, utf\u00F6r inte i annat fall.\n    -XshowSettings    visa alla inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:all\n                      visa alla inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:locale\n                      visa alla spr\u00E5kkonventionsrelaterade inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:properties\n                      visa alla egenskapsinst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:vm visa alla vm-relaterade inst\u00E4llningar och forts\u00E4tt\n    -Xss<storlek>     ange storlek f\u00F6r java-tr\u00E5dsstacken\n    -Xverify          anger l\u00E4ge f\u00F6r bytekodverifieraren\n    --add-reads <modul>=<m\u00E5lmodul>(,<m\u00E5lmodul>)*\n                      uppdaterar <modul> f\u00F6r att l\u00E4sa <m\u00E5lmodul>, oavsett\n                      moduldeklarationen. \n                      <m\u00E5lmodul> kan vara ALL-UNNAMED f\u00F6r att l\u00E4sa alla\n                      ej namngivna moduler.\n    --add-exports <modul>/<paket>=<m\u00E5lmodul>(,<m\u00E5lmodul>)*\n                      uppdaterar <modul> f\u00F6r att exportera <paket> till <m\u00E5lmodul>,\n                      oavsett moduldeklarationen.\n                      <m\u00E5lmodul> kan vara ALL-UNNAMED f\u00F6r att exportera till alla\n                      ej namngivna moduler.\n    --add-opens <modul>/<paket>=<m\u00E5lmodul>(,<m\u00E5lmodul>)*\n                      uppdaterar <modul> f\u00F6r att \u00F6ppna <paket> till\n                      <m\u00E5lmodul>, oavsett moduldeklarationen.\n    --limit-modules <modulnamn>[,<modulnamn>...]\n                      begr\u00E4nsar universumet med observerbara moduler\n    --patch-module <modul>=<fil>({0}<fil>)*\n                      \u00E5sidos\u00E4tt eller ut\u00F6ka en modul med klasser och resurser\n                      i JAR-filer eller kataloger.\n    --disable-@files  avaktivera ytterligare argumentfilsut\u00F6kning\n\nDe h\u00E4r extraalternativen kan \u00E4ndras utan f\u00F6reg\u00E5ende meddelande.\n" },
            { "java.launcher.cls.error1", "Fel: kunde inte hitta eller ladda huvudklassen {0}\nOrsakades av: {1}: {2}" },
            { "java.launcher.cls.error2", "Fel: Huvudmetoden \u00E4r inte {0} i klassen {1}, definiera huvudmetoden som:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Fel: Huvudmetoden m\u00E5ste returnera ett v\u00E4rde av typen void i klassen {0}, \ndefiniera huvudmetoden som:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Fel: Huvudmetoden finns inte i klassen {0}, definiera huvudmetoden som:\n   public static void main(String[] args)\neller s\u00E5 m\u00E5ste en JavaFX-applikationsklass ut\u00F6ka {1}" },
            { "java.launcher.cls.error5", "Fel: JavaFX-exekveringskomponenter saknas, och de kr\u00E4vs f\u00F6r att kunna k\u00F6ra den h\u00E4r applikationen" },
            { "java.launcher.cls.error6", "Fel: LinkageError intr\u00E4ffade vid laddning av huvudklassen {0}\n\t{1}" },
            { "java.launcher.init.error", "initieringsfel" },
            { "java.launcher.jar.error1", "Fel: Ett ov\u00E4ntat fel intr\u00E4ffade n\u00E4r filen {0} skulle \u00F6ppnas" },
            { "java.launcher.jar.error2", "manifest finns inte i {0}" },
            { "java.launcher.jar.error3", "inget huvudmanifestattribut i {0}" },
            { "java.launcher.jar.error4", "fel vid laddning av java-agenten i {0}" },
            { "java.launcher.javafx.error1", "Fel: JavaFX launchApplication-metoden har fel signatur, den \nm\u00E5ste ha deklarerats som statisk och returnera ett v\u00E4rde av typen void" },
            { "java.launcher.module.error1", "modulen {0} har inget MainClass-attribut, anv\u00E4nd -m <module>/<main-class>" },
            { "java.launcher.module.error2", "Fel: kunde inte hitta eller ladda huvudklassen {0} i modulen {1}" },
            { "java.launcher.module.error3", "Fel: kan inte ladda huvudklassen {0} fr\u00E5n modulen {1}\n\t{2}" },
            { "java.launcher.module.error4", "{0} hittades inte" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  Inaktuellt, tas bort i en framtida utg\u00E5va\n" },
            { "java.launcher.opt.footer", "    -cp <klass\u00F6kv\u00E4g till kataloger och zip-/jar-filer>\n    -classpath <klass\u00F6kv\u00E4g till kataloger och zip-/jar-filer>\n    --class-path <klass\u00F6kv\u00E4g till kataloger och zip-/jar-filer>\n                  En {0}-avgr\u00E4nsad lista \u00F6ver kataloger, JAR-arkiv\n                  och ZIP-arkiv att s\u00F6ka efter klassfiler i.\n    -p <moduls\u00F6kv\u00E4g>\n    --module-path <moduls\u00F6kv\u00E4g>...\n                  En {0}-avgr\u00E4nsad lista \u00F6ver kataloger, d\u00E4r varje katalog\n                  \u00E4r en katalog \u00F6ver moduler.\n    --upgrade-module-path <moduls\u00F6kv\u00E4g>...\n                  En {0}-avgr\u00E4nsad lista \u00F6ver kataloger, d\u00E4r varje katalog\n                  \u00E4r en katalog \u00F6ver moduler som ers\u00E4tter uppgraderingsbara\n                  moduler i exekveringsavbilden\n    --add-modules <modulnamn>[,<modulnamn>...]\n                  rotmoduler att l\u00F6sa f\u00F6rutom den ursprungliga modulen.\n                  <modulnamn> kan \u00E4ven vara ALL-DEFAULT, ALL-SYSTEM,\n                  ALL-MODULE-PATH.\n    --list-modules\n                  visa observerbara moduler och avsluta\n    --d <modulnamn>\n    --describe-module <modulnamn>\n                  beskriv en modul och avsluta\n    --dry-run     skapa VM och ladda huvudklassen men k\u00F6r inte huvudmetoden.\n                  Alternativet --dry-run kan vara anv\u00E4ndbart f\u00F6r att validera\n                  kommandoradsalternativ, som modulsystemkonfigurationen.\n    --validate-modules\n                  validera alla moduler och avsluta\n                  Alternativet --validate-modules kan vara anv\u00E4ndbart f\u00F6r att hitta\n                  konflikter och andra fel i modulerna p\u00E5 moduls\u00F6kv\u00E4gen.\n    -D<namn>=<v\u00E4rde>\n                  ange en systemegenskap\n    -verbose:[class|module|gc|jni]\n                  aktivera utf\u00F6rliga utdata\n    -version      skriv ut produktversion till felstr\u00F6mmen och avsluta\n    --version     skriv ut produktversion till utdatastr\u00F6mmen och avsluta\n    -showversion  skriv ut produktversion till felstr\u00F6mmen och forts\u00E4tt\n    --show-version\n                  skriv ut produktversion till utdatastr\u00F6mmen och forts\u00E4tt\n    --show-module-resolution\n                  visa modull\u00F6sningsutdata vid start\n    -? -h -help\n                  skriv ut det h\u00E4r hj\u00E4lpmeddelandet till felstr\u00F6mmen\n    --help        skriv ut det h\u00E4r hj\u00E4lpmeddelandet till utdatastr\u00F6mmen\n    -X            skriv ut hj\u00E4lp f\u00F6r extraalternativ till felstr\u00F6mmen\n    --help-extra  skriv ut hj\u00E4lp f\u00F6r extraalternativ till utdatastr\u00F6mmen\n    -ea[:<paketnamn>...|:<klassnamn>]\n    -enableassertions[:<paketnamn>...|:<klassnamn>]\n                  aktivera verifieringar med den angivna detaljgraden\n    -da[:<paketnamn>...|:<klassnamn>]\n    -disableassertions[:<paketnamn>...|:<klassnamn>]\n                  avaktivera verifieringar med den angivna detaljgraden\n    -esa | -enablesystemassertions\n                  aktivera systemverifieringar\n    -dsa | -disablesystemassertions\n                  avaktivera systemverifieringar\n    -agentlib:<biblioteksnamn>[=<alternativ>]\n                  ladda det ursprungliga agentbiblioteket <biblioteksnamn>, t.ex. -agentlib:jdwp\n                  se \u00E4ven -agentlib:jdwp=help\n    -agentpath:<s\u00F6kv\u00E4gsnamn>[=<alternativ>]\n                  ladda det ursprungliga agentbiblioteket med fullst\u00E4ndigt s\u00F6kv\u00E4gsnamn\n    -javaagent:<jar-s\u00F6kv\u00E4g>[=<alternativ>]\n                  ladda Java-programmeringsspr\u00E5ksagenten, se java.lang.instrument\n    -splash:<bilds\u00F6kv\u00E4g>\n                  visa v\u00E4lkomstsk\u00E4rmen med den angivna bilden\n                  HiDPI-skal\u00E4ndrade bilder st\u00F6ds automatiskt och anv\u00E4nds om de \u00E4r\n       tillg\u00E4ngliga. Filnamnet p\u00E5 den oskal\u00E4ndrade bilden, t.ex. image.ext,\n                  ska alltid \u00F6verf\u00F6ras som argument till alternativet -splash.\n                  Den l\u00E4mpligaste skal\u00E4ndrade bilden v\u00E4ljs\n                  automatiskt.\n                  Mer information finns i dokumentationen f\u00F6r API:t SplashScreen\n    @argument filer\n                  en eller flera argumentfiler som inneh\u00E5ller alternativ\n    -disable-@files\n                  f\u00F6rhindra ytterligare ut\u00F6kning av argumentfiler\nOm du vill ange ett argument f\u00F6r ett l\u00E5ngt alternativ kan du anv\u00E4nda --<namn>=<v\u00E4rde> eller\n--<namn> <v\u00E4rde>.\n" },
            { "java.launcher.opt.header", "Syntax: {0} [options] <huvudklass>[args...]\n           (f\u00F6r att k\u00F6ra en klass)\n   eller  {0} [options] -jar <jar-fil> [args...]\n           (f\u00F6r att k\u00F6ra en jar-fil)\n   eller  {0} [options] -m <modul>[/<huvudklass>] [args...]\n       {0} [options] --module <modul>[/<huvudklass>] [args...]\n           (f\u00F6r att k\u00F6ra huvudklassen i en modul)\n\n Argument som kommer efter huvudklassen, -jar <jar-fil>, -m eller --module\n <modul>/<huvudklass> \u00F6verf\u00F6rs som argument till huvudklassen.\n\n med alternativen:\n\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u00E4r en synonym f\u00F6r \"{1}\" VM  [inaktuell]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  f\u00F6r att v\u00E4lja \"{1}\" VM\n" },
        };
    }
}
