public class main {
    public static void main(String[] args) {

        int res = quersummeUnoptimiert(123);
        int resOp = quersummeOptimiert(123);

        /*
         * beide leifern das selbe ergebnis allerdings mit unterschiedlichen Laufzeiten,
         * system aufrufen und Speicher bedarf :)
         * Ich persoenlich finde die String method allerdings viel intuitiver da man
         * direkt die werte aufaddieren kann und nicht erst modulo und geteilt rechnen
         * muss. Wann man was verwendet haengt stark von den anforderungen ab,
         * allerdings ist der unterschied im grossen und ganzen nicht weiter wichtig
         * wenn du einfach ein programm zum berechnen der quersumme verwendest, da juckt
         * es eh niemanden ob dein programm jetzt maximal optimiert ist oder nicht
         */
        System.out.println(res + " " + resOp);
    }

    /*
     * Quersumme optimiert braucht viel weniger Speicher und ein integer wird auf
     * dem Stack abgelegt -> direkter zugriff auf wert -> viel efizienter
     *
     * ausserdem
     * operationen wie "/"
     * geteilt und "%" modulo wurden sehr stark auf hardware ebene optimiert und
     * laufen viel besser als String operationen
     */
    public static int quersummeOptimiert(int number) {

        // resultat variable um zwischen und Endergebnis zu halten
        int result = 0;

        // wiederhole so lange bis zahl 0 ist, dann wurden alle Ziffern aufaddiert
        while (number > 0) {

            // durch modulo 10 wird jehweils die letzte ziffer der Zahl abgegriffen und
            // addiere diese auf die variable result
            // zb bei 1234 % 10 => 4
            // result += number % 10 ist eine kurzschreibweise fuer result = result + number
            // % 10
            result += number % 10;

            // durch ganzzahlige division durch 10 wird, faellt die letzte Ziffer der Zahl
            // weg
            // zb bei 1234 / 10 => 123
            // number /= 10 ist eine kurzschreibweise fuer number = number / 10
            number /= 10;
        }

        // nun gib resultat aus
        return result;
    }

    /*
     * Die Methode mit dem String ist desswegen unoptimiert, weil ein String viel
     * mehr Platz im Speicher braucht,
     * zb braucht der String 1234 max 16 byte also 16 * 8 bit = 128 bit, das integer
     * 1234 braucht aber nur 32 bzw 64 bit (ich habe vergessen was der default
     * speicherplatz ist den Java bereitstellt)
     * 
     * Ausserdem wird ein String im Heap abgelegt, das bedeutet Java muss wenn es
     * auf den String zugreiefen will einem Pointer zum Speicherort des String
     * folgen -> uneffizient
     * Auch umwandlung von Character zu integer kostet viel bezueglich operationen
     * und additiven speicherplatz
     * 
     */
    public static int quersummeUnoptimiert(int number) {

        // Konvertiere nummer vom typ int zum typ String
        String numberAsString = Integer.toString(number);

        // Variable die zwischen und Endwert haelt
        int result = 0;

        // Fuer jedes zeichen in dem String mit den ziffern
        for (int i = 0; i < numberAsString.length(); i++) {

            // hol dir den zahlen wert des zeichens
            int digit = Character.getNumericValue(numberAsString.charAt(i));

            // addieren zahlenwert auf result variable
            // result =* digit ist eine kurzschreibweise fuer result = result + digit
            result += digit;
        }

        // nun gib resultat aus
        return result;
    }
}
