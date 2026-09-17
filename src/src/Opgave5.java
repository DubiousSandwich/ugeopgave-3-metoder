public class Opgave5 {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */
int smaller;                                            //vi initialiserer smaller i det globale scope

    void main() {

        int a = 7, b = 42;

        minimum(a,b);

        if (smaller == a) {                             //curly brackets i stedet for normale brackets

            System.out.println(a + " is the smallest!");   //printer ikke vores variabel

        }

    }

    int minimum(int a, int b) {               //en void metode kan ikke returnere en værdi

        if (a < b) {

            smaller = a;

        } else if (a >= b) {                   //else kan ikke have en condition uden if

            smaller = b;

        }

        return smaller;                   //variablen skal ikke initialiseres hver gang, så ikke "int smaller"

    }
}
