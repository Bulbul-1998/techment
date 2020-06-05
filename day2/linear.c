#incluse<stdio.h>
void main()
{
 int search,num,i;
 int array[50];
 printf("enter the number of elements");
 scanf("%d",&num);
 printf("Enter the elements of array");
for(i=0;i<num;i++)
{
 scanf("%d",&array[i]);
}
printf("enter the number to search");
scanf("%d",&search);
for(j=0;j<num;i++)
{
 if(search==array[i]);

{
printf("%d is the required element",array[i]);
break;
}
}
}
