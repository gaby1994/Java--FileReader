package lecturefichiers;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*/**
 *
 * @author licence
 */
public abstract class AbstractFileReader implements InterfaceFileReader{
    public String fileName;
    public ArrayList<String> fileContent;
    public File file;
    public FileInputStream fis = null;
	
    public AbstractFileReader(String fileName){
	this.fileName = fileName;
	this.fileContent = new ArrayList<String>();
    }
	
    //@Override
    public boolean open() {
	this.file = new File(fileName);		
	return (file.exists() && file.canRead() && file.isFile());
    }
    
    
    
    //@Override
    public void read(){	
        try {
            //boolean eof=false;
            //int n;
	    //byte[] bytes;
	    //int nbElem=0;
	    String line=" ";
	    
                      
            file=new File(fileName);
            fis=new FileInputStream(file);
            
            /*while(eof!=false){
	      n=fis.read();
	      this.fileContent.add((char)n);
                
	      }*/
	    for(int a=fis.read() ;a != 1 ;a = fis.read()){		
		char c=(char)a;
		line=line+c;
		this.fileContent.add(line);		
	    }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbstractFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AbstractFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


   
 

}
