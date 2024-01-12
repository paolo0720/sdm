public class Switch {
    public static void main(String[] args) {
        boolean leapYear = true;
        int days = 0;
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 2:
                    days += leapYear ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                default:
                    days += 31;
                    break;
            }
        }
        System.out.println(days);
    }
}

