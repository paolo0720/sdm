public class ReferentialInequality {
    public static void main(String[] args) {
        Television tv1 = new Television("LG987");
        Television tv2 = new Television("LG987");
        if (tv1 == tv2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
