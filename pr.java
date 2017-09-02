public class pr {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
        	a[i]=Integer.parseInt(br.readLine());	
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(a[i]==a[j])
        		{
        			System.out.print(a[i]+" ");
        		}
        	}
        }  	 
	}
}
