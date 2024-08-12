public class Ball{
    private  int x;
    private  int y;
    private  int xStep;
    private  int yStep;

    public Ball(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Ball(){

    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public void setXStep(int xStep){
        this.xStep=xStep;
    }
    public int getXStep(){
        return xStep;
    }
    public void setYStep(int yStep){
        this.yStep=yStep;
    }
    public int getYStep(){
        return yStep;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String getXY(){
        return String.format("X : "+x+"  Y : "+y);
    }
    public void setXYStep(int xStep,int yStep){
        this.xStep=xStep;
        this.yStep=yStep;
    }
    public String getXYStep(){
        return String.format("X : "+xStep+"  Y : "+yStep);
    }
    public String move(){
        x = x+xStep;
        y = y+yStep;
        return String.format("Ball move to X : "+x+" and Y : "+y);
    }
}
