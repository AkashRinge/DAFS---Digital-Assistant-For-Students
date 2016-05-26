package dafs;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StartMediaPlayer
{
    private static JFileChooser fileSelector;
   
    public void run()
    {
       String vlcPath = "/usr/lib";
       String mediaPath = "";
       File ourFile;
       fileSelector = new JFileChooser();
       int flag = 0;
        do {
            try
            {
                 fileSelector.setFileSelectionMode(JFileChooser.FILES_ONLY);
                 fileSelector.showSaveDialog(null);
                 ourFile = fileSelector.getSelectedFile();
                 mediaPath = ourFile.getAbsolutePath();

                 new MediaPlayer(vlcPath, mediaPath).run();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid audio or video file");
                flag = 1;
            }
        }
        while(flag!=0);
    }
    
}
