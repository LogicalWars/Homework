public class Atm {
    int currentMoney = 0;
    public static final int MAX_GET_MONEY = 10_000;
    public static final int MAX_MONEY = 100_000;
    int countOperation = 0;

    public Atm(int currentMoney) {
        if (currentMoney < MAX_MONEY) {
            this.currentMoney = currentMoney;
        }
    }

    public int getMoney(int money) {
        if (money < MAX_GET_MONEY && money < currentMoney) {
            this.currentMoney -= money;
            countOperation++;
            return money;
        } else {
            countOperation++;
            return 0;
        }
    }

    public int putMoney(int money) {
        if (money + this.currentMoney > MAX_MONEY) {
            countOperation++;
            return money;
        }
        this.currentMoney += money;
        countOperation++;
        return 0;
    }
}
