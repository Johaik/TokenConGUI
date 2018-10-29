package TokenConGUI;


import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 *nroswe frame cinfiguration 
 */

/**
 *
 * @author JOHAIK
 */
public class TokenChooser extends JFileChooser{
    
  private JFileChooser _dc;
  
  public TokenChooser(){
      _dc  = new JFileChooser();
  }
public void configChooser(){
    this._dc.setAcceptAllFileFilterUsed(false);
    this._dc.setMultiSelectionEnabled(false);//only one at the time 
    this._dc.setFileFilter(new FileNameExtensionFilter("Token file","sdtid"));
    this._dc.setDialogTitle("Token Converter");
            
}

  
  public JFileChooser getDC() { return _dc; }
    
}
