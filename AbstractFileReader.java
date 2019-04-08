package lecturefichiers;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author licence
 */
public abstract class AbstractFileReader implements InterfaceFileReader{
    protected String fileName;
    protected ArrayList fileContent;
    protected File file;
    protected FileInputStream fis = null;
	
    public AbstractFileReader(String fileName){
	this.fileName = fileName;
	this.fileContent = new ArrayList<>();
    }
	
    @Override
    public boolean open() {
	this.file = new File(fileName);		
	return (file.exists() && file.canRead() && file.isFile());
    }
    
    
    
    @Override
    public void read(){	
        try {
            boolean eof=false;
            char c;
            int n;
                      
            file=new File(fileName);
            fis= new FileInputStream(file);
            
            while(!eof){
                n=fis.read();
                c=(char)n;
                fileContent.add(c);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbstractFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AbstractFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


   
 

}
