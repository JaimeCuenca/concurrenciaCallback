public class Principal{

    static final int Tiempo=4;

    public static void main(String[] args) {


        try {
            CustomThread1 hilo1 = new CustomThread1(Tiempo);
            hilo1.run();
            hilo1.join();
            CustomThread2 hilo2 = new CustomThread2(hilo1.num, Principal ppal = new Principal());
            hilo2.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String callback(int rep, long time){
        return "El número de repeticiones del bucle ha sido: " + rep + ". Y el tiempo transcurrido: " + time / 1000 + " segundos.";
    }
}
