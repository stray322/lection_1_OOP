package lection_1;

import java.util.Random;

public class Michanic extends Employee implements ILunch{

    private int skill;//разряднсть
    private int area;//номер участка
    private boolean admission;//наличие допуска

    public Michanic(String _fio, String _gender, int _age, int _department, int skill,int area,boolean admission){
        super(_fio, _gender, _age, _department);
        setMich(skill, area, admission);
        Employee.countEmp++;
    }
    private void setMich(int _skill, int _area, boolean _admission ) {
        this.skill = _skill;
        this.area = _area;
        this.admission = _admission;
    }

    protected void getMich() {
        getAtrEmp();
        System.out.println("Разрядность: "+ skill + "\nНомер участка: " + area + "\nДопуск: " + admission);
    }

    @Override
    public void startLunch(String time) {
        if(time == "11:30") {
            System.out.println("Начало обеда рабочих.");
        }
        else{
            System.out.println("Время работать.");
        }
    }

    @Override
    public void relaxation(boolean golod) {
        if(golod){
            getFio();
            System.out.println(" пошел обедать.");
        }
        else{
            getFio();
            System.out.println(" пошел играть в теннис.");
        }
    }
    @Override
    public void checkpoint(String time) {
        if(time == "07:30")
        {
            System.out.print("Рабочий день у ");
            getFio();
            System.out.println(" начался.");
        }
        else if(time == "16:30")
        {
            System.out.print("Рабочий день у ");
            getFio();
            System.out.println(" закончился.");
        }
    }
    public void work(boolean norma){
        if(norma){
            System.out.println("Норма выполнена, сегодня отдыхаем.");
        }
        else{
            try {
                goWork();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void goWork() throws InterruptedException {
        int[] stanok = new int[]{10, 8, 13, 5, 18, 3, 26, 7, 12, 19};
        Random index = new Random();
        int indexStanok = index.nextInt(stanok.length);
        System.out.println("Нужно изготовить " + stanok[indexStanok] + " деталей.");
        for(int i = 1; i <= stanok[indexStanok]; i++){
            System.out.println("Деталь изготавливается ...");
            Thread.sleep(100);
            System.out.println("Деталь " + i + " изготовлена");
        }
    }
}