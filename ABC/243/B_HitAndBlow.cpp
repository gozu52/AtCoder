#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;
    vector<int> a(n), b(n);
    for(auto&e :a)cin >> e;
    for(auto&e :b)cin >> e;
    int cnt1 = 0, cnt2 =0;
    for(int i=0;i<n;i++)if(a[i] == b[i])cnt1++;
    cout << cnt1 << endl;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j)continue;
            if(a[i] == b[j])cnt2++;
        }
    }
    cout << cnt2 << endl;
}