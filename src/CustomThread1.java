public class CustomThread1 extends Thread{
    private int espera;
    public int num;

    public CustomThread1(int tiempo){
        this.espera=tiempo;
    }

    @Override
    public void run() {
        try{
            sleep(espera*1000);
            do {
                num = (int) Math.round(Math.random() * 10);
            }while(num<4 || num>20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
