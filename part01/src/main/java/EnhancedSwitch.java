public class EnhancedSwitch {
    public static void main(String[] args) {

        boolean leapYear = true;
        int days = 0;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 2 -> days += leapYear ? 29 : 28;
                case 4, 6, 9, 11 -> days += 30;
                default -> days += 31;
            }
        }
        System.out.println(days);
    }
}

