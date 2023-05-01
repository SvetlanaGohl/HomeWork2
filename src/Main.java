public class Main {
    public static void main(String[] args) {

        //задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;

        //задача 2
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(" Общий вес боксеров " + " - " + totalWeight + " кг ");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(" Разница в весе между боксерами " + weightDifference + " кг ");

        //задача 7
        var totalWeight1 = weightBoxer2 - weightBoxer1;
        System.out.println(" 1 " + " Разница в весе бойцов " + totalWeight1 + " кг ");
        var totalWeight2 = weightBoxer2 % weightBoxer1;
        System.out.println(" 2 " + " Разница в весе бойцов " + totalWeight2 + " кг ");

        //задача 8
        var totalHoursWork = 640;
        var workerHours = 8;
        var totalWorkers = totalHoursWork / workerHours;
        System.out.println(" 1. Всего работников в компании " + totalWorkers + " человек ");
        totalWorkers = totalWorkers + 94;
        var totalHoursWork1 = totalWorkers * workerHours;
        System.out.println(" 2. Если в компании работает " + totalWorkers + " человека, то всего " + totalHoursWork1 + " часа работы может быть поделено между сотрудниками ");
    }
}
