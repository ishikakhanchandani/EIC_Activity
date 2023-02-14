public abstract class Shape{
    private  int value;

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public abstract double calculateArea();

}