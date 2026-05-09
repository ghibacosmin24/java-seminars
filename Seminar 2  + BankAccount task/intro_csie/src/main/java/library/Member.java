package library;

public class Member {
    private String name;

    public Member(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Member name is required");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}