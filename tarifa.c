#include <stdio.h>

int main() {

    int mb, months, i, total, mbUsed;

    scanf("%d %d", &mb, &months);
    total = mb * (months+1);
    for(i = 0; i < months; ++i) {
        scanf("%d", &mbUsed);
        total = total - mbUsed;
    }
    printf("%d\n", total);

    return 0;

}
