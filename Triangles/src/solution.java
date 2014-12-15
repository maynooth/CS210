/**
 * 
 */

/**
 * @author Xiao Zhenbang
 *
 */
import java.util.*;
import java.math.*;
public class solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declaration part
		Scanner in = new Scanner(System.in);
		int testAmount;
		boolean result=false;		//The result of judgment
		testAmount = in.nextInt();		//The amount of test cases
		for(int i=1;i<=testAmount;i++){	//Count the test cases
			int a,b,a2,b2;				//The sides of triangle and their square
			int l;					//The slope line
			a=in.nextInt();				//Input of sides	
			b=in.nextInt();
			a2=a*a;						//Calculate the squares
			b2=b*b;
			l=a2+b2;			//Calculate the slope line
			mainloop:
			for(int x1=1;x1<=10000;x1++){
				int left,right;			//
				for(int y1=1;y1<=10000;y1++){
					for(int x2=1;x2<=10000;x2++){
						for(int y2=1;y2<=10000;y2++){
							left=l;
							right=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
							if((right>left)||(x2-x1==0)||((y2-y1)/(x2-x1)==0)){ //All fault cases
								//System.out.println("False");
								result=false;
								break;
							}else if(a==1&&b==1){
								result=false;
								break mainloop;
								//System.out.println("left: " + left);
								//System.out.println("right: " + right);
							}else{
								if(left==right){
									//System.out.println("REAL True");
									result=true;
									break mainloop;
									/*for(int x3=0;x3<=10000;x3++){
										int R1,R2;
										for(int y3=0;y3<=10000;y3++){
											R1=(x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
											R2=(x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
											System.out.println("a2: "+a2+"\nb2: "+b2+"\nR1: "+R1+"\nR2: "+R2);
											if((R1>a2)||(R2>b2)||(x3-x1==0)||(x3-x2==0)||(y3-y1)/(x3-x1)==0||(y3-y2)/(x3-x2)==0){
												System.out.println("false");
												result=false;
												break;
											}else if((a2==R1)&&(b2==R2)){
												result=true;
												break mainloop;
											}
										}
									}*/
								}
								//System.out.println("True");
								result=false;
								break;
							}
						}
					}
				}
			}
			if(result==true){
				System.out.println("TRUE");
			}else{
				System.out.println("FALSE");
			}
		}
	}

}
