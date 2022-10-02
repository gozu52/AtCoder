#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<int> l[200010];

int main() {
    int n,q;cin>>n>>q;
    for(int i=0;i<n;i++){
        int tmp;cin>>tmp;
        for(int j=0;j<tmp;j++){
            int num;cin>>num;
            l[i].push_back(num);
        }
    }
    for(int i=0;i<q;i++){
        int s,t;cin>>s>>t;s--;t--;
        cout<<l[s][t]<<endl;
    }
}