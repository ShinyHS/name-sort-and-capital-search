import java.util.Scanner;
class state{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=6;
       String state[]=new String[]{"jammukasmir","karnataka","kerala","maharastra","tamilnadu","westbengal"};
       String cap[]=new String[]{"srinagar","bengalore","thiruvanandhapuram","mumbai","chennai","kolkatta"};
       String s="westbengal";
       int l,r,m;
       int flag=0;
    //    for(int i=0;i<state.length;i++)
    //    {
    //         if(s.compareTo(state[i])==0)
    //         System.out.println(cap[i]);
    //    }
        l=0;
        r=n-1;
       for(int i=0;i<n;i++)
            {
                m=(l+r)/2;
                if(s.compareTo(state[m])==0)
                {
                    System.out.println("searching capital is "+cap[m]);
                    flag=1;
                    break;
                }
                else if(s.compareTo(state[m])<0)
                r=m-1;
                else if(s.compareTo(state[m])>0)
                l=m+1;
            } 
            if(flag==0)
            System.out.println("invaild input...!");     
    }  
}