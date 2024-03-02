#include <iostream>

using namespace std;

int main() {
    int numProblems;
    cin >> numProblems;
    for(int curr = 0; curr < numProblems; curr++) {
        int numCoinTypes;
        int eMod;
        cin >> numCoinTypes >> eMod;
        
        int coinTypes[numCoinTypes][2];
        for(int j = 0; j < numCoinTypes; j++) {
            cin >> coinTypes[j][0] >> coinTypes[j][1];
        }
        
        int arrLength = eMod + 1;
        
        int matrix[arrLength][arrLength];
        matrix[0][0] = 0;
        for(int i = 0; i < arrLength; i++) {
            int j;
            if(i == 0) {
                j = 1;
            } else {
                j = 0;
            }
            for( ; j < arrLength; j++) {
                matrix[i][j] = 2147483647;
            }
        }
        
        int minNumCoins = 2147483647;
        
        int limit = 0;
        while(limit < arrLength) {
            int i = 0;
            int j = limit;
            bool swapped = false;
            while(i <= limit) {
                
                //evaluate start
                for(int icoin = 0; icoin < numCoinTypes; icoin++) {
                    int iprev = i - coinTypes[icoin][0];
                    int jprev = j - coinTypes[icoin][1];
                    
                    if(iprev >= 0 && jprev >= 0) {
                        int currDist = matrix[i][j];
                        int prevDist = matrix[iprev][jprev];
                        if(prevDist != 2147483647 && prevDist + 1 < currDist) {
                            matrix[i][j] = prevDist + 1;
                        }
                    }
                }
                if(i*i + j*j == eMod*eMod && matrix[i][j] < minNumCoins) {
                    minNumCoins = matrix[i][j];
                }
                //evaluate end
                
                if(i == j) {
                    i++;
                } else if(!swapped) {
                    int temp = i;
                    i = j;
                    j = temp;
                    swapped = !swapped;
                } else {
                    int temp = i;
                    i = j;
                    j = temp;
                    swapped = !swapped;
                    i++;
                }
            }
            
            limit++;
        }
        
        if(minNumCoins == 2147483647) {
            cout << "not possible";
        } else {
            cout << minNumCoins;
        }
        cout << "\n";

        if(curr != numProblems - 1) {
            string junk;
            getline(cin, junk);
        }
    }
    return 0;
}