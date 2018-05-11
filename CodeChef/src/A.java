public class A {
    public int i=0;
    static void fun(A obj) {
        obj = new A();
        obj.i=5;
        System.out.println(obj.i);
    }
    public static void main (String[] args) {
        A obj = new A();
        fun(obj);
        System.out.println(obj.i);
    }
}
