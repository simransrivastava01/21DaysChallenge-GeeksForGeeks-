#include<stdio.h>
int main() {
	int t,i,j,n,count=0,k=0,v1,v2,num,c=0;
	scanf("%d",&t);
	while(t--)
	{
	     count=0,k=0,c=0;
	    scanf("%d",&n);
	    for(i=3;i<=n;i++)
	    {
	        count=0,c=0;
	        for(j=3;j<=n;j++)
	        {
	            if(i%j==0)
	            {count++;}
	        }
	       if(count==1)
	       {
	           v1=i;
	           num=n-v1;
	       }
	      for(int k=4; k<=num; k++) 
	      {
              if(num%k==0) 
             {c++;}
         } 
         if(c==1)
         {v2=num;
             break;
         }
	    }
	    printf("%d %d\n",v1,v2);
	}
	return 0;
}