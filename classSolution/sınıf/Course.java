public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int sNot;
    double oran;
    int note;

    public Course(String name, String code, String prefix, int sNot,double oran){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sNot = sNot;
        this.oran = oran;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        }
        else{
            System.out.println(t.name+ "Dersi vermez!");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
