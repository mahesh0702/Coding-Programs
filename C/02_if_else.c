// Write a program to make if - else statement
#include <stdio.h>
#include <conio.h>
int main()
{
    int age;
    printf("Enter the age voter person :");
    scanf("%d",&age);
    if (age >= 18)
    {
        printf("You can vote!");
    }
    else
    {
        printf("age is less than 18 then you can not vote!;");
    }
}