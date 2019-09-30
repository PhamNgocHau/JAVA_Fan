public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(100 , true , 20 , "Blue");
        Fan fan2 = new Fan(50 , false , 10 , "Red");

        System.out.println("Fan1: " + fan1.toString());
        System.out.println("\n");
        System.out.println("Fan2: " + fan2.toString());
    }
}
