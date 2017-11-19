package adminpanel;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++){
		for(int j=1;j<=3;j++){
			if(i==3||j==3||(i==2&&j==2))
		{
			System.out.print("*");
		}
		else
		{
		System.out.print("-");
		}		
		}
		System.out.println(" ");
		}

	}

}
