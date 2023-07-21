class Student {
    int roll_no;
    String stu_name;
    double m1,m2;
}

class Main{
    public static void main(String[] args) {
        
        {
            Student s1=new Student();
            System.out.println("s1 roll no before assignment"+s1.roll_no);
            s1.roll_no=1001;
            System.out.println("s1 roll no"+s1.roll_no);
            System.out.println("s1 student name before assignment"+s1.stu_name);
            s1.stu_name="rohith";
            System.out.println("s1 marks1 before assignment"+s1.m1);
            s1.m1=88;
            System.out.println("s1 marks"+s1.m1);
            System.out.println("s1 marks2 before assignmant"+s1.m2);
            s1.m1=88;
            System.out.println("s1 marks2"+s1.m2);

        }
    }
}