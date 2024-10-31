/****************************************
 *   Counting Set Bits of a number       *
 *   from it's binary Representation     *
 *****************************************/
#include <stdio.h>
#include <stdlib.h>

void binaryRepresentation(int num);
int countSetBit(int num);

void main()
{
    while (1)
    {
        int ch, num, count = 0;
        printf("\n\n\n++++++++++++++++++++++++++++++\n");
        printf("\tAvailable Options :");
        printf("\n++++++++++++++++++++++++++++++");

        printf("\n\t1. Continue,\n\t2. Exit.");
        printf("\nChoose your option(1 - 2):\t");
        scanf("%d", &ch);
        system("cls");
        switch (ch)
        {
            {
            case 1:
                printf("Enter a non (-ve) number: ");
                scanf("%d", &num);
                printf("\nBinary representation of %d is:\t", num);
                binaryRepresentation(num);
                printf("\nNumber of setBits in %d is: %d", num, countSetBit(num));
                break;

            case 2:
                system("cls");
                exit(0);
                break;

            default:
                break;
            }
        }
    }
}

void binaryRepresentation(int num)
{
    if (num < 2)
    {
        printf("%d", num);
    }
    else
    {
        binaryRepresentation(num / 2);
        printf("%d", num % 2);
    }
}

int countSetBit(int num)
{
    // Brian Karnighan algorithm…
    int count = 0;
    while (num)
    {
        num &= (num - 1);
        count++;
    }
    return count;
}