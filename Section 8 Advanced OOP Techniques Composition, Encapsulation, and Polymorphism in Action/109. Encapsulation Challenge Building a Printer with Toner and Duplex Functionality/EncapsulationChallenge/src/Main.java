//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(60, true);

        System.out.println(printer.getTonerLevel());
        printer.printPages(13);
        System.out.println(printer.getTonerLevel());
        printer.addToner(30);
    }
}