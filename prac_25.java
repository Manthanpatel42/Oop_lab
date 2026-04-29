class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }
}

class T1 extends Thread {
    Table t;
    T1(Table t) { this.t = t; }
    public void run() { t.printTable(5); }
}

class T2 extends Thread {
    Table t;
    T2(Table t) { this.t = t; }
    public void run() { t.printTable(7); }
}

class TestSync {
    public static void main(String[] args) {
        Table t = new Table();
        new T1(t).start();
        new T2(t).start();
    }
}