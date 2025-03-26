package iuh.fit;

public class BookFactory {

    public  static Book createBook(String type){
        if(type.equals("Audio")){
            return new AudioBook();
        }else if(type.equals("Paper")){
            return new PaperBook();
        }
        return null;
    }
}
