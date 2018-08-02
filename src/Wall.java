public class Wall {
    private int Row;
    private int Column;
    private int [] where = new int [2];


    public void setRow(int Row) {
        this.Row = Row;
    }

    public void setColumn(int Column) {
        this.Column = Column;
    }
    //Las paredes deben tener una posicion en el mapa
    public Wall (int Row, int Column){
        this.where[0] = Row;
        this.where[1] = Column;

    }

    //Metodos para llamar y establecer valores
    public int getRow() {
        return this.where[0];
    }

    public int getColumn() {
        return this.where[1];
    }

    public int[] getWhere() {
        return this.where;
    }
    //Establecemos el signo de la pared
    @Override
    public String toString(){
        return "*";
    }
}