#include <stdio.h>
int main()
{	
int a, b, c;


printf("Enter first: ");
scanf("%d", &a);
printf("Enter second: ");
scanf("%d", &b);
printf("Enter third: ");
scanf("%d", &c);

if(a+b>c || a+c>b || b+c>a)
{
	printf("yes");
}
else
{
	printf("no");
}
}

