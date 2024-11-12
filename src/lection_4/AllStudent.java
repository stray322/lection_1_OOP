package lection_4;

import java.util.List;

public class AllStudent {

   public List<Student> delNeud(List<Student> allSt)
   {
       for (int i =0;i<allSt.size();i++)
       {
          if (getSred(allSt.get(i)))//если оценки меньше 3 то удаляем
          {
              allSt.remove(i);
              i--;
          }
          else
          {
              allSt.get(i).curs = allSt.get(i).curs + 1;
          }
       }
       return allSt;
   }
   private boolean getSred(Student s)
   {

       int sum = 0;
       int count = 0;
      for (int i : s.score)
      {
          sum = sum + i;
          count++;
      }
      if(count!= 0) {
          double res = sum / count;

          if (res < 3) {
              boolean b = true;
              return b;
          } else {
              return false;
          }
      }
      else
      {
          return false;
      }
   }
   public void printStudents(List<Student> students,int course)
   {
       for (Student s : students)
       {
           if (s.curs == course)
           {
               System.out.println(s.name);
           }
       }
   }
}
