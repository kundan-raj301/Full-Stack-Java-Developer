import java.util.*;

public class CourseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Add Scanner object
        Course[] course = new Course[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine(); // Read Course ID
            String b = sc.nextLine();            // Read Course Name
            String c = sc.nextLine();            // Read Course Admin
            int d = sc.nextInt(); sc.nextLine(); // Read Quiz score
            int e = sc.nextInt(); sc.nextLine(); // Read HandsOn score

            course[i] = new Course(a, b, c, d, e);
        }

        String admin = sc.nextLine();           // Read Admin name
        int hand = sc.nextInt();                // Read HandsOn threshold

        int ans1 = findAvgOfQuizByAdmin(course, admin);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No Course found");
        }

        Course[] ans2 = sortCourseByHandsOn(course, hand);
        if (ans2 != null) {
            for (Course i : ans2) {
                System.out.println(i.getCname());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }
    }

    public static int findAvgOfQuizByAdmin(Course[] course, String cadmin) {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < course.length; i++) {
            if (course[i].getCadmin().equals(cadmin)) {
                sum += course[i].getQuiz();
                cnt++;
            }
        }

        if (cnt > 0) {
            int avg = sum / cnt;
            return avg;
        } else {
            return 0;
        }
    }

    public static Course[] sortCourseByHandsOn(Course[] course, int h) {
        int cnt = 0;
        for (Course c : course) {
            if (c.getHandson() < h) {
                cnt++;
            }
        }

        Course[] filteredCourses = new Course[cnt];
        int idx = 0;
        for (Course c : course) {
            if (c.getHandson() < h) {
                filteredCourses[idx++] = c;
            }
        }

        Arrays.sort(filteredCourses, (c1, c2) -> Integer.compare(c1.getHandson(), c2.getHandson()));

        return filteredCourses.length > 0 ? filteredCourses : null;
    }
}

class Course {
    private int cid, quiz, handson;
    private String cname, cadmin;

    public Course(int cid, String cname, String cadmin, int quiz, int handson) {
        this.cid = cid;
        this.cname = cname;
        this.cadmin = cadmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCname() { // Corrected return type to String
        return cname;
    }

    public void setCadmin(String cadmin) {
        this.cadmin = cadmin;
    }

    public String getCadmin() {
        return cadmin;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }

    public int getHandson() {
        return handson;
    }
}
