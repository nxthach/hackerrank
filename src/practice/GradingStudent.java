package practice;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {


    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(44);
        grades.add(84);
        grades.add(94);
        grades.add(21);
        grades.add(0);
        grades.add(18);
        grades.add(100);
        grades.add(18);
        grades.add(62);
        grades.add(30);
        grades.add(61);
        grades.add(53);
        grades.add(0);
        grades.add(43);
        grades.add(2);
        grades.add(29);
        grades.add(53);
        grades.add(61);
        grades.add(40);
        grades.add(14);
        grades.add(4);
        grades.add(29);
        grades.add(98);
        grades.add(37);
        grades.add(23);
        grades.add(46);
        grades.add(9);
        grades.add(79);
        grades.add(62);
        grades.add(20);
        grades.add(38);
        grades.add(51);
        grades.add(99);
        grades.add(59);
        grades.add(47);
        grades.add(4);
        grades.add(86);
        grades.add(61);
        grades.add(68);
        grades.add(17);
        grades.add(45);
        grades.add(6);
        grades.add(1);
        grades.add(95);
        grades.add(95);

        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradesRounded = new ArrayList<>();

        for(Integer grade : grades) {
            if(grade < 38){
                gradesRounded.add(grade);
            }else{
                if(grade%5 != 0){
                    int times = grade/5;
                    int gradeCanRound = (times + 1)* 5;

                    if(gradeCanRound - grade < 3){
                        gradesRounded.add(gradeCanRound);
                    } else {
                        gradesRounded.add(grade);
                    }
                } else {
                    gradesRounded.add(grade);
                }
            }
        }

        return gradesRounded;
    }

}
