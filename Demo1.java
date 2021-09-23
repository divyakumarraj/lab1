class Stu
{
    static int rollno;
    static int arr[];

    public static void Stu(int rollno, int[] arr) {
        rollno = rollno;
        arr = arr;
    }
    public static void display()
    {

        System.out.println(rollno);
        for (int res:arr){
            System.out.println(res);
        }
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Stu.Stu(23,new int[]{12,23,4,5,56});
        Stu.display();

    }
}
