#include <bits/stdc++.h>
using namespace std;

int main() {
  int p,price;
  string text = "";
  
  cin >> p;
  if (p == 1) cin >> price;
  else cin >> text >> price;

  int N;
  cin >> N;
  if(text != "")cout << text << "!" << endl;
  cout << price * N << endl;
}
