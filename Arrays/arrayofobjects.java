class student{
    String name;
    int roll_no;
    int marks;
}

public class arrayofobjects{
    public static void main(String[] args) {
        student s1 = new student();

        s1.name = "Soham";
        s1.roll_no = 15;
        s1.marks = 20;

        student s2 = new student();  

        s2.name = "Vihan";
        s2.roll_no = 15;
        s2.marks = 20;

        //Created object info stored in array
        student students[] = new student [2];

        students[0] = s1;
        students[1] = s2;


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }
}