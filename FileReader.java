package lecturefichiers;

public class FileReader extends AbstractFileReader{
    public FileReader(String fileName){
	super(fileName);
    }


    @Override
    public void print() {
        for(int i = 0; i < this.fileContent.size(); i++){
	    System.out.print(this.fileContent.get(i));
	}
	System.out.println("\n");
    }
}

