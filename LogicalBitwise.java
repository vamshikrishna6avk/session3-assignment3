package assignment3;

public class LogicalBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Logical And operator
        System. out .println( "Logical AND Operator" );
 
        int a = 0;//0000
        int b = 1;//0001
        int c = 2;//0010
        int d = 3;//0011
        
        boolean ans = b>a && b<c && c<d;
        /* here b is greater than a,
           and b is less than c,
           and c is less than d, so it is true
        */
        System. out .println( " answer is " +ans);
       
        boolean ans1 = b<a && b<c && c<d;
        /* here b is less  than a,
        and b is less than c,
        and c is less than d,
         due to b is less than a the given experssion is false
     */
        System. out .println( " answer is " +ans1);
 
        boolean ans2 = b>a && b>c && c>d;
        /* here b is greater  than a,
        and b is greater than c,
        and c is greater than d,
         therefore the given experssion is false
     */
        System. out .println( " answer is " +ans2); 
              
        boolean ans3 = b<a && b>c && b<d && c<d;
        /* here b is less  than a,
        and b is greater than c,
        b is less than d,
        and c is less than d,
         therefore the given experssion there is  an error at b<a ,b>c so it is false
     */
        System. out .println( " answer is " +ans3);
 
        System. out .println( "***** bitwise AND operator *****");
        /* BITWISE AND OPERATOR*/
        System. out .println( " answer is "  +(a&b));//here value is zero 
        System. out .println( " answer is "  +(b&c));//here value is zero 
        System. out .println( " answer is "  +(b&d));/*after calculating the values it becomes 1
        b=0001
        d=0011
         =0001 
         */
        System. out .println( " answer is "  +(c&d));
        /*
        c=0010
        d=0011
         =0010 
         */
        
	}

}
