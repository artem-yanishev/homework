public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper = paper + 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = (int) (frog / 3.5);
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса "+totalWeight);
        var differenceWeight = boxer2 - boxer1;
        System.out.println("Разница в массе "+differenceWeight);
        var remainderOfDivision = (boxer2 % boxer1);
        System.out.println(remainderOfDivision);
        var totalTime  = 640;
        var time = 8;
        var totalEmployees = totalTime / time;
        System.out.println("Всего работников в компании - " +totalEmployees+ " человек");
        totalTime = time * (totalEmployees + 94);
        System.out.println("Если в кампании работает на 94 человека больше, чем раньше, то всего " +totalTime+ " часов работы может быть поделено между сотрудниками.");

    }
}