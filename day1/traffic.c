#include<stdio.h>
void main()
{
 int input;
 printf("enter the value");
 scanf("%d",&input);
if(input>=31)
{
 if(input%2==0)
{
printf("only even registered cars are permitted today");
}
else
{
printf("only odd registered cars are permitted today");
}
}
else
{
printf("invalid input");
}
}

