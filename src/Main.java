import java.awt.AWTException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ceno
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] mods = {5, 6};
        try {
            for(int i : mods)
            {
                Hijacker hi = new Hijacker(i);
                hi.hijack();
                Thread.sleep(2500); //safety
            }
        } catch (IOException | AWTException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
