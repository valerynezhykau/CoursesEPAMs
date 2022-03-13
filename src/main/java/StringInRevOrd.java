public class StringInRevOrd {
        public static void main(String[] args) {
            String str = "абвгдеёжзи";
            String reverse = new StringBuffer(str).reverse().toString();
            System.out.println("Строка до реверса: " + str);
            System.out.println("Строка в обратном порядке, после реверса: " + reverse);
        }
    }
}
