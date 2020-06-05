#include<stdio.h>
void main()
{
int arr[]={1,2,4,7,4,7,9,6}
int length=sizeof(arr)/sizeof(arr[0]);
printf("duplicate elements are");
for(int i=0;i<length;i++)
{
 for(int j=i+1;j<length;j++)
 {
  if(arr[i]==arr[j])
  {
   print("%d",arr[i]);
  }
 }
}
