import java.sql.Timestamp;
import java.time.Instant;

public class CustomThread2 extends Thread {

    callback callback;
    public int rep;
    public long tiempo;

    public CustomThread2(int repeticiones){
        this.rep=repeticiones;
    }

    @Override
    public void run() {
        try {
            Timestamp t0 = new Timestamp(System.currentTimeMillis());

            for (int i = 0; i < rep; i++) {
                sleep(2000);
            }

            Timestamp tf = new Timestamp(System.currentTimeMillis());

            long tiempo = (tf.getTime() - t0.getTime());
            this.tiempo=tiempo;

            msj;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
