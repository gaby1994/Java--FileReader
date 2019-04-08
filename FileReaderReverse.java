package lecturefichiers;


public class FileReaderReverse extends AbstractFileReader{
    public FileReaderReverse(String fileName){
	super(fileName);
    }
    

    @Override
    public void print() {
          for(int i=fileContent.size()-1; i>=0;i--){
	    System.out.print(fileContent.get(i));
	}
	System.out.println("\n");
    }
    
}
