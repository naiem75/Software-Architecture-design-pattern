

import java.util.ArrayList;
import java.util.*;

public class Order {
        
	 private  Date date ;
	    private  String status;
	    ArrayList<OrderDetails> orderDetails=new ArrayList<OrderDetails>(10);
	    public double calSubTotal(){
	        double total =0;
	        for(OrderDetails order: orderDetails){
	            total+=order.calcSubTotal();
	        }
	        return  total;
	    }
	    public  void calTax(){

	    }
	    public void calcTotal(){

	    }
	    public  void calcTotalWeight(){

	    }
	
	
	
	
	
	
	
}
