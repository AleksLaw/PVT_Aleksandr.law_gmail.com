package Homework23;

import java.util.Scanner;

public class Bankomat {
    private int $20 = 100;
    private int $50 = 100;
    private int $100 = 100;

    private Scanner scanner = new Scanner(System.in);


    private int get$20() {
        return $20;
    }

    public void set$20(int $20) {
        this.$20 = $20;
    }

    private int get$50() {
        return $50;
    }

    public void set$50(int $50) {
        this.$50 = $50;
    }

    private int get$100() {
        return $100;
    }

    public void set$100(int $100) {
        this.$100 = $100;
    }

    public void add$20() { //Добавить 20
        int a=readInteger(scanner,"Введите число номиналом $20 для добавления в банкомат");
            System.out.println("Добавлено " + a + " купюр $20");
             $20 = $20 + a;
    }

    public void add$50() { //Добавить 50
        int a=readInteger(scanner,"Введите число номиналом $50 для добавления в банкомат");
        System.out.println("Добавлено " + a + " купюр $50");
         $50 = $50 + a;
    }

    public void add$100() { //Добавить 100
        int a=readInteger(scanner,"Введите число номиналом $100 для добавления в банкомат");
        System.out.println("Добавлено " + a + " купюр $100");
        $100 = $100 + a;
    }


    public   int getTotalSumm() { // сумма денег в банкомате
        //  System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
        return (this.$20 * 20 + this.$50 * 50 + this.$100 * 100);
    }


//    public boolean getMoneyYesNo(int sum) { //Вывод можно или нельзя
//        boolean yesNo=true;
//        if ((count100 * 100 + count50 * 50 + count20 * 20) > 0) {
//            //   System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
//            System.out.println("Итого выдано: " + (count20 * 20 + count50 * 50 + count100 * 100) + " денег");
//            System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
//        } else
//            System.out.println("Данную сумму выдать нельзя " + "Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
//        return yesNo;
//    }


    public void getMoney(int summa) { //получение денег

        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        boolean one50 = true;


        if (summa <= getTotalSumm() && summa > 0) {
            if (((summa % 100 == 0 && (getTotalSumm() - 100) >= 0 && summa <= getTotalSumm()))) {
                while (summa >= 100 && get$100() != 0) {
                    summa = summa - 100;
                    count100 = count100 + 1;
                    $100 = $100 - 1;
                }
            }

            if (summa % 100 == 30 && (summa > 100 && get$50() == 1 && get$20() >= 2 && one50 == true)) {

                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;

            } else if (get$20() >= 4 && summa <= getTotalSumm() && get$50() > 0 && (summa - 80) <= get$50() * 50 && summa % 100 == 30 && summa != 30) {
                while (summa != 80 || summa == 0) {
                    summa = summa - 50;
                    count50 = count50 + 1;
                    $50 = $50 - 1;
                }
            }
            if (summa % 100 == 10 && (summa > 100 && get$50() == 1 && get$20() >= 3 && one50 == true)) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;
            } else if (get$20() >= 3 && summa <= getTotalSumm() && get$50() > 0 && (summa - 60) <= get$50() * 50 && summa % 100 == 10 && summa != 10) {
                while (summa != 60 || summa == 0) {
                    summa = summa - 50;
                    count50 = count50 + 1;
                    $50 = $50 - 1;
                }
            }
            if (summa % 100 == 90 && get$50() == 1 && get$20() >= 2 && one50 == true) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;
            } else if (get$20() >= 2 && summa <= getTotalSumm() && get$50() > 0 && (summa - 40) <= get$50() * 50 && summa % 100 == 90) {
                while (summa != 40 || summa == 0) {
                    summa = summa - 50;
                    count50 = count50 + 1;
                    $50 = $50 - 1;
                }
            }
            if (summa % 100 == 70 && get$50() == 1 && get$20() >= 1 && one50 == true) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;
            } else if (get$20() >= 1 && summa <= getTotalSumm() && get$50() > 0 && (summa - 20) <= get$50() * 50 && summa % 100 == 70) {
                while (summa != 20 || summa == 0) {
                    summa = summa - 50;
                    count50 = count50 + 1;
                    $50 = $50 - 1;
                }
            }
            if ((summa % 100 == 50 && (summa >= 50 && get$50() >= 1 && one50 == true))) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;
            }
            if ((summa == 50 && get$50() >= 1 && one50 == true)) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
                one50 = false;
                System.out.println("$100 выдано" + count100 + " шт. " + "$50 выдано" + count50 + " шт. " + "$20 выдано" + count20 + " шт. " + "Итого выдано: " + (count100 * 100 + count50 * 50 + count20 * 20) + " денег");
            }


            if (((summa == 100) && get$50() >= 2)) {
                summa = summa - 100;
                count50 = count50 + 2;
                $50 = $50 - 2;

            }
            one50 = true;

            if ((summa % 100 == 80 && summa > 80 && get$20() >= 4)) {
                summa = summa - 80;
                count20 = count20 + 4;
                $20 = $20 - 4;
            }
            if ((summa % 100 == 60 && summa > 60 && get$20() >= 3)) {
                summa = summa - 60;
                count20 = count20 + 3;
                $20 = $20 - 3;
            }
            if ((summa % 100 == 40 && summa > 40 && get$20() >= 2)) {
                summa = summa - 40;
                count20 = count20 + 2;
                $20 = $20 - 2;
            }
            if ((summa % 100 == 20 && summa > 20 && get$20() >= 1)) {
                summa = summa - 20;
                count20 = count20 + 1;
                $20 = $20 - 1;

            }
            if ((summa == 80 && summa >= 80 && (get$20() >= 4 && (getTotalSumm() - 80) >= 0))) {
                summa = summa - 80;
                count20 = count20 + 4;
                $20 = $20 - 4;
                System.out.println("$20 выдано " + count20 + " шт. " + "$50 выдано " + count50 + " шт. " + "$100 выдано " + count100 + " шт. ");
            }
            if ((summa == 60 && summa >= 60 && (get$20() >= 3 && (getTotalSumm() - 60) >= 0))) {
                summa = summa - 60;
                count20 = count20 + 3;
                $20 = $20 - 3;

                System.out.println("$20 выдано " + count20 + " шт. " + "$50 выдано " + count50 + " шт. " + "$100 выдано " + count100 + " шт. ");

                if ((summa % 100 == 0 && (getTotalSumm() - 100) >= 0 && summa <= getTotalSumm() && summa > 0)) {
                    while (((summa >= 0 && get$50() > 0 && summa % 100 == 0))) {
                        summa = summa - 100;
                        count50 = count50 + 2;
                        $50 = $50 - 2;
                    }
                }
            }
            if ((summa == 40 && summa >= 40 && (get$20() >= 2 && (getTotalSumm() - 40) >= 0))) {
                summa = summa - 40;
                count20 = count20 + 2;
                $20 = $20 - 2;
                System.out.println("$20 выдано " + count20 + " шт. " + "$50 выдано " + count50 + " шт. " + "$100 выдано " + count100 + " шт. ");

            }
            if ((summa == 20 && summa >= 20 && (get$20() >= 1 && (getTotalSumm() - 20) >= 0))) {
                summa = summa - 20;
                count20 = count20 + 1;
                $20 = $20 - 1;
                System.out.println("$20 выдано " + count20 + " шт. " + "$50 выдано " + count50 + " шт. " + "$100 выдано " + count100 + " шт. ");

            }
            if (((summa % 100 == 0 && (getTotalSumm() - 100) >= 0 && summa <= getTotalSumm()))) {
                while (summa >= 100 && get$100() != 0) {
                    summa = summa - 100;
                    count100 = count100 + 1;
                    $100 = $100 - 1;
                }
            }

            if ((summa % 100 == 0 && (getTotalSumm() - 100) >= 0 && summa <= getTotalSumm() && summa > 0)) {
                while (((summa != 0 && get$50() >= 2 && summa % 100 == 0))) {
                    summa = summa - 100;
                    count50 = count50 + 2;
                    $50 = $50 - 2;
                }
            }


            if ((summa - 20) >= 0 && summa <= getTotalSumm() && summa != 30 && get$20() > 0 && (summa % 100 / 10) % 2 == 0 && (summa <= get$20() * 20)) {
                while (summa != 0 && get$20() >= 0) {
                    summa = summa - 20;
                    count20 = count20 + 1;
                    $20 = $20 - 1;
                }
            }
        }


        if ((count100 * 100 + count50 * 50 + count20 * 20) > 0) {
            //   System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
            System.out.println("Итого выдано: " + (count20 * 20 + count50 * 50 + count100 * 100) + " денег");
            System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
        } else
            System.out.println("Данную сумму выдать нельзя " + "Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));


    }

    public Bankomat(int $20, int $50, int $100) {
        this.$20 = $20;
        this.$50 = $50;
        this.$100 = $100;
    }





    private static int readInteger(Scanner scanner, String message) {
        int a = 0;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a <= 0) {
                System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
                return a;
            }

        } while (true);
    }
}
