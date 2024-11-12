package lection_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    protected String name;
    protected String grup;
    protected int curs;
    protected List<Integer> score = new ArrayList<>();
    public Student(String _name, String _grup, int _curs)
    {
        setAtrStud(_name, _grup, _curs);
    }
    public void setAtrStud(String _name, String _grup, int _curs) {
        this.name = _name;
        this.grup = _grup;
        this.curs = _curs;

    }
    public void addScore(int ball)
    {
        this.score.add(ball);
    }
    protected void getAtrStud()
    {
        System.out.println("Имя: "+ name + "\nГруппа: " + grup + "\nКурс: " + curs);
        System.out.print("Оценки: ");
        for(Integer ball: score)
        {
            System.out.print(ball);
        }
        System.out.print("\n");
    }
}