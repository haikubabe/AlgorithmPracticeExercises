import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        String[] arr=str.split("\\?");
        String[] arr1=arr[1].split("&pwd=");
        String[] arr11=arr1[0].split("=");
        String[] arr12=arr1[1].split("&profile=");
        String[] arr13=arr12[1].split("&role=");
        String[] arr14=arr13[1].split("&key=");
        System.out.println(arr11[0]+": "+arr11[1]);
        System.out.println("pwd: "+arr12[0]);
        System.out.println("profile: "+arr13[0]);
        System.out.println("role: "+arr14[0]);
        System.out.println("key: "+arr14[1]);
    }
}