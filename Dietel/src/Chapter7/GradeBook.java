package Chapter7;

public class GradeBook {
    int [] grades = new int[10];
    int courseName;
    int average;

    public GradeBook(int [] grades, int courseName, int average){
        this.grades = grades;
        this.courseName = courseName;
        this.average = average;
    }

    public int[] getGrades (){
        return grades;
    }
    public int getCourseName(){
        return courseName;
    }
    public void average(){
        int total=0;
        for(int i = 0; i<grades.length; i++){
            total+= grades[i];

             average = total/ grades.length;

        }
    }
    public int getAverage(){
        return average;
    }

}
