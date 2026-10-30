public class MainDni {
    public static void main(String[] args) {
        DNI dni = new DNI(24551232);

        System.out.println(dni);
        System.out.println(dni.getNumber());
        System.out.println(dni.getLetter());
        System.out.println(DNI.nifForDni(dni.getNumber()));
        System.out.println(dni.correctDni());
        System.out.println(dni.toFormattedString());

        System.out.println();

        DNI dni2 = new DNI("18554477Z");
        System.out.println(dni2);
        System.out.println(dni2.getNumber());
        System.out.println(dni2.getLetter());
        System.out.println(DNI.nifForDni(dni2.getNumber()));
        System.out.println(dni2.correctDni());
        System.out.println(dni2.toFormattedString());
    }

}
