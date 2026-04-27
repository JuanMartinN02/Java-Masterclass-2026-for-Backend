//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            Student s = new Student("S2026"+i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        case 5 -> "Jhon";
                        default -> "Anonymous";
                    },
                    "01/01/2026",
                    "Java Masterclass");
            System.out.println(s);
        };

        System.out.println("");

        //Using record (it's unmutable / doesnt have set)
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S2026"+i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        case 5 -> "Jhon";
                        default -> "Anonymous";
                    },
                    "01/01/2026",
                    "Java Masterclass");
            System.out.println(s);
        };



        }
    }
