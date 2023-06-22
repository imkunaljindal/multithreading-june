public class Main {

//    public static class Messi extends Thread{
//        public void run(){
//            for(int i=0;i<5;i++){
//                System.out.println("Messi");
//                try {
//                    Thread.sleep(6000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

    public static class Messi implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println("Messi");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // extends Thread
//        Messi messi = new Messi();
//        messi.start();

        // implements Runnable
        Messi messi = new Messi();
        Thread t = new Thread(messi);
        t.start();

        Thread.sleep(2000);
        for(int i=0;i<5;i++){
            System.out.println("Ronaldo");
        }
    }
}