import java.lang.System.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Subject mainSubject = new Subject();
        mainSubject.setName("Algebra Linear");
        mainSubject.setUniversityName("UFRJ");

        Exam firstExam = new Exam();
        firstExam.setName("P1 de álgebra linear");
        firstExam.setSubject(mainSubject);
        firstExam.setYear(2020);
        firstExam.setSemester(1);

        System.out.println(firstExam);
    }
}
