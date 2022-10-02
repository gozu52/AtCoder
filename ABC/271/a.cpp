#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    stringstream s;
    s<<hex<<n;
    string ans = s.str();
    if(ans.length()>1)ans = "0"+ans;
    ans = regex_replace(ans,regex("a"),"A");
    ans = regex_replace(ans,regex("b"),"B");
    ans = regex_replace(ans,regex("c"),"C");
    ans = regex_replace(ans,regex("d"),"D");
    ans = regex_replace(ans,regex("e"),"E");
    ans = regex_replace(ans,regex("f"),"F");
    cout<<ans<<endl;
}