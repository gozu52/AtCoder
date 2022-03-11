#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  
  vector<int> vec(n);
  int ave = 0;
  for(int i=0;i<n;i++){
      cin >> vec[i];
      ave += vec[i];
  }
  ave /= n;
  for(int i=0;i<n;i++){
      cout << abs(vec[i]-ave) << endl;
  }
}
