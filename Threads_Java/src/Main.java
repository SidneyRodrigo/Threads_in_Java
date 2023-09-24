public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Contagem 1", 100, 300);
        MyThread thread2 = new MyThread("Contagem 2", 301, 500);
        MyThread thread3 = new MyThread("Contagem 3", 501, 700);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}