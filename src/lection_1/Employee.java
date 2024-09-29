package lection_1;

public abstract class Employee {
   protected static int countEmp = 0;
   private String fio;
   private String gender;
   private int age;
   private int department;//номер цеха

   protected Employee(String _fio, String _gender, int _age, int _department){
       setAttribute(_fio, _gender, _age, _department);
   }

    private void setAttribute(String _fio, String _gender, int _age, int _department ) {
        this.fio = _fio;
        this.gender = _gender;
        this.age = _age;
        this.department = _department;
    }
    protected void getAtrEmp(){
       System.out.println("ФИО: "+fio + "\nПол: " + gender + "\nВозраст: " + age + "\nНомер цеха: " + department);
    }
    protected void getFio()
    {
        System.out.print(fio);
    }
    public static void getCountEmp(){
       System.out.println("Количество сотрудников: " + countEmp);
   }

   public abstract void checkpoint(String time);
}
