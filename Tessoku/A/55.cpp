#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int q,query,x;
set<int> st;

int main() {
    cin>>q;
    while(q-->0){
        cin>>query>>x;
        if(query==1)st.insert(x);
        if(query==2)st.erase(x);
        if(query==3)cout<<(st.lower_bound(x)!=st.end()?(*st.lower_bound(x)):-1)<<endl;
    }
}