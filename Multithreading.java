//Ambiente Multithread com java
//Última alteração: 23 de setembro de 2023
public class Multithreading {

    // Primeira thread a ser executada
    static class Task1 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Task1 - Contagem: " + i);
                try {
                    Thread.sleep(1000); // Pausa por 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Segunda thread a ser executada
    static class Task2 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Task2 - Contagem: " + i);
                try {
                    Thread.sleep(500); // Pausa por meio segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

     // Terceira thread a ser executada
    static class Task3 extends Thread {
        public void run(){
            for (int i =1; i <=10; i++){
                System.out.println("Task3 - Contagem: " + i);
                try {
                    Thread.sleep(1500); //Pausa por 1,5 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.start();
        t2.start();
        t3.start();

        // Espera as threads terminarem
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas as threads terminaram.");
    }
}
