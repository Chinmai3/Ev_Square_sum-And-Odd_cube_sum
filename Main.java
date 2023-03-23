import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int temp=n;
		while(temp>0)
		{
		    cnt++;
		    temp/=10;
		}
		int res=myfun(n,cnt);
		System.out.println(res);
		
	}
	static int myfun(int n,int cnt)
	{
	    int odd_cube=0;
	    int ev_sq=0;
	    while(cnt>=1)
	    {
	        int rem=n%10;
	        if(cnt%2==0)
	        {
	            ev_sq=ev_sq+(rem*rem);
	        }
	        
	        else{
	            odd_cube+=(rem*rem*rem);
	        }
	        cnt--;
	        n/=10;
	        
	    }
	    System.out.println("ev sq sum is"+ev_sq);
	    System.out.println("odd cube sum is"+odd_cube);
	    int res=odd_cube/ev_sq;
	        return res;
	}
}
