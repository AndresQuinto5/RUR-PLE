//Declaramos la clase Robot y sus atributos!
public class Robot {
    //Aqui colocamos sus atributos con lo cual trabajaremos despues
    private int Row;
    private int column;
    private int [] where = new int[2];
    private int direction;
    private int coins;
    private static final int Up = 0;// ^
    private static final int Right = 1;// >
    private static final int Down = 2;// V
    private static final int Left = 3;// <

// Establecemos que el robot tiene direccion
    public Robot(int direction, int linea,int column){
        this.direction = direction;
        this.where[0] = linea;
        this.where[1] = column;
        this.coins = 0;
    }
    //Elaboramos un menu de direcciones para el robot y asi se pueda dezplazar
    public void move(){
        switch (this.direction){
            case Up: setRow(getRow()-1 );// se mueve una linea para arriba (negativo)
                break;
            case Right: setColumn(getColumn()+1); // se mueve una columna a la derecha (positivo)
                break;
            case Down: setRow(getRow()+1); // se mueve una linea para abajo (positivo)
                break;
            case Left: setColumn(getColumn()-1); //se mueve una columna a la izquierda (negativo)
                break;
        }
    }
//Establecer y llamar valores con get and set
    public void setRow(int Row) {
        this.where[0] = Row;
    }

    public void setColumn(int column) {
        this.where[1] = column;
    }

    public int [] getWhere(){
        return this.where;
    }

    public int getRow(){
        return this.where[0];
    }

    public int getColumn(){
        return this.where[1];
    }

    public int getCoins() {
        return coins;
    }

//¿En que (x,Y) se encuentra el robot
    public int getDirection() {
        return direction;
    }

    //Le cambiamos direccion al robot
    public void ChangeDirection() {
        switch (this.direction){
            case 0:
                this.direction = 1;
                break;
            case 1:
                this.direction = 2;
                break;
            case 2:
                this.direction =3;
                break;
            case 3:
                this.direction  = 0;
                break;
        }
    }

// Elaboramos una manera de que pueda recoger beepers
    public void pocket(int coin) {
        this.coins += coin;
    }
    @Override
    public String toString(){
        switch (this.direction){
            case Up : return "ˆ";
            case Right: return ">";
            case Down: return "V";
            case Left: return "<";
        }
        return "";
    }
}