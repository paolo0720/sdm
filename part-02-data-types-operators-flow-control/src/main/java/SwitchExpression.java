void main() {
    boolean leapYear = true;
    int days = 0;
    for (int month = 1; month <= 12; month++) {
        days += switch (month) {
            case 2:
                yield leapYear ? 29 : 28;
            case 4, 6, 9, 11:
                yield 30;
            default:
                yield 31;
        };
    }
    IO.println(days);
}

