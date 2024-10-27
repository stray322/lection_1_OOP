package lection_3;

public class Main {
    public static void main(String[] args) {
        //ПУНКТ1
        Chief Nach = new Chief("Казаков Павел Александрович","муж",37,1000,10,7,10,false);
        Nach.getChief();
        Nach.checkpoint("08:00");
        Nach.startConference("13:00");
        Nach.createTopic("итоги квартала");
        Nach.goReport();
        Nach.checkpoint("17:00");
        Michanic Mich = new Michanic("Петров Михаил Владимирович","муж",31,1000,2,224,true);
        Mich.getMich();
        Mich.checkpoint("07:30");
        Mich.startLunch("11:30");
        Mich.relaxation(false);
        Mich.work(false);
        Mich.checkpoint("16:30");
        Employee.getCountEmp();
        //ПУНКТ2
        Check13 isCheck = number -> number % 13 == 0;
        System.out.println("Делится ли число 39 на 13? " + isCheck.check(26));
        //ПУНКТ3
        Discriminant discriminant = (a, b, c) -> b * b - 4 * a * c;
        System.out.println("Дискриминант от 2x^2 + 3x - 5 = " + discriminant.calculate(2, 3, -5));
    }
}