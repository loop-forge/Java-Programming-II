import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // Utilise seulement le nom pour le hashcode
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si c'est le même objet
        if (obj == null || getClass() != obj.getClass()) return false; // Si l'autre objet est null ou de type différent

        Item item = (Item) obj;
        return name != null && name.equals(item.name); // Comparer les noms des items
    }
}
