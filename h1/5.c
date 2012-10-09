// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Да се разработи програма, която изисква от потребителя да въведе целочислено число, x, където 0 < x < 10. Да се инициализират масива от 10 елемента. Стойностите на елементите на масива да са равни на косинус от индекса на елемента. Да се изведе масивът, след което да се сортира в низходящ ред и отново да се изведе.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(){
       int x;
       float arr[100];
       int i;
       int a;
       int b;
       float temp;
       
       printf("x= ");
       scanf("%d",&x);
       
       if((x>0) && (x<10)){
       
                printf("razbarkano \n");
       for (i=0; i<x; ++i){
					arr[i] = cos(i);
					printf("%f \n ", arr[i]);
				}
				
				printf("Sortirano \n");
				
					for (a=(x-1); a>0; a--){
					for (b=1; b<=a; b++){
						if (arr[b-1] < arr[b]){
							temp = arr[b-1];
							arr[b-1] = arr[b];
							arr[b] = temp;
						}
					}
				}
				for (i=0; i<x; i++){
					printf("%f \n", arr[i]);	
				}
				
       }
       while(1);
       }

