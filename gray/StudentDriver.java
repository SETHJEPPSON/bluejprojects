
/**
 * Write a description of class StudentDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentDriver
{
    public static void main(){
        Student[] StudentF = new Student [7];

        Student[] StudentM = new Student[7];

        String[] OlderName= new String[7];

        StudentF[0] = new Student (12, "Sandra");
        StudentF[1] = new Student (12, "Sandra");
        StudentF[2] = new Student (12, "Sandra");
        StudentF[3] = new Student (12, "Sandra");
        StudentF[4] = new Student (12, "Sandra");
        StudentF[5] = null;
        StudentF[6] = null;

        StudentM[0] = new Student (12, "Seth");
        StudentM[1] = new Student (12, "Seth");
        StudentM[2] = new Student (12, "Seth");
        StudentM[3] = new Student (12, "Seth");
        StudentM[4] = null;
        StudentM[5] = new Student (12, "Seth");
        StudentM[6] = null;

        for(int i=0; i < StudentF.length; i++){
            if (StudentF[i] == null || StudentM[i] == null){
                if(StudentF[i] == null && StudentF[i] == null){
                    OlderName[i] = "Space for Rent";
                }
                else if(StudentM[i] == null){
                    OlderName[i] = StudentF[i].getName();
                }
                else if(StudentF[i] == null) {
                    OlderName[i] = StudentM[i].getName();
                }
            }

            else{
                if (StudentF[i].getGrade() > StudentM[i].getGrade()){
                    OlderName[i] = StudentF[i].getName();
                }
                else if (StudentF[i].getGrade() < StudentM[i].getGrade()){
                    OlderName[i] = StudentM[i].getName();
                }
                else{
                    int rand = (int)(Math.random() * 2);
                    if(rand ==1){
                        OlderName[i] = StudentM[i].getName();
                    }
                    else{
                        OlderName[i] = StudentF[i].getName();
                    }
                }
            }

        }

        System.out.println("Female Name+ \t Grade \t\t Male Name \t Grade \t\t Older Student" );

        for (int i =0; i < StudentF.length; i++){
            if(StudentF[i] == null || StudentM[i] == null){
                if(StudentF[i] == null && StudentM[i] == null){
                    System.out.println(StudentF[i] + "\t\t " + StudentF[i] + "\t\t " + StudentM[i] + "\t\t " + StudentM[i] + "\t\t" + OlderName[i]);
                }
                else if(StudentF[i] == null){
                    System.out.println(StudentF[i] + "\t\t " + StudentF[i] + "\t\t " + StudentM[i].getName() + "\t\t " + StudentM[i].getGrade() + "\t\t" + OlderName[i]);
                }
                else if(StudentM[i] == null){
                    System.out.println(StudentF[i].getName() + "\t\t " + StudentF[i].getGrade() + "\t\t " + StudentM[i] + "\t\t " + StudentM[i] + "\t\t" + OlderName[i]);
                }
            }
            else{
                System.out.println(StudentF[i].getName() + "\t\t " + StudentF[i].getGrade() + "\t\t " + StudentM[i].getName() + "\t\t " + StudentM[i].getGrade() + "\t\t" + OlderName[i]);
            }
        }
    }
}
