package firstday;

public class Overloading {
	  void sum(int a,String b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[]){  
	  Overloading obj=new Overloading();  
	  obj.sum(20,"j"); 
	  obj.sum(20,20,20);  
	  
	  }

}
