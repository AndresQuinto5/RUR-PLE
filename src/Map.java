//Comenzamos a crear la clase mapa
import java.util.ArrayList;
//Colocamos las variables privadas si no queremos que las modifiquen

public class Map {
    private Robot Robot;
    private int height;
    private int width;
    private ArrayList<Wall> WallArrayList;
    private ArrayList<CoinStack> CoinStackArrayList;
    public static final String Move = "Move";
    public static final String Rotate = "Rotate";
    public static final String Pick = "Pick";
//Mapa y la lista de paredes
    public Map() {
        this.WallArrayList = new ArrayList<>();
        this.CoinStackArrayList = new ArrayList<>();
    }

    public Robot getRobot() {
        return this.Robot;
    }

//Establecemos los setters and getters


    public void setRobot(Robot Robot) {
        this.Robot = Robot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<CoinStack> getCoinStackArrayList() {
        return CoinStackArrayList;
    }

//Agregar pared y monton de fichas en el mapa

    public void addwall(Wall wall) {
        this.WallArrayList.add(wall);
    }

    public void addCoinStack(CoinStack coinStack) {
        this.CoinStackArrayList.add(coinStack);
    }


    @Override
    public String toString() {
        String actualmap = "";
        for () {
            for (){ //Errores que no se como solucionar
                boolean WallPosition = WallPosition(Row, Column);
                boolean RobotPosition = RobotPosition(Row, Column);
                CoinStack CoinStackPosition = getCoinStackPosition(Row, Column);
                if (CoinStackPosition != null) {
                    actualmap += String.valueOf(CoinStackPosition.CountCoins());
                } else if (WallPosition) {
                    actualmap += "*";
                } else if (RobotPosition) {
                    actualmap += Robot;
                } else {
                    actualmap += " ";
                }
            }
            actualmap += "\n";

        } return actualmap;

    }
}

