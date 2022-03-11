#include <bits/stdc++.h>
using namespace std;

int main() {
  int N, A;
  cin >> N >> A;
  int cnt =0, ans = A;
  bool flag = true;
  while(cnt<N){
      cnt++;
      int B;
      string op;
      cin >> op >> B;
      if(op=="+"){
          ans += B;
      }else if(op=="-"){
          ans -= B;
      }else if(op=="*"){
          ans *= B;
      }else if(op=="/"){
          if(B==0){cout << "error" << endl;break;}
          else ans /= B;
      }
      cout << cnt << ":" << ans  << endl;
    }
}
