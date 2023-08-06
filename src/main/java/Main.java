import ru.netology.services.hwcycle.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println(service.calcVacation(10_000, 3_000, 20_000));
        System.out.println(service.calcVacation(100_000, 60_000, 150_000));

        //int count = 0;
        //float money = 0F;
        //int threshold = 20_000;
        //int expenses = 3_000;
        //int income = 10_000;
        // for (int month = 1; month < 12; month++) {
        //   if (money < threshold) {//работа

        //       money = money + income-expenses;
        //  } else {                               //отдых
        //      money = money - expenses-(2*(money-expenses)/3);
        //      count++;
        // }
        //System.out.println("Месяц " + month + " Остаток денег " +Math.floor(money));

    }
    //System.out.println(count);

    //}
}
