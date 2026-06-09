
public class Main {
    public static void main(String[] args) {

        int result1 = calculator((a, b) -> a+b, 7, 2);

        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);

        var result3 = calculator(
                (a, b) -> a + " " + b,
                "Test", "Testing");
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}