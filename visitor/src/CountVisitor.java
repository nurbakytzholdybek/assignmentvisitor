public class CountVisitor implements MediaVisitor {
    private int photoCount;
    private int videoCount;

    @Override
    public void visitPhoto(Photo photo) {
        photoCount++;
    }

    @Override
    public void visitVideo(Video video) {
        videoCount++;
    }

    public int getPhotoCount() {
        return photoCount;
    }

    public int getVideoCount() {
        return videoCount;
    }
}