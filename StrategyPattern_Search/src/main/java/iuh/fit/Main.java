package iuh.fit;

public class Main {
    public static void main(String[] args) {

        SearchContext searchContext = new SearchContext(new SearcnByName());
        searchContext.search("Sach tin hoc");

        searchContext.setSearchStrategy(new SearchByAuthor());
        searchContext.search("Nguyen A");


    }
}