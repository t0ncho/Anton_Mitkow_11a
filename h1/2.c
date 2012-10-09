// Технологично училище "Електронни системи" към Технически университет - София (www.elsys-bg.org)
// 11 А клас
// Номер 2
// Антон Андреев Митков
// Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намери и изведе сумата на числата делящи се на 17 в интервал [x, y].

#include <stdio.h>
#include <stdlib.h>


main() {
       int a;
       int b;
       int c=0;
       int i; 
             printf("add first number ");
             scanf("%d",&a);
             printf("add second number ");
             scanf("%d",&b);
       
        for(i=a+1; i<=b;){
                   if(i%17 == 0){
                     c=c+i;    
                   }
                   i++;
       }
           printf("symata na chislata delqshti se na 17 e  %d ",c);
       while(1);
}
