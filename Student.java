
public class Student {
    Course co;
    Course co2;
    Course co3;
    String name;
    String stuNo;
    String classes;
    boolean isPass;
    double avarage;

    Student(String name,String stuNo,String classes,Course co,Course co2,Course co3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage=avarage;
        this.co = co;
        this.co2 = co2;
        this.co3 = co3;

    }

    void addBulkExamNote(){
            this.co.note=co.note;
            this.co2.note=co2.note;
            this.co3.note=co3.note;
    }

    void calcAvarage(Course co,Course co2,Course co3){
        double sonuc =(this.co.note+this.co2.note+this.co3.note)/3;
        System.out.println(sonuc);
    }

    boolean isPass(){
        calcAvarage(co,co2,co3);
            return this.avarage>55;

    }

    void printNote(Course co,Course co2,Course co3){
        System.out.println("BIO DERSININ NOTU : "+this.co.note);
        System.out.println("FIZIK DERSININ NOTU : "+this.co2.note);
        System.out.println("MATEMATIK DERSININ NOTU : "+this.co3.note);
    }
}
