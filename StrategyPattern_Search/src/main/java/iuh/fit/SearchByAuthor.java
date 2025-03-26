package iuh.fit;

import java.util.List;

public class SearchByAuthor implements SearchStrategy{
    @Override
    public List<String> search(String query) {
        System.out.println("Search by author: " + query);
        return List.of("Nguyen A", "Tran B", "Le C");
    }
}
