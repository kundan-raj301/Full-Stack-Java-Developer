import java.util.*;
public class DayScholar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student []arr = new Student[4];
        for(int i = 0; i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            Double d = sc.nextDouble(); sc.nextLine();
            Boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new Student(a, b, c, d, e);

        }

        int cnt = findCountOfDayscholarStudents(arr);
        if(cnt > 0){
            System.out.println(cnt);
        }
        else{
            System.out.println("There are no such dayscholar students");
        }
        Student secondHighestScore = findStudentwithSecondHighestScore(arr);
        if(secondHighestScore != null){
            System.err.println(secondHighestScore.getRollno()+"#"+secondHighestScore.getName()+"#"+secondHighestScore.getScore());
        }
        else{
            System.out.println("There are no student from non day scholar");
        }
    }

    public static int findCountOfDayscholarStudents(Student[] arr){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getScore() > 80 && arr[i].getDayScholar()== true){
                cnt++;
            }
        }

        if(cnt > 0){
            return cnt;
        }
        else{
            return 0;
        }
    }


    public static Student findStudentwithSecondHighestScore(Student[] arr){
        Student maxScore = null;
        Student secondMaxScore = null;

        for(Student i : arr){
            if(i.getDayScholar() == false){
                if(maxScore == null || i.getScore() > maxScore.getScore()){
                    secondMaxScore = maxScore;
                    maxScore = i;
                }
                else if(secondMaxScore == null || i.getScore() > secondMaxScore.getScore()){
                    secondMaxScore = i;
                }
            }
        }
        return secondMaxScore;
    }

    static class Student{
        private int rollno;
        private String name;
        private String branch;
        private Double score;
        private Boolean dayScholar;

        public Student(int rollno,String name,String branch,Double score,Boolean dayScholar){
            this.rollno = rollno;
            this.name = name;
            this.branch = branch;
            this.score = score;
            this.dayScholar = dayScholar;
        }

        int getRollno(){
            return rollno;
        }

        String getName(){
            return name;
        }

        String getBranch(){
            return branch;
        }

        Double getScore(){
            return score;
        }

        Boolean getDayScholar(){
            return dayScholar;
        }

    }
}
