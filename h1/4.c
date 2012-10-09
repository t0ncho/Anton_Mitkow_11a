// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички числа на Фибоначи в интервала [x, y].

#include <stdio.h>
#include <stdlib.h>

int main () {
    int a;
    int b;
    int c=1;
    int i=0;
         printf("add first number ");
         scanf("%d",&a);
         printf("add second number ");
         scanf("%d",&b);
         
         while(i<b){
                  i=a+c;
                  a=c;
                  c=i;
                  if(i<b){
                   printf("%d \n",i);
                   }
                  }   
               
                  
      while(1);
      }
