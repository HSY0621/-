package p1;

import java.util.Scanner;

public class ZeroOnePack {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 				//��Ʒ����
        int c = sc.nextInt();               //��������
        
        int[] w = new int[n + 1];           //��Ʒ����
        for (int i = 1; i <= n; i++)
            w[i] = sc.nextInt();

        int[] v = new int[n + 1];           //��Ʒ��ֵ
        for (int i = 1; i <= n; i++)
            v[i] = sc.nextInt();
        
        int[][] m = new int[n + 1][c + 1];  //״̬��
        knapsack(v, w, c, n, m);
        int[] x = new int[n + 1];           //���ɽ�
        traceback(m, w, c, n, x);

        for (int i = 1; i <= n; i++)
            System.out.print(x[i] + " ");
    }

    /*
     * ����״̬��
     */
    public static void knapsack (int[] v, int[] w, int c, int n, int[][] m) {
        //��ʼ��
        int iMax = Min(w[n] - 1, c);
        for (int i = 0; i <= iMax; i++)
            m[n][i] = 0;
        for (int i = w[n]; i <= c; i++)
            m[n][i] = v[n];

        for (int i = n - 1; i > 1; i--) {
            iMax = Min(w[i] - 1, c);
            for (int j = 0; j <= iMax; j++)
                m[i][j] = m[i + 1][j];
            for (int j = w[i]; j <= c; j++)
                m[i][j] = Max(m[i + 1][j], m[i + 1][j - w[i]] + v[i]);
        }
    }

    /*
     * �������Ž�
     */
    public static void traceback (int[][] m, int[] w, int c, int n, int[] x) {
        for (int i = 1; i < n; i++)
            if (m[i][c] == m[i + 1][c])
                x[i] = 0;
            else {
                x[i] = 1;
                c -= w[i];
            }
        x[n] = (m[n][c] > 0) ? 1 : 0;
    }

    public static int Min (int a, int b) {
        return a < b ? a : b;
    }

    public static int Max (int a, int b) {
        return a > b ? a : b;
    }
}
