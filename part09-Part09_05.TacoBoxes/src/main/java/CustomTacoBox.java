public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacosNumber){
        this.tacos = tacosNumber;
    }
    public int tacosRemaining(){
        return tacos;
    }
    public void eat(){
        this.tacos--;
        if(tacos<0) tacos = 0;
    }
}
