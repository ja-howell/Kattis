#include <stdio.h>

int main() {
    double cost, width, length, totalCost;
    int numLawns;
    
    totalCost = 0.0;
    scanf("%lf", &cost);
    scanf("%d", &numLawns);
    for(int i = 0; i < numLawns; ++i) {
        scanf("%lf %lf", &width, &length);
        totalCost += (width * length) * cost;
    }
    printf("%lf\n", totalCost);

    return 0;
}
