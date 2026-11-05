public class SizeVisitor implements MediaVisitor {
    private long totalSizeMb;

    @Override
    public void visitPhoto(Photo photo) {
        totalSizeMb += photo.getSizeMb();
    }

    @Override
    public void visitVideo(Video video) {
        totalSizeMb += video.getSizeMb();
    }

    public long getTotalSizeMb() {
        return totalSizeMb;
    }
}