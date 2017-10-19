#include <stdio.h>
#include <math.h>

int main()
{

int d, m;

printf("Enter a day in a Month:\n ");
scanf("%d", &d);
printf("Enter a Month:\n ");
scanf("%d", &m);

switch(m)
	{
		case 1: if(d>0 && d<=20)
					{
						printf("Kozorozec");
					}else
						{
							if(d>=21 && d<=31)
							{
								printf("Vodnar");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 2: if(d>0 && d<=19)
					{
						printf("Vodnar");
					}else
						{
							if(d>=20 && d<=29)
							{
								printf("Ryby");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 3: if(d>0 && d<=20)
					{
						printf("Ryby");
					}else
						{
							if(d>=21 && d<=31)
							{
								printf("Baran");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 4: if(d>0 && d<=20)
					{
						printf("Baran");
					}else
						{
							if(d>=21 && d<=30)
							{
								printf("Byk");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 5: if(d>0 && d<=20)
					{
						printf("Byk");
					}else
						{
							if(d>=21 && d<=31)
							{
								printf("Blizenci");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 6: if(d>0 && d<=20)
					{
						printf("Blizenci");
					}else
						{
							if(d>=21 && d<=30)
							{
								printf("rak");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 7: if(d>0 && d<=22)
					{
						printf("Rak");
					}else
						{
							if(d>=23 && d<=31)
							{
								printf("Lev");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 8: if(d>0 && d<=22)
					{
						printf("Lev");
					}else
						{
							if(d>=23 && d<=31)
							{
								printf("Panna");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 9: if(d>0 && d<=22)
					{
						printf("Panna");
					}else
						{
							if(d>=23 && d<=30)
							{
								printf("Vahy");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 10: if(d>0 && d<=22)
					{
						printf("Vahy");
					}else
						{
							if(d>=23 && d<=31)
							{
								printf("Skorpion");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 11: if(d>0 && d<=22)
					{
						printf("Skorpion");
					}else
						{
							if(d>=23 && d<=30)
							{
								printf("Strelec");
							}else
								{
									printf("Invalid day");
								}
						} break;
		case 12: if(d>0 && d<=21)
					{
						printf("Strelec");
					}else
						{
							if(d>=22 && d<=31)
							{
								printf("Kozorozec");
							}else
								{
									printf("Invalid day");
								}
						} break;
		default: printf("Invalid month");
	}
return 0;
}

