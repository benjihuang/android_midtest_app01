package tw.edu.ntut.csie.app01_105590024;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
    public String grade(int score){
        if(score > 100) return "輸入分數應該介於[0..100]";
        else if(score>=90 && score <=100) return "A";
        else if(score>=80 && score <=89) return "B";
        else if(score>=70 && score <=79) return "C";
        else if(score>=60 && score <=69) return "D";
        else if(score>=0 && score <=59) return "F";
        else if(score < 0) return "輸入分數應該介於[0..100]";
        return null;
    }
}