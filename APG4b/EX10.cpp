#include <bits/stdc++.h>
using namespace std;

void graphPrint(int num){
    while(num>0){num--;cout << "]";}
    cout << endl;
}
int main() {
  int A, B;
  cin >> A >> B;
  cout << "A:";
  graphPrint(A);
  cout << "B:";
  graphPrint(B);  
}
