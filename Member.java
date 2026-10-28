import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final List<Book> borrowed = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public List<Book> getBorrowed() { return borrowed; }

    @Override
    public String toString() {
        return name + " (" + borrowed.size() + " book(s) borrowed)";
    }
}
