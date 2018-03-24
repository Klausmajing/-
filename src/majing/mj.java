package majing;

public class mj {
    String f()
	     {
	          int i=(int)(Math.random()*10);
	          int j=(int)(Math.random()*10);
	          if(i>=j)
	          {
	             int temp=i;
	             i=j;
	             j=temp;
	         }
	         return("("+i+"/"+j+")");
	     }
	     public static void main(String[] args)
	     {
	         String a,b;
	         int k;
	         mj lianxi=new mj();
	         for(int n=0;n<30;n++)
	         {
	             a=lianxi.f();
	             b=lianxi.f();
	             int i=(int)(Math.random()*100);
	             int j=(int)(Math.random()*100);
	             switch((int)(Math.random()*4))
	             {
	             case 0:
	               k=(int)(Math.random()*3);
	                 if(k==0)
	                    System.out.println(i+"+"+j+"=");
	                 else if(k==1)
	                    System.out.println(a+"+"+j+"=");
	                 else if(k==2)
	                        System.out.println(b+"+"+a+"=");
	                 break;
	             case 1:
	                 k=(int)(Math.random()*3);
	                 if(i<j)
	                 {
	                     int temp=i;
	                     i=j;
	                     j=temp;
	                 }
	                     if(k==0)
	                         System.out.println(i+"-"+j+"=");
	                     else if(k==1)
	                         System.out.println(j+"-"+a+"=");
	                     else if(k==2)
	                         System.out.println(b+"-"+a+"=");
	              break;
	             case 2:
	                 k=(int)(Math.random()*3);
	                    if(k==0)
	                        System.out.println(i+"*"+j+"=");
	                     else if(k==1)
	                        System.out.println(a+"*"+j+"=");
	                     else if(k==2)
	               break;
	             case 3:
	             while(j==0)
	               j= (int)(Math.random()*100);
	              System.out.println(i+"/"+j+"=");
	               break;
	               }
	         }
	     }
}
	    

