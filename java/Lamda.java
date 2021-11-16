
public class Lamda {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Normal method");
            }
        }).start();

        new Thread(()->{
            System.out.println("Lamda method");
        }).start();

    }
}
