import java.util.Scanner;
class std{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  String str="mxi";//-
        //  String str1="mani";//+
        // System.out.println(str.compareTo(str1));
        // //System.out.println(str1.compare());

        String std[]=new String[]{"partha","venkatesh","mani","seeni","kumaran","yogesh","iyappan","vijay","kodi","gogul"};
//-------Using Selection sort------------
        for(int i=0;i<std.length;i++)
        {
            //String min=std[i];
            int minInd=i;
            for(int j=i+1;j<std.length;j++)
            {
                if(std[minInd].compareTo(std[j])>0)//< desending  ---- > asending
                {
                    //min=std[j];
                    minInd=j;
                }
            }
            //---swap---
            String t=std[i];
            std[i]=std[minInd];
            std[minInd]=t;
        }
        for(int i=0;i<std.length;i++)
        System.out.println(std[i]);
    }  
}
/*
    -----small and big--------
      String sm=std[0];
        for(int i=1;i<std.length;i++)
        {
            if(sm.compareTo(std[i])>0)
            {
                sm=std[i];
            }
        }
        System.out.println(sm);
 */