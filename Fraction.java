public class Fraction {
    //data field
    private int top;
    private int bottom;
    
    //methods
    //non default constructor
    public Fraction(int top, int bottom){
      this.top = top;
      this.bottom = bottom;
    }
    //mutator methods
    public void set_top(int top){
      this.top = top;
    }
    public void set_bottom(int bottom){
      this.bottom = bottom;
    }
    
    public void output(){
      System.out.println(top + "/" + bottom);
    }
     
    public double convert(){
      return ((double)top / bottom) *100;
     }
}