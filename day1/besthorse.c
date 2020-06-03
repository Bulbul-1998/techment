#include<stdio.h>
void main()
{
float horse1,horse2,horse3;
printf("Enter the weight of three horses");
scanf("%f%f%f",&horse1,&horse2,&horse3);
/*if any two horses are of same weight"*/
if(horse1==horse2||horse2 ==horse3||horse3==horse1)
{
 printf("entered weight are not distinct values");
}
else if(horse1>horse2&&horse1>horse3)
{
printf("horse 1 has maximum weight that is",h1);
}

else if(horse2>horse1&&horse2>horse3)
{
printf("horse 2 has maximum weight that is",h2);
}
else
{
print(" horse 3 has maximum weight that is",h3);
}
}
