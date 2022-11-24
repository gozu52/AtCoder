#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define all(x) (x).begin(),(x).end()

using namespace std;
using ll = long long;
using ld = long double;
using P = pair<int,int>;
using PL = pair<ll,ll>;
const int INF = 1e9;
const ll INFL = 1e18;
const int dx[4] = {1,0,-1,0};
const int dy[4] = {0,1,0,-1};
// cout<<fixed<<setprecision(10);
int n;
string s;
set<string> st;

bool f1(char c){
    if(c=='H')return true;
    if(c=='D')return true;
    if(c=='C')return true;
    if(c=='S')return true;
    return false;
}

bool f2(char c){
    if(c=='A')return true;
    if(c=='2')return true;
    if(c=='3')return true;
    if(c=='4')return true;
    if(c=='5')return true;
    if(c=='6')return true;
    if(c=='7')return true;
    if(c=='8')return true;
    if(c=='9')return true;
    if(c=='T')return true;
    if(c=='J')return true;
    if(c=='Q')return true;
    if(c=='K')return true;
    return false;
}

bool f(string str){
    return (f1(str[0])&&f2(str[1])?true:false);
}

int main(){
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>s;st.insert(s);
        if(!f(s)){
            cout<<"No"<<endl;
            return 0;
        }
    }
    cout<<(st.size()==n?"Yes":"No")<<endl;
    return 0;
}