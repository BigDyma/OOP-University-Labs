class Main {
    public static void compareMonitors(Monitor first, Monitor second){
        if (first.getDimension().a > second.getDimension().a && first.getResolution().x > second.getResolution().x)
        {
            System.out.println("after comparision our experts say that first monitor is good but second  maybe is good too!");
        }
        else if (first.getDimension().a == second.getDimension().a && first.getResolution().x == second.getResolution().x)
        {
            System.out.println("They're almost the same!");
        }
        else {
            System.out.println("after comparision our experts say that second monitor is good but first  maybe is good too!");
    }
    }
public static void main(String[] args) {

    // part 1
    Monitor hpmonitor = new Monitor(1080, 720, 100, 200, "black");
    Monitor apple = new Monitor(2080, 1080, 3450, 4500, "white");
    apple.updateColor("moreblack");
    hpmonitor.updateColor("whiter");
    compareMonitors(hpmonitor, apple);
    hpmonitor.updateDimension(1071, 729);
    apple.updateResolution(1071, 729);
    hpmonitor.updateResolution(1071, 729);
    apple.updateDimension(1071, 729);
    compareMonitors(hpmonitor, apple);
    // end part with moniors

    // part with Universities

    // University Declaration
    University Cambridge = new University(1750, "Cambridge");
    University UTM = new University(1850, "Universitatea Tehnica a Moldovei");
    University ULIM = new University(2002, "Universitatea celor care n-au intrat la UTM");

    //Students enrolling
    Cambridge.setStudent(new Student("Igor Dodon", 44, 3));
    Cambridge.setStudent(new Student("Maia Sandu", 44, 3.5));
    Cambridge.setStudent(new Student("Vladimir Voronin", 102, 0.2));
    Cambridge.setStudent(new Student("Vladimir Putin", 44, 3.1));

    UTM.setStudent(new Student("Elon Musk", 45, 10));
    UTM.setStudent(new Student("Nikola Tesla", 45, 10));
    UTM.setStudent(new Student("Viorel Bostan", 45, 10));
    UTM.setStudent(new Student("Alan Turing", 45, 10));

    ULIM.setStudent(new Student("Alexandr Lukashenko", 45, 3));
    ULIM.setStudent(new Student("Maria Biesu", 45, 3));
    ULIM.setStudent(new Student("Anilop Colocan", 45, 3));

    double average = Cambridge.getAverageMark() + UTM.getAverageMark() + ULIM.getAverageMark();

     System.out.println(average/3);
    }
}