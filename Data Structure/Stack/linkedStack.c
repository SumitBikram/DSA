/**************************************************
 *   Implementation of STACK using Linked List...  *
 ***************************************************/
#include <stdio.h>
#include <stdlib.h>

typedef enum
{
    false,
    true
} boolean;

typedef struct node
{
    int info;
    struct node *next;
} stack;

//
// There are six operations in the stack implementation
//     1) Creating an empty stack
//     2) isEmpty()    - to check underflow
//     3) Push()       - to insert an element
//     4) Pop()        - to delete an element
//     5) peek()       - to access the top element
//     6) dispose()    - to destroy the Linked stack
//
//      In Linked stack overflow conditon does not occur
//      generally as it can grow to computer's memory...
//

// 1) Creating an empty stack
void createEmptyStack(stack **top)
{
    *top = NULL;
}

// 2) isEmpty() - to check underflow
boolean isEmpty(stack *top)
{
    return ((top == NULL) ? true : false);
}
// 3) Push() - to insert an element
void push(stack **top, int element)
{
    stack *ptr;
    ptr = (stack *)malloc(sizeof(stack));
    if (ptr == NULL)
    {
        printf("\nUnable to allocate the memeory.\n");
        return;
    }
    ptr->info = element;
    ptr->next = (*top);
    *top = ptr;
}

// 4) Pop() - to delete an element
int pop(stack **top)
{
    int temp;
    stack *ptr;
    temp = (*top)->info;
    ptr = *top;
    *top = (*top)->next;
    free(ptr);
    return temp;
}
// 5) peek() - to access the top element
int peek(stack *ps)
{
    return (ps->info);
}
// 6) dispose() - to destroy the Linked stack
void dispose(stack **ps)
{
    stack *ptr;
    while ((*ps) != NULL)
    {
        ptr = *ps;
        (*ps) = (*ps)->next;
        free(ptr);
    }
}

// to show the current stack
void showStack(stack *top)
{
    if (top == NULL)
    {
        printf("\n\n\nTop--->\n");
        printf("\t|_____|\n");
        printf("\nEmpty Stack...\n\n\n\n\n");
    }
    else
    {
        printf("\n\n\nTop--->\n");
        // traversing the linked stack
        stack *ptr;
        ptr = top;
        while (ptr != NULL)
        {
            printf("\t|%5d\t|\n", ptr->info);
            ptr = ptr->next;
        }
        printf("\t---------");
        printf("\n\n\n\n\n");
    }
}
int main()
{
    stack *top;
    createEmptyStack(&top);

    while (1)
    {
        int ch, value;
        printf("++++++++++++++++++++++++++++++\n");
        printf("\tAvailable Options :");
        printf("\n++++++++++++++++++++++++++++++");

        printf("\n\t1. Push\n\t2. Pop \n\t3. Peek  \n\t4. Exit");
        printf("\nChoose your option(1 - 4):\t");

        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            // Push operation...
            printf("\nEnter the element to insert:\t");
            scanf("%d", &value);
            push(&top, value);

            system("cls");
            printf("%d is inserted onto the stack\n", value);
            showStack(top);
            break;

        case 2:
            // Pop operation
            system("cls");
            if (isEmpty(top))
            {
                printf("\nSTACK is Underflow.\n\n\n\n");
                printf("Top--->\n");
                printf("\t|_____|\n\n\n\n");
            }
            else
            {
                printf("\n%d is popped.\n", pop(&top));
                showStack(top);
            }
            break;
        case 3:
            system("cls");
            if (isEmpty(top))
            {
                printf("\nSTACK is empty.\n\n\n\n");
                printf("Top--->\n");
                printf("\t|_____|\n\n\n\n");
            }
            else
            {
                printf("\nTop element of the stack is %d.\n", peek(top));
                showStack(top);
            }
            break;
        case 4:
            dispose(&top);
            system("cls");
            exit(0);
            break;

        default:
            system("cls");
            printf("\n****Wrong Input!!****\n");
            showStack(top);
            break;
        }
    }
    return 0;
}