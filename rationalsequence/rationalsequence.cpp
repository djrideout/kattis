#include <iostream>

using namespace std;

int main() {
    int numSets;
    cin >> numSets;
    for(int i = 0; i < numSets; i++) {
        int set;
        int num;
        int den;
        
        string numDenString;
        cin >> set >> numDenString;
        num = stoi(numDenString.substr(0, numDenString.find("/")));
        den = stoi(numDenString.substr(numDenString.find("/") + 1));
        
        //take care of the outlier case
        //(when next element in seq is in next level of tree)
        if(den == 1) {
            cout << set << " 1/" << num + 1 << "\n";
            continue;
        }
        //take care of the rest of the cases
        bool leftChildVisited = false;
        int levelsClimbed = 0;
        while(!leftChildVisited) {
            if(den > num) { //this is a left child
                den = den - num;
                levelsClimbed++;
                leftChildVisited = true;
            } else { //this is a right child
                num = num - den;
                levelsClimbed++;
            }
        }
        bool hasGoneRight = false;
        while(levelsClimbed > 0) {
            if(!hasGoneRight) { //must go right once, then always go left
                num = num + den;
                levelsClimbed--;
                hasGoneRight = true;
            } else {
                den = den + num;
                levelsClimbed--;
            }
        }
        cout << set << " " << num << "/" << den << "\n";
    }
    return 0;
}