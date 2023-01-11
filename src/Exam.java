public class Exam {
  private String name;
  private Subject subject = new Subject();
  private int year;
  private int semester;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Subject getSubject() {
    return subject;
  }
  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }
}
