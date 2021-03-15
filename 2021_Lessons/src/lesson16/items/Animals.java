package lesson16.items;

public abstract class Animals {
    String kind;
    String subspecies;

    public Animals(String kind, String subspecies) {
        this.kind = kind;
        this.subspecies = subspecies;
    }

    public Animals() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                '}';
    }
}
