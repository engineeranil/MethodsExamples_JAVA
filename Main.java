import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ANIL HOCA","31","BIO");
        t1.printTeacher();
        Course c1 = new Course("BIYOLOJI","101","BIO",78,t1);
        Course c2 = new Course("FIZIK","102","FZK",67,t1);
       Course c3 = new Course("MATEMATIK","102","MATH",55,t1);




        c1.addTeacher(t1);
        Student st = new Student("MAHMUT","0555","B",c1,c2,c3);
        st.printNote(c1,c2,c3);
        st.calcAvarage(c1,c2,c3);
        st.isPass();
    }
}
