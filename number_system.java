import javax.print.DocFlavor;
import java.util.*;
public class number_system {


  static void decimal_to_binary(int x){
    int a[]=new int[20];
    int y=x;
    int j=0;
    while(x>0){
        a[j]=x%2;
        x=x/2;
        j++;
    }
    if(y>=8){
        for(int i=j-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
    else {
        for(int i=j;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }

    };
static void decimal_to_octal(int y){
    int a[]=new int[20];
    int x=y;
    int j=0;
    while(x>0){
        a[j]=x%8;
        x=x/8;
        j++;
    }

        for(int i=j-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }



};

static void binary_to_decimal(int b){
    int a[] = new int[10];
    int j=0;
    while(b>0){
        a[j]=b%10;
        b=b/10;
        j++;
    }
    double sum=0;
    for(int i=j-1;i>=0;i--)
    {
        sum=sum+a[i]*Math.pow(2,i);
    }
    System.out.println(sum);
    //int ans=(int)sum;

};

static void octal_to_decimal(int o){
    int a[] = new int[10];
    int j=0;
    while(o>0){
        a[j]=o%10;
        o=o/10;
        j++;
    }
    double sum=0;
    for(int i=j-1;i>=0;i--)
    {
        sum=sum+a[i]*Math.pow(8,i);
    }
    System.out.println(sum);

};


static String Decimal_to_Hexadecimal(int d)
{
       int temp;
       String h="";

       while(d>0){
          temp=d%16;
          d=d/16;
          if(temp==10){
              h="A"+h;
          }
          else if(temp==11){
              h="B"+h;
          }
          else if(temp==12){
              h="C"+h;
          }
          else if(temp==13){
              h="D"+h;
          }
          else if(temp==14){
              h="E"+h;
          }
          else if(temp==15){
              h="F"+h;
          }
          else {
              h=Integer.toString(temp)+h;
          }

       }

    System.out.println(h);
       return h;
};

   static int CHAR_to_INT(char c) {
        switch (c) {
            case '1':
                return 1;

            case '2':
                return 2;

            case '3':
                return 3;

            case '4':
                return 4;

            case '5':
                return 5;

            case '6':
                return 6;

            case '7':
                return 7;

            case '8':
                return 8;

            case '9':
                return 9;

            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;

            case 'E':
                return 14;

            case 'F':
                return 15;

        }
        return 0;
    }
static void hexadecimal_to_decimal(String s){
  char[] ch=s.toCharArray();
  double d=0;
  int size=ch.length;
  int[] a=new int[size];
  for(int i=size-1;i>=0;i--){
//       if(ch[i]=='A'){
//           a[i]=10;
//       }
//       else if(ch[i]=='B'){
//           a[i]=11;
//       }
//       else if(ch[i]=='C'){
//           a[i]=12;
//       }
//       else if(ch[i]=='D'){
//           a[i]=13;
//       }
//       else if(ch[i]=='E'){
//           a[i]=14;
//       }
//       else if(ch[i]=='F'){
//           a[i]=15;
//       }
//       else {
//           a[i]=ch[i];
//       }
//
//
//       didn't work........
      a[i]= CHAR_to_INT(ch[i]);

       d=d+a[i]*Math.pow(16,size-i-1);

  }
    System.out.println(d);
};
   static void Binary_to_octal(int BtoO){
     // int x = binary_to_decimal(BtoO);
       int a[] = new int[10];
       int j=0;
       while(BtoO>0){
           a[j]=BtoO%10;
           BtoO=BtoO/10;
           j++;
       }
       double sum=0;
       for(int i=j-1;i>=0;i--)
       {
           sum=sum+a[i]*Math.pow(2,i);
       }
       int ans=(int)sum;
       decimal_to_octal(ans);


   };
      static void Binary_to_hexa(int BtoH){
          int a[] = new int[10];
          int j=0;
          while(BtoH>0){
              a[j]=BtoH%10;
              BtoH=BtoH/10;
              j++;
          }
          double sum=0;
          for(int i=j-1;i>=0;i--)
          {
              sum=sum+a[i]*Math.pow(2,i);
          }
          int ans=(int)sum;
          Decimal_to_Hexadecimal(ans);
      };

      static void Octal_to_hex(int OtoH){
          int a[] = new int[10];
          int j=0;
          while(OtoH>0){
              a[j]=OtoH%10;
              OtoH=OtoH/10;
              j++;
          }
          double sum=0;
          for(int i=j-1;i>=0;i--)
          {
              sum=sum+a[i]*Math.pow(8,i);
          }
          int ans=(int)sum;
          Decimal_to_Hexadecimal(ans);

      };

      static void octal_to_binary(int otob){

          int a[] = new int[10];
          int j=0;
          while(otob>0){
              a[j]=otob%10;
              otob=otob/10;
              j++;
          }
          double sum=0;
          for(int i=j-1;i>=0;i--)
          {
              sum=sum+a[i]*Math.pow(8,i);
          }
          int ans=(int)sum;
          decimal_to_binary(ans);
      };
      static void hex_to_binary(String htob){
          char[] ch=htob.toCharArray();
          double d=0;
          int size=ch.length;
          int[] a=new int[size];
          for(int i=size-1;i>=0;i--){

              a[i]= CHAR_to_INT(ch[i]);

              d=d+a[i]*Math.pow(16,size-i-1);

          }
          int ans=(int)d;

          decimal_to_binary(ans);
      }

      static void hex_to_octal(String htoo){
          char[] ch=htoo.toCharArray();
          double d=0;
          int size=ch.length;
          int[] a=new int[size];
          for(int i=size-1;i>=0;i--){

              a[i]= CHAR_to_INT(ch[i]);

              d=d+a[i]*Math.pow(16,size-i-1);

          }
          int ans=(int)d;
           decimal_to_octal(ans);
      }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<20;i++){
            System.out.println("  ");
            System.out.println("choose the type of conversion you want to perform : ");
            System.out.println("1 . Decimal to Binary");
            System.out.println("2 . Decimal to Octal");
            System.out.println("3 . Decimal to Hexadecimal");
            System.out.println("4 . Binary to Decimal");
            System.out.println("5 . Binary to octal");
            System.out.println("6 . Binary to Hexadecimal");
            System.out.println("7 . octal to Decimal");
            System.out.println("8 . octal to Binary");
            System.out.println("9 . octal to Hexadecimal");
            System.out.println("10 . Hexadecimal to decimal");
            System.out.println("11 . Hexadecimal to Binary");
            System.out.println("12 . Hexadecimal to Octal");
            System.out.println("100. Exit");
            int opt=sc.nextInt();

            switch (opt){
                case 1 :
                    System.out.println("Enter value : ");
                    int a=sc.nextInt();
                    decimal_to_binary(a);
                    break;
                case 2:
                    System.out.println("Enter value : ");
                    int b=sc.nextInt();
                    decimal_to_octal(b);
                    break;
                case 3:
                    System.out.println("Enter value : ");
                    int c=sc.nextInt();
                    Decimal_to_Hexadecimal(c);
                    break;
                case 4:
                    System.out.println("Enter value : ");
                    int d=sc.nextInt();
                    binary_to_decimal(d);
                    break;
                case 5:
                    System.out.println("Enter value : ");
                    int e=sc.nextInt();
                    Binary_to_octal(e);
                    break;
                case 6:
                    System.out.println("Enter value : ");
                    int f=sc.nextInt();
                    Binary_to_hexa(f);
                    break;
                case 7:
                    System.out.println("Enter value : ");
                    int g=sc.nextInt();
                    octal_to_decimal(g);
                    break;
                case 8:
                    System.out.println("Enter value : ");
                    int h=sc.nextInt();
                    octal_to_binary(h);
                    break;
                case 9:
                    System.out.println("Enter value : ");
                    int j=sc.nextInt();
                    Octal_to_hex(j);
                    break;
                case 10:
                    System.out.println("Enter value : ");
                    String k=sc.next();
                    hexadecimal_to_decimal(k);
                    break;
                case 11:
                    System.out.println("Enter value : ");
                    String l=sc.next();
                    hex_to_binary(l);
                    break;
                case 12 :
                    System.out.println("Enter value : ");
                    String m=sc.next();
                    hex_to_octal(m);
                    break;

            }
            if(opt==100)
            {
                break;
            }
        }
    }
}
