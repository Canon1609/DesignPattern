package iuh.fit;

import java.util.List;

public class SearcnByName implements SearchStrategy{
    @Override
    public List<String> search(String query) {
        System.out.println("Search by name: " + query);
        return List.of("Sach tin hoc", "Sach toan", "Sach van");
    }
}
