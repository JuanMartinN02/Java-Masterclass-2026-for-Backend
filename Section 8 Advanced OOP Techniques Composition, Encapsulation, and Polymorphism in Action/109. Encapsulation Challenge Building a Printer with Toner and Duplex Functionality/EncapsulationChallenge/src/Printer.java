public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void addToner(int toner){
        if (toner < 0 || toner > 100){
            System.out.println("Invalid toner ammount!");
            return;
        }

        if ((tonerLevel + toner) > 100) tonerLevel = 100;
        else tonerLevel += toner;

        System.out.println("Added " + toner + "% of toner.The new toner level is: " + tonerLevel);
    }

    public void printPages(int pages){
        int printedPages = duplex ? ((pages / 2) + (pages % 2)) : pages;

        tonerLevel -= printedPages;
        pagesPrinted += printedPages;

        System.out.println("Number of pages printed: " + printedPages);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
