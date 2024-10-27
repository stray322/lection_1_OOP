package lection_3;

public abstract class Employee<T1,T2> {
   protected static int countEmp = 0;
   private String fio;
   private String gender;
   private int age;
   private int department;//номер цеха

   protected Employee(T1 _fio, T1 _gender, T2 _age, T2 _department){
       setAttribute(_fio,_gender,_age,_department);
   }

    private void setAttribute(T1 _fio, T1 _gender, T2 _age, T2 _department ) {
        this.fio = (String)_fio;
        this.gender = (String)_gender;
        this.age = (Integer)_age;
        this.department = (Integer)_department;
    }
    protected T1 getAtrEmp(){
        T1 inf = (T1)("ФИО: "+fio + "\nПол: " + gender + "\nВозраст: " + age + "\nНомер цеха: " + department);
        return inf;
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
