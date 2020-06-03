#include<stdio.h>
#include<conio.h>

void main()
{
int num, sum=0,x;
printf("enter the number");
scanf("%d",num);
while(num>0)
{
x=num%10
sum=sum+x;
num=num/10;
}
printf("exit door number will be",num);
}