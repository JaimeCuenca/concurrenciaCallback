import java.sql.Timestamp;
import java.time.Instant;

public class CustomThread2 extends Thread {
    Principal ppal;

    public int rep;

    public CustomThread2(int repeticiones, Principal ppal){

        this.rep=repeticiones;
        this.ppal=ppal;
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
            ppal.callback(rep, tiempo);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
