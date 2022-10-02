public class Main2 {
    public static void main(String[] args) {
        System.out.println("quat");
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println(fan1.toString());
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println("fan2 sau khi tat " + fan2.toString());

    }
}