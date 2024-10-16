package lection_1;

public class Main {
    public static void main(String[] args) {

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


    }
}
