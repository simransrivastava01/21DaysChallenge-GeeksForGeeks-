#include <stdio.h>

int main() {
	int t,n,i,j;
	scanf("%d",&t);
	while(t--)
	{
	    scanf("%d",&n);
	    int arr[n][n];
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            scanf("%d",&arr[i][j]);
	        }
	    }
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            printf("%d ",arr[j][i]);
	        }
	    }
	    printf("\n");
	}
	return 0;
}
