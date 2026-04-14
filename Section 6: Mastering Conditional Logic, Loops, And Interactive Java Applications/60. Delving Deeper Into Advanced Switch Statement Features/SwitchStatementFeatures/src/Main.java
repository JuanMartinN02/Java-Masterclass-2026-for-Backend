public class Main {
    public static void main(String[] args) {
        System.out.println(getQuarter("APRIL"));
    }

    public static String getQuarter(String month){
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad input";
        };
    }
}