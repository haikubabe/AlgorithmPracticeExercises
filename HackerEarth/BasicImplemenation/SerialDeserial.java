import java.io.*;

class Demo implements Serializable {

    int a;
    String b;

    Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class Test {
    public static void main(String[] args) {
        Demo demoObject = new Demo(1, "geeksforgeeks");
        String filename = "file.ser";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Serializing an object
            objectOutputStream.writeObject(demoObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object is serialized");
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Desrializing an object
            objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object is deserialized");
        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}