public class DNI {
    private int number;
    private char letter;
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public DNI() {
        this.number = 0;
    }

    public DNI(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public DNI(int number) {
        this.number = number;
        this.letter = letterForDni(number);
    }

    public DNI(String s) {
        String numStr = s.substring(0, s.length() - 1);
        this.number = Integer.parseInt(numStr);
        this.letter = s.charAt(s.length() - 1);
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int number) {
        number = number;
    }

    public static char letterForDni(int number) {
        return LETRAS[number % 23];
    }

    public static String nifForDni(int number) {
        return ""+ number + letterForDni(number);
    }

    public boolean correctDni() {
       return number >= 0;
    }

    @Override
    public String toString() {
        return nifForDni(number);
    }

    public String toFormattedString() {
        return String.format("%,d",getNumber())  + "-" + getLetter();
    }
}
