import java.util.Scanner;
import java.math.*;
class D
{
    // decimal to binary conversion
     String Decimal_to_Binary(String D) {
      //  D=D.replaceFirst("^0+(?!$)","");
        String[] a = D.split("[.]");
        String str_b = "", b_deC ="";
        String B = "";
        long random = 0;
        double decimal, x = Integer.parseInt(a[0]);
        // first we will Convert Integar part
        while (x > 0) {
            random = (long) (x % 2);
            x = (long) (x / 2);
            str_b = String.valueOf(random) + str_b;

        }
        //now Converting decimal part
        if (D.contains(".")) {
            decimal = Integer.parseInt(a[1]);
            decimal = decimal / Math.pow(10, a[1].length());

            if (!a[1].equals("0")) {
                String str_temp1;
                String[] str_temp2;
                for (double count = 0; count < 4; count++) {
                    decimal = decimal * 2;
                    str_temp1 = String.valueOf(decimal);
                    str_temp2 = str_temp1.split("[.]");
                    b_deC += str_temp2[0];
                    decimal = Double.parseDouble(str_temp2[1])/ Math.pow(10,str_temp2[1].length());
                }
                str_b = str_b + "." + b_deC;

               return str_b;


            }
        } else {

           return str_b;
        }

          return "";
    }

//decimal to octal conversion
    String  Decimal_to_octal(String D){

        String[] part=D.split("[.]");
        String str_o="",o_deC="";
        String O="";
        long random=0;
        double decimal,x=Integer.parseInt(part[0]);

        // integer part
        while (x>0){
            random=(long) (x%8);
            x=(long)(x/8);
            str_o=String.valueOf(random)+str_o;
        }
        //decimal part
        if (D.contains(".")) {
            decimal = Integer.parseInt(part[1]);
            decimal = decimal / Math.pow(10, part[1].length());

            if(!part[1].equals("0")){
                String str_tmp1;
                String[] str_tmp2;
                for (double count = 0; count < 4; count++) {
                    decimal = decimal * 8;
                    str_tmp1 = String.valueOf(decimal);
                    str_tmp2 = str_tmp1.split("[.]");
                    o_deC += str_tmp2[0];
                    decimal = Double.parseDouble(str_tmp2[1])/ Math.pow(10,str_tmp2[1].length());

                }
                str_o = str_o + "." + o_deC;

                return str_o;

            }
        }
        else {
            return str_o;

        }

    return "";
    }

    //decimal to hexadecimal conversion.
    String Decimal_to_hexadecimal(String D){
        String[] part=D.split("[.]");
        String str_h="",h_deC="";
        String H="";
        double decimal,x=Integer.parseInt(part[0]);
        long H_rm;
        String DtoH_H="";

        // integar part

        while (x>0){
            H_rm=(long) x%16;
            x=(long)(x/16);
            if(H_rm==10){
                DtoH_H= "A" + DtoH_H;
            } else if (H_rm==11) {
                DtoH_H= "B" + DtoH_H;
            } else if (H_rm==12) {
                DtoH_H= "C" +DtoH_H;
            } else if (H_rm==13) {
                DtoH_H= "D" + DtoH_H;
            } else if (H_rm==14) {
                DtoH_H= "E" + DtoH_H;
            } else if (H_rm==15) {
                DtoH_H= "F" + DtoH_H;
            }
            else {
                DtoH_H=String.valueOf(H_rm)+DtoH_H;
            }

        }

        //decimal part
        if (D.contains(".")) {
            decimal = Integer.parseInt(part[1]);
            decimal = decimal / Math.pow(10, part[1].length());

            if (!part[1].equals("0")) {
                String temp1;
                String[] temp2;
                for (double count = 0; count < 4; count++) {
                    decimal = decimal * 16;
                    temp1 = String.valueOf(decimal);
                    temp2 = temp1.split("[.]");

                    if (temp2[0].equals("10")) {
                        h_deC += "A";
                    } else if (temp2[0].equals("11")) {
                        h_deC += "B";
                    } else if (temp2[0].equals("12")) {
                        h_deC += "C";
                    } else if (temp2[0].equals("13")) {
                        h_deC += "D";
                    } else if (temp2[0].equals("14")) {
                        h_deC += "E";
                    } else if (temp2[0].equals("15")) {
                        h_deC += "F";
                    } else {
                        h_deC += temp2[0];
                    }
                    decimal = Double.parseDouble(temp2[1])/ Math.pow(10,temp2[1].length());


                }
                DtoH_H = DtoH_H + "." + h_deC;
               return DtoH_H;
            }
        }
        else {
            return DtoH_H;
        }
        return "";
    }


}
//class for binary to any conversion.
class B{
    String setOlen(String x){

        while (x.length()%3!=0){
            x="0"+x;
        }
        return x;
    }
    String setHlen(String x){

        while (x.length()%4!=0){
            x="0"+x;
        }
        return x;
    }
    String setB(String in){
        switch (in.length()){
            case 1:in=in+"00";
                return in;
            case 2:in=in+"0";
                return in;
            case 3:return in;
        }
        return in;
    }
    String setBh(String in){
        switch (in.length()){
            case 1:in=in+"000";
                return in;
            case 2:in=in+"00";
                return in;
            case 3:return in=in+"0";
            case 4:return in;
        }
        return in;
    }
//binary to decimal conversion
    String Binary_to_Decimal(String B){
        String[] part=B.split("[.]");
        String str_d="",d_deC;
        String BtoD="";
        double D=0,D_deC=0;
        double i=0;
        long b_rm=0;
        double decimal,x=Integer.parseInt(part[0]);
        if(B.contains(".")){
            decimal=Integer.parseInt(part[1]);
            d_deC=part[1];
        }
        else {
            decimal=0;
            d_deC="";
        }
        //Integar part
        while (x>0){
            b_rm=(long)x%10;
            x=x/10;
            D+= b_rm*Math.pow(2,i);
            i++;
        }
        //decimal part
        if(B.contains(".")){
            i=0;
            while (decimal>0){
                b_rm=(long) (decimal%10);
                decimal=(long)(decimal/10);
                D_deC=D_deC+b_rm*Math.pow(2,-d_deC.length()+i);
                i++;
            }
            D+=D_deC;
            if(D%1==0){
               return BtoD= String.valueOf((long) D);

            }else {
                return BtoD= String.valueOf(D);
            }

        }
        else {
            if(D%1==0){
               return BtoD=String.valueOf((long) D);
            }else {
               return BtoD=String.valueOf(D);
            }
        }

    }
    //binary to octal conversion
    String Binary_to_Octal(String B){
        B=setOlen(B);
        String[] part=B.split("[.]");
        String str_o="",o_deC="";
        String O="";

        //part1
        String[] temp_str= part[0].split("(?<=\\G.{" + 3 + "})");
        String[] a=new String[temp_str.length];
        for (int i= temp_str.length-1;i>=0;i--){
            a[i]=temp_str[temp_str.length-i-1];
        }
        temp_str=a;
        for(int qwe=0;qwe<temp_str.length;qwe++){
            B BtoO =new B();
            str_o=BtoO.Binary_to_Decimal(temp_str[qwe])+str_o;
        }

        //part2
        if(B.contains(".")){
            temp_str= part[1].split("(?<=\\G.{" + 3 + "})");

            a=new String[temp_str.length];
            for (int i= temp_str.length-1;i>=0;i--){
                a[i]=temp_str[temp_str.length-i-1];
            }
            temp_str=a;

            for (int qwe=0;qwe<temp_str.length;qwe++){
                temp_str[qwe]=setB(temp_str[qwe]);
                B BtoO =new B();
                o_deC+=BtoO.Binary_to_Decimal(temp_str[qwe]);

            }
            str_o=str_o+"."+o_deC;
            return O=str_o;
        }
        else {
            return O=str_o;
        }
    }
//binary to hexadecimal conversion.
    String Binary_to_Hexadecimal(String B){
        B=setHlen(B);
        String[] part=B.split("[.]");
        String H_dec="";
        String H="";
        //part1
        String[] temp_str= part[0].split("(?<=\\G.{" + 4 + "})");
        String[] a=new String[temp_str.length];
        for (int i= temp_str.length-1;i>=0;i--){
            a[i]=temp_str[temp_str.length-i-1];
        }
        temp_str=a;


        for (int i=0;i<temp_str.length;i++){
            B btoh =new B();
            String temp=btoh.Binary_to_Decimal(temp_str[i]);
            if(temp.equals("10")){
                H= "A" + H;
            } else if (temp.equals("11")) {
                H= "B" + H;
            } else if (temp.equals("12")) {
                H= "C" + H;
            } else if (temp.equals("13")) {
                H= "D" + H;
            } else if (temp.equals("14")) {
                H= "E" + H;
            } else if (temp.equals("15")) {
                H= "F" + H;
            }
            else {
                H=temp+H;
            }
        }

        //part2
        if(B.contains(".")){
            temp_str= part[1].split("(?<=\\G.{" + 4 + "})");

            a=new String[temp_str.length];
            for (int i= temp_str.length-1;i>=0;i--){
                a[i]=temp_str[temp_str.length-i-1];
            }
            temp_str=a;

            for (int i=0;i<temp_str.length;i++){

                B BtoH =new B();
                String temp2=BtoH.Binary_to_Decimal(temp_str[i]);
                if (temp2.equals("10")) {
                    H_dec += "A";
                } else if (temp2.equals("11")) {
                    H_dec += "B";
                } else if (temp2.equals("12")) {
                    H_dec += "C";
                } else if (temp2.equals("13")) {
                    H_dec += "D";
                } else if (temp2.equals("14")) {
                    H_dec += "E";
                } else if (temp2.equals("15")) {
                    H_dec += "F";
                } else {
                    H_dec += temp2;
                }

            }
            return H+"."+H_dec;
        }
        else {

            return H;
        }

    }


}
// class for octal to any other conversion.
class O{
    String setO(String in){
        switch (in.length()){
            case 1:in="00"+in;
                return in;
            case 2:in="0"+in;
                return in;
            case 3:return in;
        }
        return in;
    }
    String Octal_to_Binary(String O){
        String[] part=O.split("[.]");
        String str_b="",b_dec="";
        String B="";

        String[] temp_str= part[0].split("(?<=\\G.{" + 1 + "})");

        String[] a=new String[temp_str.length];
        for (int i= temp_str.length-1;i>=0;i--){
            a[i]=temp_str[temp_str.length-i-1];
        }
        temp_str=a;

        //part1
        for(int i=0;i<temp_str.length;i++){
            D OtoB=new D();
            str_b=setO(OtoB.Decimal_to_Binary(temp_str[i])+str_b);
        }

        //part2
        if(O.contains(".")){

            temp_str= part[1].split("(?<=\\G.{" + 1 + "})");
            a=new String[temp_str.length];
            for (int i= temp_str.length-1;i>=0;i--){
                a[i]=temp_str[temp_str.length-i-1];
            }
            temp_str=a;

            for (int i=0;i<temp_str.length;i++){
                D OtoB1=new D();
                b_dec+=setO(OtoB1.Decimal_to_Binary(temp_str[i]));
            }
            str_b=str_b+"."+b_dec;
            B=str_b;
            return B;
        }
        else {
            B=str_b;
            return B;
        }
    }

    String Octal_to_Decimal(String O){
        String[] part=O.split("[.]");
        String str_d="",d_deC="";
        double D=0,D_deC=0;
        double i=0;
        long o_rm=0;
        double decimal=0,x=Integer.parseInt(part[0]);

       //part1

        while (x>0){
            o_rm=(long) x%10;
            x=x/10;
            D+= o_rm*Math.pow(8,i);
            i++;
        }
        i=0;
        //part2
        if(O.contains(".")){
            decimal=Integer.parseInt(part[1]);
            d_deC=part[1];

            while (decimal>0){
                o_rm=(long) (decimal%10);
                decimal=(long)(decimal/10);
                D_deC+=o_rm*Math.pow(8,-d_deC.length()+i);
                i++;
            }

            D+=D_deC;
            if (D % 1 == 0) {
                return String.valueOf((long) D);
            } else {
                return String.valueOf(D);
            }
        }
        else {

            if (D % 1 == 0) {
                return String.valueOf((long) D);
            } else {
                return String.valueOf(D);
            }
        }
    }

    String Octal_to_Hexadecimal(String O){
        O=Octal_to_Decimal(O);
        String[] part=O.split("[.]");
        String H="",str_h,h_deC="";
        double decimal,x=Integer.parseInt(part[0]);
        long o_rm;

        //part1
        while (x>0){
            o_rm=(long)x%16;
            x=(long)(x/16);
            if(o_rm==10){
                H= "A" + H;
            } else if (o_rm==11) {
                H= "B" + H;
            } else if (o_rm==12) {
                H= "C" + H;
            } else if (o_rm==13) {
                H= "D" + H;
            } else if (o_rm==14) {
                H= "E" + H;
            } else if (o_rm==15) {
                H= "F" + H;
            }
            else {
                H=String.valueOf(o_rm)+H;
            }

        }

        //part2
        if (O.contains(".")) {
            decimal = Integer.parseInt(part[1]);
            decimal = decimal / Math.pow(10, part[1].length());

            if (!part[1].equals("0")) {String str_tmp1;
                String[] str_tmp2;
                for (double count = 0; count < 4; count++) {
                    decimal = decimal * 16;
                    str_tmp1 = String.valueOf(decimal);
                    str_tmp2 = str_tmp1.split("[.]");

                    if (str_tmp2[0].equals("10")) {
                        h_deC += "A";
                    } else if (str_tmp2[0].equals("11")) {
                        h_deC += "B";
                    } else if (str_tmp2[0].equals("12")) {
                        h_deC += "C";
                    } else if (str_tmp2[0].equals("13")) {
                        h_deC += "D";
                    } else if (str_tmp2[0].equals("14")) {
                        h_deC += "E";
                    } else if (str_tmp2[0].equals("15")) {
                        h_deC += "F";
                    } else {
                        h_deC += str_tmp2[0];
                    }
                    decimal = Double.parseDouble(str_tmp2[1])/ Math.pow(10,str_tmp2[1].length());


                }
                H = H + "." + h_deC;
                return H;
            }
        }else {
            return H;
        }
        return "";
    }

}
class H{
    String setH(String in){
        switch (in.length()){
            case 1:in="000"+in;
                return in;
            case 2:in="00"+in;
                return in;
            case 3:return "0"+in;
            case 4:return in;
        }
        return in;
    }
    int CtoI(char c) {
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


    String Hexadecimal_to_Binary(String H){
        char[] char_p;
        int[] int_p;
        char[] char_p0;
        int[] int_p0;
        String B="";
        String str_b="",b_deC="";
        String[] part=new String[2];

        if (H.contains(".")){

            part=H.split("[.]");
            String dec=part[1];
            String x=part[0];
            char_p=x.toCharArray();
            char_p0=dec.toCharArray();

        }else {
            char_p = H.toCharArray();
            char_p0=H.toCharArray();
        }
        //int part
        int_p = new int[char_p.length];

        for (int i = char_p.length - 1; i >= 0; i--) {

            int_p[i] = CtoI(char_p[i]);
            D HtoB = new D();
            String a="";
            str_b =a+ setH(String.valueOf(HtoB.Decimal_to_Binary(String.valueOf(int_p[i]))))+str_b;

        }
        //dec part
        if(H.contains(".")&&!part[1].equals("0")){

            int_p0 = new int[char_p0.length];

            for (int i = char_p0.length - 1; i >= 0; i--) {

                int_p0[i] = CtoI(char_p0[i]);

                D HtoB1 = new D();
                String b="";
                b_deC =b+setH(String.valueOf(HtoB1.Decimal_to_Binary(String.valueOf(int_p0[i]))))+b_deC;
            }
            str_b=str_b+"."+b_deC;
            B=str_b;

            return B;
        }
        else {

            B=str_b;
            return B;
        }
    }


    String Hexadecimal_to_Decimal(String H){
        char[] char_p;
        int[] int_p;
        char[] char_p1;
        int[] int_p1;
        double D_dec=0;
        long D=0;
        String str_d="",d_dec="";
        String[] part=new String[2];

        if (H.contains(".")){

            part=H.split("[.]");
            String dec=part[1];
            String x=part[0];
            char_p=x.toCharArray();
            char_p1=dec.toCharArray();

        }else {
            char_p = H.toCharArray();
            char_p1=H.toCharArray();

        }
      //int part
        int_p = new int[char_p.length];
        for (int i = char_p.length - 1; i >= 0; i--) {

            int_p[i] = CtoI(char_p[i]);
            D+=(long) int_p[i]*Math.pow(16,  char_p.length-i-1);
        }
        str_d=String.valueOf(D);
       //dec part
        if(H.contains(".")&&!part[1].equals("0")){

            int_p1 = new int[char_p1.length];

            for (int i = 0; i< char_p1.length; i++) {

                int_p1[i] = CtoI(char_p1[i]);
                D_dec+=int_p1[i]*Math.pow(16, -i-1);
            }
            d_dec=String.valueOf(D_dec);
            String[] t_str=new String[2];
            t_str=d_dec.split("[.]");
            d_dec=t_str[1];

            return str_d+"."+d_dec;
        }
        else {
            return String.valueOf(D);
        }
    }

    String Hexadecimal_to_Octal(String H){
        String HtoO_B=Hexadecimal_to_Binary(H);
        B HtoO = new B();
        String O = HtoO.Binary_to_Octal(HtoO_B);
        return O;

    }

}
public class N_S {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        D d=new D();
        B b=new B();
        O o=new O();
        H h=new H();
        for (int i=0;i<20;i++) {
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
                    String n1=sc.next();
                    String ans1 = d.Decimal_to_Binary(n1);
                    System.out.println(ans1);
                    break;
                case 2:
                    System.out.println("Enter value : ");
                    String n2=sc.next();
                    String ans2 = d.Decimal_to_octal(n2);
                    System.out.println(ans2);
                    break;
                case 3:
                    System.out.println("Enter value : ");
                    String n3=sc.next();
                    String ans3 = d.Decimal_to_hexadecimal(n3);
                    System.out.println(ans3);
                    break;
                case 4:
                    System.out.println("Enter value : ");
                    String n4=sc.next();
                    String ans4 = b.Binary_to_Decimal(n4);
                    System.out.println(ans4);
                    break;
                case 5:
                    System.out.println("Enter value : ");
                    String n5=sc.next();
                    String ans5 = b.Binary_to_Octal(n5);
                    System.out.println(ans5);
                    break;
                case 6:
                    System.out.println("Enter value : ");
                    String n6=sc.next();
                    String ans6 = b.Binary_to_Hexadecimal(n6);
                    System.out.println(ans6);
                    break;
                case 7:
                    System.out.println("Enter value : ");
                    String n7=sc.next();
                    String ans7 = o.Octal_to_Decimal(n7);
                    System.out.println(ans7);
                    break;
                case 8:
                    System.out.println("Enter value : ");
                    String n8=sc.next();
                    String ans8 = o.Octal_to_Binary(n8);
                    System.out.println(ans8);
                    break;
                case 9:
                    System.out.println("Enter value : ");
                    String n9=sc.next();
                    String ans9 = o.Octal_to_Hexadecimal(n9);
                    System.out.println(ans9);
                    break;
                case 10:
                    System.out.println("Enter value : ");
                    String n10=sc.next();
                    String ans10 = h.Hexadecimal_to_Decimal(n10);
                    System.out.println(ans10);
                    break;
                case 11:
                    System.out.println("Enter value : ");
                    String n11=sc.next();
                    String ans11 = h.Hexadecimal_to_Binary(n11);
                    System.out.println(ans11);
                    break;
                case 12 :
                    System.out.println("Enter value : ");
                    String n12=sc.next();
                    String ans12 = h.Hexadecimal_to_Octal(n12);
                    System.out.println(ans12);
                    break;

            }
            if(opt==100)
             {
                break;
             }
            }
        }
}
