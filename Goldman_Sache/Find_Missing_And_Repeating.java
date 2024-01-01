import java.util.ArrayList;

class Find_Missing_And_Repeating {
    static int[] findTwoElement(int a[], int n) {
        int hash[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }
        int r = -1, m = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2)
                r = i;
            else if (hash[i] == 0)
                m = i;
            if (r != -1 && m != -1)
                break;
        }
        int re[] = new int[2];
        re[0] = r;
        re[1] = m;
        return re;
    }
    public static void main(String[] args) {
        int a [] = {1, 3, 3};
        int r [] = findTwoElement(a, a.length);
        for(int i:r){
            System.out.print(i+" ");
        }
    }
}