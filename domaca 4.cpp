#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define N 20

int main()
{

srand(time(NULL));
int arr[N];

int s;
for(s=0;s<N;s++)
{
	arr[s]=rand()%10000+10; //generovanie nahodnych cisel
}

for(s=0;s<N;s++)
{
	printf("%d ", arr[s]); //vypiseme vygenerovane cisla
}

int count=0;
for(s=0;s<N;s++)
{
	if(arr[s]%2==0)
	{
		count++;
	}
}
printf("\nEven: %d odd: %d", count, N-count); //vypis poctu parnych a neparnych cisel

int twodigit=0, threedigit=0, fourdigit=0; 
for(s=0;s<N;s++)
{
	if(arr[s]<100)
	{
		twodigit++;		
	}
	if(arr[s]<1000 && arr[s]>=100)
	{
		threedigit++;		
	}
	if(arr[s]<10000 && arr[s]>=1000)
	{
		fourdigit++;		
	}
}
printf("\ntwodigits: %d \nThree digits: %d\nFourdigits: %d", twodigit, threedigit, fourdigit); //vypis podla poctu cifier v cisle

int min=9999;
int max=10;

for(s=0;s<N;s++)
{
	if(arr[s]<min)
	{
		min=arr[s];
	}
	if(arr[s]>max)
	{
		max=arr[s];
	}
}
printf("\nMax : %d \nMin : %d", max, min); //vypiseme najvacsie a najmensie cislo

printf("\nFrom behind: ");
for(s=N-1;s>=0;s--)
{
	printf("%d ", arr[s]); //vypiseme vygenerovane cisla odzadu
}

printf("\nPalindroms:  ");
int ccount=0; //sluzi pre pocet palindromov 
for(s=0;s<N;s++)
{
	int a=arr[s]%10;
	int b=arr[s]/10;
	int c=arr[s]/100;
	int d=(arr[s]%100)/10;
	int e=(arr[s]%1000)/100;
	int f=arr[s]/1000;
	
	
	if(arr[s]>10 && arr[s]<100) //vypis palindromov
	{
		if(a==b)
		{
			printf("%d ", arr[s]);
			ccount++;
		}
	}
	if(arr[s]>100 && arr[s]<1000)
	{
		if(a==c)
		{
			printf("%d ", arr[s]);
			ccount++;
		}
	}
	if(arr[s]>100 && arr[s]<1000)
	{
		if(a==f && d==f)
		{
			printf("%d ", arr[s]);
			ccount++;
		}
	}
	
}
if(ccount==0)
{
	printf("none");//vypise ak nieje ziadne cislo palindrom
}

int del7=0; 
for(s=0;s<N;s++)// zisti kolko cisel je delitelnych cislom 7
{
	if(arr[s]%7==0)
	{
		del7++;
	}
}
printf("\nDelitelne 7: %d", del7);

return 0;

}
