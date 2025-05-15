public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }
    public int tacosRemaining(){
        return tacos;
    }
    public void eat(){
        this.tacos--;
        if(tacos<0) tacos = 0;
    }
}
