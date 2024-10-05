public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(57_000);
        System.out.println(atm.putMoney(20_000));
        System.out.println(atm.putMoney(100_000));
        System.out.println(atm.getMoney(500));
        System.out.println(atm.getMoney(200_000));

    }
}