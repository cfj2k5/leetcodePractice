#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <limits.h>


/* I already had a solution to this using strings. This solution
 * get messed up somewhere along the way of large numbers
 *
 */
int reverseNum(int x);

int main(void)
{
	int num = 5103982189;
	printf("This is the reverse of %d: %d\n", num, reverseNum(num));
	return 0;
}

int reverseNum(int x){
	if(x >= INT_MAX){
		return 0;
	}
    int absNum = abs(x);
    int reverseNum = 0;
    int i = 0;
    for(i = 0; x % (int)pow(10,i) != x; i++){
        reverseNum = reverseNum * 10 + absNum % 10;
        absNum /= 10;
    }
    if(x < 0){
	reverseNum *= -1;
    }
    return reverseNum;	
}
