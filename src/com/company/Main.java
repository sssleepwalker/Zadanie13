package com.company;

public class Main
{
    public static double getRandomNumber( double min, double max)
    {
        double kiwon = (int) (Math.random()* ((max- min)+ 1)) + min;
        return kiwon;
    }
    public static void main(String[] args)
    {
        int [][] meow =  new int[10 ][ 10];
        for( int kiho = 0; kiho < meow.length; kiho++)
        {
            for( int y = 0; y < meow.length; y++)
            {
                meow[kiho][y]= (int)getRandomNumber(0, 99);
                System.out.print(meow[kiho][y] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int minwon = 0; minwon < 10; minwon++)
        {
            for(int kiho = 0; kiho < 9; kiho++)
            {
                for(int ki = kiho + 1; ki < 10; ki++)
                {
                    if(meow[kiho][minwon]> meow[ki][minwon])
                    {
                        int temp = (int)meow[kiho][minwon];
                        meow[kiho][minwon]= meow[ki][minwon];
                        meow[ki][minwon]=temp;
                    }
                }
            }
        }
        for(int brr =0; brr< meow.length; brr++)
        {
            for(int mrr =0; mrr < meow.length; mrr++)
            {
                System.out.print(meow[brr][mrr]+"\t");
            }
            System.out.println();
        }
    }
}