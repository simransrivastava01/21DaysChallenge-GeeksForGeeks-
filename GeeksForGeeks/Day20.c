#include<stdio.h>
int main() {
		int t,i,j,count=0,n,val;
	scanf("%d",&t);
	while(t--)
	{
	    val=0;
	    scanf("%d",&n);
	    int arr[n];
	    for(i=0;i<n;i++)
	    {scanf("%d",&arr[i]);}
	  
	    for(i=0;i<n;i++)
	    {
	        val=val^arr[i];
	    }
	    printf("%d\n",val);
	}
	return 0;
}