package AgencyPattern.StaticProxy;

public class Main {
    public static void main(String[] args) {
        Book a = new TakeBookProxy("Effective Java");
        a.findBook();
        //找过一次书，下次就不用在找书了，直接拿就可以了
        System.out.println("");
        a.findBook();
    }
}
