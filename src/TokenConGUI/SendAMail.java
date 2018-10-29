package TokenConGUI;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *this feature link the QRcode as an attchment to new Email on outlook 
 */

/**
 *
 * @author JOHAIK
 */
public class SendAMail {
    public final static File PATH_13 = new File("C:\\Program Files (x86)\\Microsoft Office\\Office15");//defult in windows 7 
    public final static File PATH_10 = new File("C:\\Program Files (x86)\\Microsoft Office\\Office14"); 
    public static JFrame frame = new JFrame("error");
    
     

 /**
  * run the command for windows 7
  */
public static void cmdBuilder(){ 
    final List<String> commands = new ArrayList<>();
    String line , sPath;
    sPath = "C:\\temp\\qrcode.png";
    line = "outlook /c ipm.note /a \""+sPath+"\"";
    File path = outlookVersion();
    
    if(path == null){//if can't find outlook version.
        JOptionPane.showMessageDialog(frame,"It's appear to be a problam with figure out outlook version","Outlook Version",
                                                        JOptionPane.ERROR_MESSAGE);//thow eror msg
        return;
    }
    commands.add("cmd.exe");
    commands.add("cd "+path.getAbsolutePath());
    commands.add(line);
     ProcessBuilder builder = new ProcessBuilder(commands);//create the URL
        try {
            builder.start();
        } catch (IOException ex) {
            Logger.getLogger(SendAMail.class.getName()).log(Level.SEVERE, null, ex);
        }
}


private static File outlookVersion(){
    if (PATH_13.exists()){
        return PATH_13;
    }
    else if(PATH_10.exists()){
        return PATH_10;
    }
    else    
        return null;
}

}