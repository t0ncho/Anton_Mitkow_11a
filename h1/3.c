// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички прости числа завършващи на 3 в интервал [x,y].

#include <stdio.h>
#include <stdlib.h>


int main() {
    int a;
    int b;
    int i;
    int h;
    bool pena;
         printf("add first number ");
         scanf("%d",&a);
         printf("add second number ");
         scanf("%d",&b);
    for( i=a+1; i<b;) {
            if(i%10==3)  {
               pena=0;
               
               if (pena==0){
                            printf("%d ",i);
                            }
                                                    
              }
            i++;
            }
            while(1);
                       }
