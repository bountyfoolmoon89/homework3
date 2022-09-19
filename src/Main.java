public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        //Задача 4
        System.out.println("Задача 4");
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        System.out.println("Задача 6");
        var weightFirstMan = 78.2;
        var weightSecondMan = 82.7;
        var commonWeight = weightFirstMan + weightSecondMan;
        System.out.println("Общий вес спортсменов " + commonWeight + "кг");
        //Задача 7
        System.out.println("Задача 7");
        //Вычитание
        var differenceWeight = weightSecondMan - weightFirstMan;
        System.out.println("Разница в весе спортсменов " + differenceWeight + "кг");
        //Деление с остатком
        var differenceWeight1 = weightSecondMan % weightFirstMan;
        System.out.println("Разница в весе спортсменов " + differenceWeight1 + "кг");
        //Задача 8
        System.out.println("Задача 8");
        var commonHours = 640;
        var personHours = 8;
        var workersAmount = commonHours / personHours;
        System.out.println("Кол-во работников составляет " + workersAmount + " человек");
        workersAmount = workersAmount + 94;
        var personHours1 = commonHours / workersAmount;
        System.out.println("Если в компании работает " + workersAmount + " человек, то всего " + personHours1 + " часов работы может быть поделено между сотрудниками");

    }
}