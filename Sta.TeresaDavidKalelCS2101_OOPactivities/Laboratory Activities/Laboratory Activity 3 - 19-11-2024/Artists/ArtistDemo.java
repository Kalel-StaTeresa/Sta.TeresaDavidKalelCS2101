public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Yayoi Kusama", "Japanese", 95, "Contemporary Arts");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Adele", "British", 36, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", "American", 41, "Ballet", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Kehinde Wiley", "American", 47, "Portraiture", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Haruki Murakami", "Japanese", 75 , "Fiction", WritingStyle.FICTION);
        Write.displayInfo();
    }
}