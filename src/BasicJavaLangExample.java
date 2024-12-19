public class BasicJavaLangExample {
    public static void main(String[] args) {
        // 使用 String 類別
        String greeting = "Hello, Java!";
        System.out.println("Greeting: " + greeting);

        // 使用 Math 類別
        double number = -25.5;
        double absoluteValue = Math.abs(number);
        double squareRoot = Math.sqrt(Math.abs(number)); // 絕對值後取平方根
        System.out.println("Number: " + number);
        System.out.println("Absolute Value: " + absoluteValue);
        System.out.println("Square Root: " + squareRoot);

        // 使用 Object 類別
        Object object = new Object();
        System.out.println("Object HashCode: " + object.hashCode());
        System.out.println("Object toString: " + object.toString());

        // 使用 System 類別
        System.out.println("Current Time in Milliseconds: " + System.currentTimeMillis());

        // 使用 Wrapper 類別 (如 Integer, Double)
        Integer intValue = Integer.valueOf(42);
        Double doubleValue = Double.valueOf(42.42);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        // 簡單的 Exception 處理
        try {
            int result = 10 / 0; // 故意製造錯誤
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
