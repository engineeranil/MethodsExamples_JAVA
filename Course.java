public class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix,int note,Teacher teach){
        this.name = name;
        this.code=code;
        this.prefix=prefix;
        this.teach=teach;
        this.note=note;
    }

    void addTeacher(Teacher teach){
        this.teach.printTeacher();
    }


}
