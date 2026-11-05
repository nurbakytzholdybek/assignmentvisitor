public class Video implements MediaElement {
    private final String name;
    private final int sizeMb;
    private final int durationSeconds;

    public Video(String name, int sizeMb, int durationSeconds) {
        this.name = name;
        this.sizeMb = sizeMb;
        this.durationSeconds = durationSeconds;
    }

    public String getName() {
        return name;
    }

    public int getSizeMb() {
        return sizeMb;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    @Override
    public void accept(MediaVisitor visitor) {
        visitor.visitVideo(this);
    }
}
