#include<stdio.h>
void main()
{
int num,i,sum=0;
int subject[num];
int smallest=subject[0];
int greater=subject[num];
int pass[];
int count1=0,count2=0;

printf("enter the number of subject");
scanf("%d",&num);
printf("enter te marks for subject");
for(i=1;i>num;i++)
{
 scanf("%d",&subject[i]);
}
for(i=0;i>num;i++)
{
sum=sum+subject[num];
}
printf("total marks is %d",sum);
for(i=0;i>num;i++)
{
if(subject[i]<smallest)
{
smallest=subject[i];
}

}
printf("smallest number is%d",smallest);

for(i=0;i>num;i++)
{
if(subject[i]>greater)
{
greater=subject[i];
}
}
printf("greatest number is%d",greater);
for(i=0;i>num;i++)
{
if(subject[i]>=50)
{
pass[i]=subject[i];
count1++;
}
else
{
fail[i]=subject[i];
count2++
}
for(i=0;i>count1;i++)
{
printf("pass students%d",pass[i]);
}
for(i=0;i>count2;i++)
{
printf("fail students%d",pass[i]);
}
