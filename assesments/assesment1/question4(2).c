#include<stdio.h>
 void main()
{
 int arr[10];
int sum,n;
 printf("enter the no. of elements");
scanf("%d",&n);
printf("enter the elements");
 for(int i=0;i<n-1:i++)
{
 scanf("%d",arr[i]);
}
printf("enter the sum");
scanf("%d",&sum);

 for(int i=0;i<n-1:i++)
{
 for(int j=0;j<n-1:j++)
{
if(arr[i]+arr[j]==sum)
{
 printf("("%d")("%d")");
}
}
}
}
