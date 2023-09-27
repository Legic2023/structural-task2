public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        String a = "10"; // 2
        String b = "11"; // 3

        System.out.printf("Сумма двух бинарных чисел: %s + %s = %s %n", a, b, bins.sum(a, b)); // 2 + 3 = 5
        System.out.printf("Произведение двух бинарных чисел: %s * %s = %s %n", a, b, bins.mult(a, b)); // 2 * 3 = 6
    }
}