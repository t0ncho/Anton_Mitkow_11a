// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намери сумата на всички нечетни числа в интервала [x,y].


#include <stdio.h>
#include <stdlib.h>


int main () {
    int a;
    int b;
    int c=0;
    int i;
         printf("add first number ");
         scanf("%d",&a);
         printf("add second number ");
         scanf("%d",&b);
    
    for(i=a+1; i<=b;) {
            if(i%2 == 1) {
                c=c+i;
            }
                i++;
    }  
    printf("symata na vsi4ki nechetni chisla e  %d",c);
    while(1);
}
