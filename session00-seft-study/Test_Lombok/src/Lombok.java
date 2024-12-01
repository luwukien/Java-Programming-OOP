import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chi Kien-Luu | github/luwukien
 * Initialize Date: 01/12/2024
 */


@Getter
@Setter
@ToString
public class Lombok {
    private String idCat;
    private String nameCat;
    private int birthCat;

    public Lombok(String nameCat, String idCat, int birthCat) {
        this.nameCat = nameCat;
        this.idCat = idCat;
        this.birthCat = birthCat;
    }
}
