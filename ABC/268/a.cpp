#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    set<int> st;
    for(int i=0;i<5;i++){
        int tmp;cin>>tmp;
        st.insert(tmp);
    }
    cout<<st.size()<<endl;
}