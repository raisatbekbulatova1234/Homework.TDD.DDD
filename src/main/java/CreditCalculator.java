public class CreditCalculator {
    public int sumPerMonth(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, period))/((Math.pow(1 + monthRate, period)) -1);
        return (int) (sum*annuityRate);
    }

    public int fullSumReturn(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, period))/((Math.pow(1 + monthRate, period)) -1);
        return (int) ((sum*annuityRate) * period);
    }

    public int overPaySum(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, period))/((Math.pow(1 + monthRate, period)) -1);
        return (int) ((sum*annuityRate)*period - sum);
    }

    public static void main(String[] args) {
        int sum = 1_500_000;
        double rate = 10.4;
        int period = 12;

        CreditCalculator calculator = new CreditCalculator();

        System.out.println("Ежемесячный платеж равен " + calculator.sumPerMonth(sum, rate, period));
        System.out.println("Общая сумма к возврату в банк равна " + calculator.fullSumReturn(sum, rate, period));
        System.out.println("Переплата за весь период равна " + calculator.overPaySum(sum, rate, period));
    }
}