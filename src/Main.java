public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int peace = 8;
        System.out.println("Значение переменной peace с типом int равно " + peace);
        byte cat = 16;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short mouse = 1775;
        System.out.println("Значение переменной mouse с типом short равно " + mouse);
        long pig = 12223334;
        System.out.println("Значение переменной prince с типом long равно " + pig);
        float pineapple = 3.7f;
        System.out.println("Значение переменной pineapple с типом float равно " + pineapple);
        double apple = 198;
        System.out.println("Значение переменной appke с типом double равно " + apple );
        //Задание 2
        System.out.println("Задание 2");
        float one = 27.12f;
        System.out.println(one);
        long pen = 987_678_965_549L;
        System.out.println(pen);
        double friend = 2786;
        System.out.println(friend);
        boolean answer = false;
        System.out.println(answer);
        char message = 569;
        System.out.println(message);
        short piece = - 159;
        System.out.println(piece);
        int rat = 27897;
        System.out.println(rat);
        byte bear = 67;
        System.out.println(bear);
        //Задание 3
        System.out.println("Задание 3");
        short firstClass = 23;
        short secondClass = 27;
        short thirdClass = 30;
        short paperPiece = 480;
        short allStudents = (short) (firstClass + secondClass + thirdClass);
        short oneStudentPaper = (short) (paperPiece / allStudents);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper+"листов бумаги");
        //Задание 4
        System.out.println("Задание 4 ");
        int bottleTwoMinute = 16;
        int minutes = 2;
        int capacityInMinute = bottleTwoMinute / minutes;
int timeInMinutes = 20;
System.out.println("За " + timeInMinutes + " машины произвела бутылок " + (capacityInMinute * timeInMinutes) + " штук ");
int dayMinutes = 24 * 60;
        System.out.println("За " + dayMinutes + " машины произвела бутылок " + (capacityInMinute * dayMinutes) + " штук ");
        int threeDayMinutes = 3 * dayMinutes;
        System.out.println("За " + threeDayMinutes + " машины произвела бутылок " + (capacityInMinute * threeDayMinutes) + " штук ");
        int mounth = 30 * dayMinutes;
        System.out.println("За " + mounth + " машины произвела бутылок " + (capacityInMinute * mounth) + " штук ");
//Задание 5
        System.out.println("Задание 5");
        int allPots = 120;
        int whitePots =2;
        int brownPots = 4;
        int allClasses = allPots / (whitePots+brownPots);
        int allBrownPots = allClasses * brownPots;
        int allWhitePots = allClasses * whitePots;
        System.out.println("В школе, где " + allClasses + " классов, нужно" + allWhitePots + " банок белой краски и " + allBrownPots + " банок коричневой краски");
//Задание 6
        System.out.println("Задание 6");
        int bananas = 5;
        int weightOneBanana = 80;
        int allBananaWieght = bananas * weightOneBanana;
        int millilitresInGram = 105;
        int milkMl = 200;
        int cupOfMilk = milkMl / 100;
        int weightMilk = cupOfMilk * millilitresInGram;
        int oneIceCream = 100;
        int allIceCream = 2 * oneIceCream;
        int eggs = 4;
        int oneEggWeight = 70;
        int allEggsWeight = eggs * oneEggWeight;
        int weightOfBreakfest = allBananaWieght + weightMilk + allIceCream + allEggsWeight;
        System.out.println("Вес спорт-завтрака " + weightOfBreakfest+ " грамм");
        //Задание 7
        System.out.println("Задание 7");
        int lostWeightInKg = 7;
        int oneKgInGram = 1000;
        int lostWeightinGram = lostWeightInKg * oneKgInGram;
        int firstLostWeightinDay = 250;
        int daysLossWeighOne = lostWeightinGram / firstLostWeightinDay;
        int secondLostWeightinDay = 500;
        int daysLossWeighTwo = lostWeightinGram / secondLostWeightinDay;
        int mediumDaysLossWeight = (daysLossWeighOne + daysLossWeighTwo) / 2;
        System.out.println("На похудение в случаи потери "+firstLostWeightinDay + "грамм в день, понадобится "+daysLossWeighOne + " дней");
        System.out.println("На похудение в случаи потери "+ secondLostWeightinDay+ "грамм в день, понадобится "+daysLossWeighTwo + " дней");
        System.out.println("Среднее число дней для похудения:" + mediumDaysLossWeight);
        //Задание 8
        System.out.println("Задание 8");
        int masha = 67760;
        int mashaYear = masha * 12;
        int mashaPercent = masha * 10 / 100;
        int mashaFuture = masha + mashaPercent;
        int mashaNextYear = mashaFuture * 12;
        int mashaDifference = mashaNextYear - mashaYear;
        System.out.println("Маша теперь получает " + mashaFuture + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        int denis = 83690;
        int denisYear = denis * 12;
        int denisPercent = denis * 10 / 100;
        int denisFuture = denis + denisPercent;
        int denisNextYear = denisFuture * 12;
        int denisDifference = denisNextYear - denisYear;
        System.out.println("Денис теперь получает " + denisFuture + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        int cristina = 76230;
        int cristinaYear = cristina * 12;
        int cristinaPercent = cristina * 10 / 100;
        int cristinaFuture = cristina + cristinaPercent;
int cristinaNextYear = cristinaFuture * 12;
int cristinaDifference = cristinaNextYear - cristinaYear;
        System.out.println("Кристина теперь получает " + cristinaFuture + " рублей. Годовой доход вырос на " + cristinaDifference + " рублей");

    }
}