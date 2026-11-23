import BoardFactory.Board;

public class Piece {

    private int val ;
    private Board board ;

    public Piece(Board board){
        this.val = val ;
        this.board = board ;
    }

    public Boolean movementAvailable(){
        return moveUpLeft() || moveUpRight() || moveDownLeft() || moveDownRight() ;
    }

    public Boolean moveUpLeft(){

    }

    public Boolean moveUpRight(){

    }

    public Boolean moveDownLeft(){

    }

    public Boolean moveDownRight(){

    }




}
