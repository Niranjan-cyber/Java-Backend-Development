class Student{
    // instance variables which belong to the class not the method
    int rollno;  
    String name;
    int marks;
}

public class student {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Niranjan";
        s1.marks = 67;

        // creating array that can hold three student objects
        Student students[] = new Student[3];

        // you have to manually create the student objects and assign them
        students[0] = s1;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jainil";
        s2.marks = 70;
        Student s3 = new Student();
        s3.rollno = 4;
        s3.name = "Anuj";
        s3.marks = 71;

        students[1] = s2;
        students[2] = s3;

        System.err.println(students[0]);
        System.err.println(s1.name + " : " + s1.marks);

        // for (int i = 0; i < students.length; i++){
        //     System.out.println(students[i].rollno +
        //          " " + students[i].name + " " + students[i].marks);
        // }

        // for each loop
        for (Student s : students){
            System.out.println(s.rollno + " " + s.marks);
        }

        // string buffer
        StringBuffer sb = new StringBuffer("niranjan"); // buffer size 16 chars
        System.err.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" iyer"); // to change
        System.out.println(sb);

        String s = sb.toString(); // to convert
        System.out.println(s);
        
        sb.deleteCharAt(1);
        sb.insert(0, "nirajan");
        sb.substring(9, 12);
        sb.setLength(20);
    }
}
