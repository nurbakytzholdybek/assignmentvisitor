import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MediaElement> gallery = Arrays.asList(
                new Photo("Astana.jpg", 5),
                new Photo("Family.png", 8),
                new Video("Vacation.mp4", 120, 60)
        );

        InfoVisitor infoVisitor = new InfoVisitor();
        SizeVisitor sizeVisitor = new SizeVisitor();
        CountVisitor countVisitor = new CountVisitor();

        for (MediaElement element : gallery) {
            element.accept(infoVisitor);
            element.accept(sizeVisitor);
            element.accept(countVisitor);
        }

        System.out.println(
                "Total size: " + sizeVisitor.getTotalSizeMb() + " MB"
        );
        System.out.println(
                "Photos: " + countVisitor.getPhotoCount()
        );
        System.out.println(
                "Videos: " + countVisitor.getVideoCount()
        );
    }
}