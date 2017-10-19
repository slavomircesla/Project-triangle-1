#include <stdio.h>

int main()
{
int a, b, c;

printf("Enter first length: ");
scanf ("%d", &a);
printf("Enter second length: ");
scanf ("%d", &b);
printf("Enter third length: ");
scanf ("%d", &c);

if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
{
	pirntf("ano");
}
else
{
		printf("nie")
}
}
