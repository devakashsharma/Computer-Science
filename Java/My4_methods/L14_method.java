package Java.My4_methods;

class JavaMethods {
    public void playMusic() {
        System.out.println("Music Playing. . . . .");
    }

    public String buyPen(int cost) {
        if (cost >= 10)
            return "Pen";

        return "Sorry";
    }
}
public class L14_method {
    public static void main(String[] args) {
        JavaMethods jame = new JavaMethods();
        jame.playMusic();
        String pen = jame.buyPen(20);
        System.out.println(pen);
    }
}
