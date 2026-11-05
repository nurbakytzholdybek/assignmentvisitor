public class Photo implements MediaElement {
    private final String name;
    private final int sizeMb;

    public Photo(String name, int sizeMb) {
        this.name = name;
        this.sizeMb = sizeMb;
    }

    public String getName() {
        return name;
    }

    public int getSizeMb() {
        return sizeMb;
    }

    @Override
    public void accept(MediaVisitor visitor) {
        visitor.visitPhoto(this);
    }
}