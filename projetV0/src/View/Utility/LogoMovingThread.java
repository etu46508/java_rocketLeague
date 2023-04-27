package View.Utility;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import javax.swing.*;

public class LogoMovingThread extends Thread{
    MainWindow mainWindow;
    public LogoMovingThread(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }

    public void run(){
        while (true){
            try{

                Thread.sleep(300);
            }catch (InterruptedException interruptedException){
                throw new RuntimeException(interruptedException);
            }
        }
    }
}
