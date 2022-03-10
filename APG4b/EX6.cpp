#include <bits/stdc++.h>
using namespace std;

void calc(int a, int b, string op){
    int ans = 0;
    bool flag = true;
    if(op == "?" || op == "=" || op == "!"){
        cout << "error" << endl;
        return;
    }
    if (op == "+") {
        ans = a+b;
    }else if(op == "-"){
        ans = a-b;
    }else if(op == "*"){
        ans = a*b;
    }else if(op == "/"){
        if(b==0){cout << "error" << endl;return;}
        ans = a/b;
    }
    cout << ans << endl;
}

int main() {
  int A, B;
  string op;
  cin >> A >> op >> B;
  calc(A,B,op);
}
