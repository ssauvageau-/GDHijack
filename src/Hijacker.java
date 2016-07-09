import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * @author Ceno
 */
public class Hijacker {
    int modID;
    int mod_tab_X = 85;
    int mod_tab_Y = 30;
    int select_X = 130;
    int select_Y = 110;
    int base_X = 250;
    int base_Y = 110;
    int mod_height = 20;
    public Hijacker(int idNum)
    {
        modID = idNum > 0 ? idNum : 0;
    }
    
    public void hijack() throws IOException, AWTException
    {
        String AMpath = "C:/Program Files (x86)/Steam/steamapps/common/Grim Dawn/AssetManager.exe";
        ProcessBuilder p = new ProcessBuilder(AMpath);
        p.start();
        Robot rob = new Robot();
        rob.delay(2000);
        rob.keyPress(KeyEvent.VK_RIGHT);
        rob.keyRelease(KeyEvent.VK_RIGHT);
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        rob.keyPress(KeyEvent.VK_ALT);
        rob.keyPress(KeyEvent.VK_SPACE);
        rob.keyPress(KeyEvent.VK_X);
        rob.keyRelease(KeyEvent.VK_X);
        rob.keyRelease(KeyEvent.VK_SPACE);
        rob.keyRelease(KeyEvent.VK_ALT);
        rob.delay(1000);
        rob.mouseMove(mod_tab_X, mod_tab_Y);
        rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        rob.delay(100);
        rob.mouseMove(select_X, select_Y);
        rob.delay(1000);
        rob.mouseMove(base_X, base_Y + (20 * modID));
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        rob.keyPress(KeyEvent.VK_F7);
        rob.keyRelease(KeyEvent.VK_F7);
    }
}
