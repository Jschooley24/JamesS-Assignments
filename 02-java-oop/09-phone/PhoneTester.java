public class PhoneTester{
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy ("S9",99,"Verizon","Ring Ring Ring");
        IPhone iPhoneTen = new IPhone("X", 100, "AT&T", "Zing");
        System.out.println(s9.unlock());
        s9.displayInfo();
    }
}
