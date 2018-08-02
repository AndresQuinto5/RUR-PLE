//Declaramos el monton de monedas y sus atributos
//18288
public class CoinStack {
    private int [] Where = new int [2];
    private int Row;
    private int Column;
    private int qty;
    private static final int Max = 9;
    private static final int Min = 0;

//Get and set para cada cosa
    public int getQty(){
        return qty;
    }

    public int getColumn(){
        return this.Where[1];
    }

    public int getRow(){
        return this.Where[0];
    }

    // pick una moneda del monton
    private boolean PickC(){
        while (qty !=Min){
            qty = qty-1;     //Se le resta 1 al monton
        }
        return (false);
    }
    //Comprobar el stack para revisar si tiene mas de 9 monedas
    private boolean check(){
        if (qty > Max){
            return false;
        }
        return true;
    }
    // Un monton de monedas tiene posicion (X, Y) y Cantidad de monedas
    public CoinStack(int Row, int Column, int qty){
        this.Where[0]= Row;
        this.Where[1]= Column;
        this.qty = qty;
    }

}