public class Escseq {
    public static void main(String[] args) {
        int limit = 10;
        boolean tab = false;

        for (int i = 1; i <= limit; i++) {
            int multiple = i * 7;
            if (tab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
            tab = !tab;
        }
    }
}
