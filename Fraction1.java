public class exercise7 {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(1, 2);
    f1.output();
    System.out.printf("%.2f%%\n", f1.convert());
    f1.set_top(2);
    f1.output();
    System.out.printf("%.2f%%\n", f1.convert());
    f1.set_bottom(3);
    f1.output();
    System.out.printf("%.2f%%\n", f1.convert());
  }
}
