package lection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chief extends Employee implements IConference{
    private int plan;//норма изготовления деталей цеха
    private int experience;//стаж руководства
    private int countSub;//количетво подченненых
    private boolean severity;//строгость управления

    public Chief(String _fio, String _gender, int _age, int _department, int plan, int experience, int countSub, boolean severity){
        super(_fio, _gender, _age, _department);
        this.plan = plan;
        this.experience = experience;
        this.countSub = countSub;
        this.severity = severity;
        Employee.countEmp++;
    }

    private void setChief(int _plan, int _experience, int _countSub, boolean _severity ) {
        this.plan = _plan;
        this.experience = _experience;
        this.countSub = _countSub;
        this.severity = _severity;
    }

    protected void getChief() {
        getAtrEmp();
        System.out.println("Норма изготовления деталей цеха: "+ plan + "\nСтаж руководства: " + experience + "\nКоличество подчененных: " + countSub + "\nСтрогость управления: " + severity);
    }

    @Override
    public void startConference(String time) {
        if(time.equals("13:00")){
            System.out.println("Совещание началось.");
        }
        else{
            System.out.println("Ещё не время.");
        }
    }

    @Override
    public void createTopic(String topic) {
        System.out.println("Тема совещания: " + topic);
    }

    @Override
    public void checkpoint(String time) {
        if(time.equals("08:00"))
        {
            System.out.print("Рабочий день у ");
            getFio();
            System.out.println(" начался.");
        }
        else if(time.equals("17:00"))
        {
            System.out.print("Рабочий день у ");
            getFio();
            System.out.println(" закончился.");
        }
    }

    public void goReport() {
        List<String[]> spisok = new ArrayList<>();
        spisok.add(new String[]{"Отчет о браке", "13"});
        spisok.add(new String[]{"Успехи сотрудников", "9"});
        spisok.add(new String[]{"Выполнение нормы цеха", "15"});
        spisok.add(new String[]{"Лучший сотрудник месяца", "8"});
        Random index = new Random();
        int indexSpisok = index.nextInt(spisok.size());
        int k = 1 ;
        System.out.println(spisok.get(indexSpisok)[0]);
do {
    System.out.println("Написана страница :" + k);
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    k++;
}while (k<=Integer.parseInt(spisok.get(indexSpisok)[1]));
        System.out.println("Отчет завершен.");
    }
}