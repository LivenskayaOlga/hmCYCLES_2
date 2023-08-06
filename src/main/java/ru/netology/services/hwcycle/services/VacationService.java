package ru.netology.services.hwcycle.services;

public class VacationService {

    public int calcVacation(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money < threshold) {//работа

                money = money + income - expenses;
            } else {                               //отдых
                money = money - expenses - (2 * (money - expenses) / 3);
                count++;
            }
        }
        return count;
    }

}
