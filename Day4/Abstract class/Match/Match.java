public abstract class Match{
    private  int currentScore;
    private  float currentOver;
    private  int target;

    public int getCurrentScore(){
        return currentScore;
    }

    public void setCurrentScore(int currentScore){
        this.currentScore = currentScore;
    }
    public float getCurrentOver(){
        return currentOver;
    }

    public void setCurrentOver(float currentOver){
        this.currentOver =currentOver;
    }

    public int getTargetScore(){
        return target;
    }

    public void setTargetScore(int target){
        this.target = target;
    }

    public abstract float calculateRunRate();
    public abstract int calculateBalls();
    public abstract void display(double reqRunRate, int balls);

}