public class Main {
    public static void main(String[] args) {
        Theatre try1 = new Theatre("Try1", 10, 15);

        try1.printSeatMap();

        try1.reserveSeat(1, 'A');

        try1.printSeatMap();
    }
}