import data.Disk;
import data.Rectangle;
import data.Square;

/**
 * @author Chi Kien-Luu | github/luwukien 
 * Date: 11/23/2024
 */

public class craftsMan {
    public static void main(String[] args) {
        cutShapes();
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("Mother", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("Father", "Pink", 3.0);
        s1.paint();

        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
        d1.paint();

    }
}


