class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class TestThreads {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
    }
}