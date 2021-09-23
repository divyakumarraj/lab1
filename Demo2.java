class Emp
{
    private int id;
    private  int sal;

    public int getId() {
        return id;
    }

    public int getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setSal(int sal) {
        this.sal = sal;


    }
}



public class Demo2 {
    public static void main(String[] args) {
        Emp obj1=new Emp();
        obj1.setId(45);
        obj1.setSal(5643);
        System.out.println(obj1.getId());
        System.out.println(obj1.getSal());

    }
}
