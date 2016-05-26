package dafs;
import javax.swing.JFrame;
import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class MediaPlayer
{
    private JFrame mediaFrame = new JFrame();
    private EmbeddedMediaPlayerComponent mediaPlayer;
    private String mediaPath = "";
    
    MediaPlayer(String vlcPath, String mediaURL)
    {
        this.mediaPath = mediaURL;
        
        NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), vlcPath);
        
        mediaPlayer = new EmbeddedMediaPlayerComponent();
        
        mediaFrame.setContentPane(mediaPlayer);
        
        mediaFrame.setSize(1200,800);
        
        mediaFrame.setVisible(true);
        
        mediaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void run()
    {
        mediaPlayer.getMediaPlayer().playMedia(mediaPath);
    }
    
}
