import javax.xml.namespace.QName;

public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name,String mpNo,String branch){
        this.name = name;
        this.mpNo=mpNo;
        this.branch=branch;
    }

    void printTeacher(){
        System.out.println("OGRETMENIN ADI : "+this.name);
        System.out.println("OGRETMENIN NUMARASI : "+this.mpNo);
        System.out.println("OGRETMENIN BRANSI : "+this.branch);
    }

}
