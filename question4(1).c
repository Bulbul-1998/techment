#include<stdio.h>
 void main()
{
  int i,num,odd_sum=0,even_sum=0,arr[];
 printf("enter the number of elements");
 scanf("%d",num);
 printf("enter the elements");
 for(i=;i<num;i++) 
 {
  scanf("%d",arr[i]);
  if(arr[i]%2==0)
  {
   even_sum=even_sum+arr[i];
   }
 else
  {
   odd_sum=odd_sum+arr[i];
  }
 }
printf("sum of all even numbers are %d",even_sum);
printf("sum of all odd numbers are %d",even_sum);
}

