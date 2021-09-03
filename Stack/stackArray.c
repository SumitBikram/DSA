/********************************************
*   Implementation of STACK using Array...  *
*********************************************/
#include <stdio.h>
#include <stdlib.h>
#define MAX 10

typedef enum {false, true} boolean;
typedef struct{
    int top;
    int element[MAX];
}stack;


// There are six operations in the stack implementation
//     1) Creating an empty stack
//     2) isEmpty()    - to check underflow
//     3) isFull()     - to check overflow
//     4) Push()       - to insert an element
//     5) Pop()        - to delete an element
//     6) peek()       - to access the top element


//Creating an empty stack
void createEmptyStack(stack *ps){
    ps->top = -1;
}
// isEmpty()    - to check underflow
boolean isEmpty(stack *ps){
    return ((ps->top == -1) ? true : false);
}
// isFull()     - to check overflow
boolean isFull(stack *ps){
    return ((ps->top == MAX-1)? true : false);
}
// Push()       - to insert an element
void push(stack *ps, int element){
    ps->element[++ps->top] = element;
}
// pop()        - to delete an element
int pop(stack *ps){
    return (ps->element[ps->top--]);
}
// peek()       - to access the top element
int peek(stack *ps){
    return (ps->element[ps->top]);
}
void showStack(stack *ps){
    if(ps->top == -1){
        printf("\n\n\nTop--->\n");
        printf("\t|_____|\n");
		printf("\nEmpty Stack...\n\n\n\n\n");
    }else{
        printf("\n\n\nTop--->\n");
        for(int i = (ps->top); i >= 0; i--){
            printf("\t|%5d\t|\n", ps->element[i]);
        }
        printf("\t---------");
        printf("\n\n\n\n\n");
    }
}
int main(){
    stack s;
    createEmptyStack(&s);
    while (1){
        int ch, value;
        printf("++++++++++++++++++++++++++++++\n");
        printf("\tAvailable Options :");
        printf("\n++++++++++++++++++++++++++++++");

        printf("\n\t1. Push\n\t2. Pop \n\t3. Peek  \n\t4. Exit");
        printf("\nChoose your option(1 - 4):\t");

		scanf("%d", &ch);
        switch (ch) {
            case 1:
                // Push operation...
                if(isFull(&s)){
                    printf("\nSTACK is Overflow.\n\n\n\n");
                }else{
                    printf("\nEnter the element to insert:\t");
                    scanf("%d", &value);
                    push(&s, value);
                }
                system("cls");
                printf("%d is inserted onto the stack\n", value);
                showStack(&s);
                break;
            case 2:
                // Pop operation
                system("cls");
                if(isEmpty(&s)){
                    printf("\nSTACK is Underflow.\n\n\n\n");
                    printf("Top--->\n");
                    printf("\t|_____|\n\n\n\n");
                }else{
                    printf("\n%d is popped.\n", pop(&s));
                    showStack(&s);
                }
                break;
            case 3:
                system("cls");
                if(isEmpty(&s)){
                    printf("\nSTACK is empty.\n\n\n\n");
                    printf("Top--->\n");
                    printf("\t|_____|\n\n\n\n");
                }else{
                    printf("\nTop element of the stack is %d.\n", peek(&s));
                    showStack(&s);
                }
                break;
            case 4:
                system("cls");
                exit(0);
                break;

            default:
                system("cls");
                printf("\n****Wrong Input!!****\n");
                showStack(&s);
                break;
        }
    }
    return 0;
}