import java.util.TreeSet;

public class Theatre {
    private String name;
    private int seatPerRow;
    private int rows;
    TreeSet<Seat> seats;

    public Theatre(String name, int rows, int seatPerRow) {

        if (rows > 26){
            rows = 26;
        } else if (rows < 1) {
            rows = 1;
        }

        this.name = name;
        this.rows = rows;
        this.seatPerRow = seatPerRow;
        this.seats = new TreeSet<>();

        int lastRow = 'A' + (rows - 1);

        for (char row = 'A'; row <= lastRow; row++){
            for (int i = 1; i <= seatPerRow; i++){
                seats.add(new Seat(row, i));
            }
        }
    }

    public void reserveSeat(int Rnum, char Rchar){
        Seat rSeat = new Seat(Rchar, Rnum);
        Seat requested = seats.floor(rSeat);

        System.out.println(rSeat.toString());

        if(requested == null || !requested.seatFull.equals(rSeat.seatFull)){
            System.out.println("--> No seat: " + rSeat);
        }else {
            requested.reserve();
        }
    }

    public void printSeatMap(){
        for (Seat seat : seats){
            System.out.print(seat.seatFull + ((seat.reserved) ? "(R)" : "") + " | ");
            if (this.seatPerRow == seat.seat) {
                System.out.println();
            }
        }
    }

    class Seat implements Comparable<Seat>{
        private char row;
        private int seat;
        private String seatFull;
        private boolean reserved;

        public Seat(char row, int seat) {
            this.row = row;
            this.seat = seat;
            this.seatFull = row + String.format("%03d", seat);
            this.reserved = false;
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatFull.compareTo(o.seatFull);
        }

        public char getRow() {
            return row;
        }

        public void setRow(char row) {
            this.row = row;
        }

        public int getSeat() {
            return seat;
        }

        public void setSeat(int seat) {
            this.seat = seat;
        }

        public String getSeatFull() {
            return seatFull;
        }

        public void reserve(){
            this.reserved = true;
        }

        public void unReserve(){
            this.reserved = false;
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "row=" + row +
                    ", seat=" + seat +
                    ", seatFull='" + seatFull + '\'' +
                    ", reserved=" + reserved +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public int getSeatPerRow() {
        return seatPerRow;
    }

    public int getRows() {
        return rows;
    }

    public TreeSet<Seat> getSeats() {
        return seats;
    }

}
