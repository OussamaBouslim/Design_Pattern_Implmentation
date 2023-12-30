package exercice1;

/**
 * Client class to demonstrate the use of ProgrammeInterface implementations.
 */
public class Client {
    public static void main(String[] args) {
       int programNumber = 4;

        ProgrammeInterface program = ProgrammeFactory.getProgramme(programNumber);

        // Now, you can call the 'go' method on the selected program.
        program.go();
    }
}
