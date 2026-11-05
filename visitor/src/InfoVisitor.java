public class InfoVisitor implements MediaVisitor {
    @Override
    public void visitPhoto(Photo photo) {
        System.out.println(
                "Photo: " + photo.getName()
                        + ", size: " + photo.getSizeMb() + " MB"
        );
    }

    @Override
    public void visitVideo(Video video) {
        System.out.println(
                "Video: " + video.getName()
                        + ", size: " + video.getSizeMb() + " MB"
                        + ", duration: " + video.getDurationSeconds() + " seconds"
        );
    }
}