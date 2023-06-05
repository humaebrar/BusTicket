import java.util.ArrayList;
import java.util.List;

public class Bus {
    public String numberPlate;
    public List<String> seats = new ArrayList<>();
    public Bus (String numberPlate){
        this.numberPlate=numberPlate;
        for (int i = 1; i<33;i++){
            seats.add(i+"");
        }
    }
}
