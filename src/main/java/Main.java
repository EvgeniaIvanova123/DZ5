

public class Main {
    public static void main(String[] args) {
       BonusService service = new BonusService();
        int price = 10_000;
        long milesLong = service.calculate(price, true);
        int miles = (int) milesLong;
        System.out.println(miles);
    }
}