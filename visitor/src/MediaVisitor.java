public interface MediaVisitor {
    void visitPhoto(Photo photo);
    void visitVideo(Video video);
}