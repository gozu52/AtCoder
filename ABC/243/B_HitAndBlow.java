public class B_HitAndBlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        for(int i=0;i<n;i++)b[i] = sc.nextInt();
        sc.close();
        int ans1 = 0, ans2 = 0;
        for(int i=0;i<n;i++){
            if(a[i]==b[i])ans1++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                if(a[i]==b[j])ans2++;
            }
        }
        System.out.println(ans1+"\n"+ans2);
    }
}
