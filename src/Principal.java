public class Principal{
    static final int Tiempo=4;

    public void principal(){
        try {
            CustomThread1 hilo1 = new CustomThread1(Tiempo);
            hilo1.start();
            hilo1.join();
            CustomThread2 hilo2 = new CustomThread2(hilo1.num, this);
            hilo2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void callback(int rep, long time){
       System.out.println("El número de repeticiones del bucle ha sido: " + rep + ". Y el tiempo transcurrido es: " + time / 1000 + " segundos.");
    }


}
