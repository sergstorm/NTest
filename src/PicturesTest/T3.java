package PicturesTest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class T3
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();

        String pathCardFile="D:\\JaVa\\java_test_task\\imgs\\Ful\\7";
        File dir = new File(s);
        System.out.println(dir.toString());//path указывает на директорию
        File[] arrFiles = dir.listFiles();

            List<File> lst = Arrays.asList(arrFiles);
          // lst.forEach(System.out::println);
        int count2=0;int count3=0;int count4=0;int count5=0;int count6=0;int count7=0;int count8=0;int count9=0;
        int count10=0;int countJ=0; int countD=0;int countK=0;int countT=0;
            //berem perviy
        boolean proveriliFail=false;
        int kolvoNeopredCartu=0;
        int kolvodir=0;
        int nomerRyada1=143;   //is kakogo ryada berem; +72
        int nomerRyada2=215;   //is kakogo ryada berem;+ 71
        int nomerRyada3=286;   //is kakogo ryada berem;
        int nomerRyada4=358;   //is kakogo ryada berem;4
        int nomerRyada5=429;   //is kakogo ryada berem;4
        for (int i = 0; i <lst.size() ; i++)
        {
            System.out.println("---------------------------------------------------------");
            System.out.print(lst.get(i).toString()+" --   :  ");
            for (int j = 0; j <5 ; j++) {
                int a=0;
                if(j==0) a=143;
                if(j==1) a=215;
                if(j==2) a=286;
                if(j==3) a=358;
                if(j==4) a=429;
            proveriliFail=false;
            if (lst.get(i).isDirectory()){ System.out.println("Directory");kolvodir++;continue; }
            File fileFFF = new File(lst.get(i).toString());
             //  System.out.println(lst.get(i).toString()+" --   :  ");
            BufferedImage source = ImageIO.read(fileFFF);
            BufferedImage image = source.getSubimage(a, 590, 65, 80);
            //proverka4ryada
                Color color = new Color(image.getRGB(2, 2));
                int blue = color.getBlue();
                int red = color.getRed();
                int green = color.getGreen();
                int blueN=100;int redN=100;int greenN=100;
                if(blue<blueN && red<redN && green<greenN)
                {
                    System.out.print(" Net carti......."); continue;
                }
                Color color3 = new Color(image.getRGB(35, 35));
                int blue3 = color3.getBlue();
                int red3 = color3.getRed();
                int green3 = color3.getGreen();
                //System.out.println(blue3+" b "+red3+" r "+" G"+green3);
                if(blue3<150 && red3<150 && green3<150)
                {
                    System.out.print(" Zatenennaya carta...."); continue;
                }



            //proverim mast
           // System.out.print(mast(image));


           if (checkCard(image, 16, 3, 10, 22, 22, 22,9,23,23,23))
           {
                count2++;proveriliFail=true;
                System.out.print(mast(image)); System.out.print("Dvoika !!! Ko : "+count2);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\2\\";
//                String newfile2 = "Dvoika"+count2+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//               boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
            }

            if (checkCard(image, 11, 3, 22, 3, 17, 22,19,7,15,11))
            {
                count3++;proveriliFail=true;
                System.out.print(mast(image)); System.out.print("Three !!! kol :"+count3);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\3\\";
//                String newfile2 = "Troika"+count3+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
            }
            if (checkCard(image, 15, 17, 21, 3, 25, 17,15,10,21,23))
            {
                count4++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("Fours !!! kolv  "+count4);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\4\\";
//               String newfile2 = "Chetverka"+count4+".png";
//               System.out.println(fileDirNameDvoiki+newfile2);
//               boolean a= new File(fileDirNameDvoiki).mkdir();
//               File output2 = new File(fileDirNameDvoiki+newfile2);
//               ImageIO.write(source, "jpg", output2);
            }
            if (checkCard(image, 12, 13, 20, 3, 22, 2,19,22,22,13))
            {
                count5++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("Peterka !!! kolvo : "+count5);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\5\\";
//                String newfile2 = "Peterka"+count5+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println(" Five !!!");
            }
            if (checkCard(image, 15, 5, 11, 10, 17, 11,22,20,12,20))
            {
                count6++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("Shesterka !!! kolvo : "+count6);
                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\6\\";
//                String newfile2 = "Shesterka"+count6+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println(" Six !!!");
            }
           if (checkCard(image, 13, 22, 20, 9, 19, 3,22,3,23,5))
           {
               count7++;proveriliFail=true;
               System.out.print(mast(image));  System.out.print("SEM' !!! kolvo : "+count7);
//               String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\7\\";
//               String newfile2 = "SEMERA"+count7+".png";
//               System.out.println(fileDirNameDvoiki+newfile2);
//               boolean a= new File(fileDirNameDvoiki).mkdir();
//               File output2 = new File(fileDirNameDvoiki+newfile2);
//               ImageIO.write(source, "jpg", output2);
//               System.out.println(" Seven !!!");
           }
           if (checkCard(image, 11, 7, 22, 8, 11, 18,23,19,17,3))
            { //dop proverka
                count8++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("888888  kolvo : "+count8);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\8\\";
//                String newfile2 = "8"+count8+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println("\n\n 8888 !!!");
            }


            if (checkCard(image, 23, 11, 22, 5, 12, 21,20,13,14,14))
            {
                count9++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("DEVIATKA !!! kolvo : "+count9);
//              String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\9\\";
//               String newfile2 = "DEVIATKA"+count9+".png";
//              System.out.println(fileDirNameDvoiki+newfile2);
//               boolean a= new File(fileDirNameDvoiki).mkdir();
//               File output2 = new File(fileDirNameDvoiki+newfile2);
//               ImageIO.write(source, "jpg", output2);
//                System.out.println(" nine !!!");
            }
            if (checkCard(image, 32, 12, 6, 4, 11, 23,24,3,11,15))
            {
                count10++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("DESIYATINA !!! kolvo : "+count10);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\10\\";
//                String newfile2 = "DESyaT"+count10+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println("\n Ten !!!");
            }
            if (checkCard(image, 10, 20, 20, 3, 20, 10,17,20,20,7))
            {
                countJ++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("JALERA  !!! kolvo : "+countJ);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\J\\"; //dve dvoiki tut
//                String newfile2 = "VAL"+countJ+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
                //System.out.println("\n\n Jalet !!!");
            }
            if (checkCard(image, 23, 16, 29, 21, 11, 13,28,7,29,15))
            {
                countD++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("DAMA  kolvo : "+countD);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\D\\";
//                String newfile2 = "DAMA"+countD+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println("\n\n DAMA !!!");
            }
            if (checkCard(image, 26, 3, 26, 22, 18, 12,12,22,23,6))
            {
                countK++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("KOROL  kolvo : "+countK);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\K\\";
//                String newfile2 = "K"+countK+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println("\n\n KOROL !!!");
            }
            if (checkCard(image, 8, 22, 13, 16, 22, 16,26,22,22,14))
            {
                countT++;proveriliFail=true;
                System.out.print(mast(image));  System.out.print("TUZ  kolvo : "+countT);
//                String fileDirNameDvoiki = "D:\\JaVa\\java_test_task\\imgs\\Ful\\T\\";
//                String newfile2 = "T"+countT+".png";
//                System.out.println(fileDirNameDvoiki+newfile2);
//                boolean a= new File(fileDirNameDvoiki).mkdir();
//                File output2 = new File(fileDirNameDvoiki+newfile2);
//                ImageIO.write(source, "jpg", output2);
//                System.out.println("\n\n TUZ !!!");
            }
             if(!proveriliFail){kolvoNeopredCartu++;}

             //Nalichie carti proverka
        }

//        System.out.println("Dvoika"+count2+"   troika :"+count3+"   chetvera :"+count4+"   petera :"+count5+"   shest:"+count6+"   sem: "+count7+
//                "  \n vosem: "+count8+"   devyat: "+count9+"   desyat: "+count10+"   VAL: "+countJ+
//                "   DAMA: "+countD+"    KOR: "+countK+"   TUZ:"+countT);
//        System.out.print("  Naidena Cart Opredelivshisya");
        System.out.println(count2+count3+count4+count5+count6+count7+count8+count9+count10+countD+countJ+countK+countT);

        //System.out.println("Kolvo failov "+(arrFiles.length-kolvodir)+"dir: "+kolvodir+" kolvoNotOpen: "+kolvoNeopredCartu);
        }
    }

    private static boolean isRed(BufferedImage image) {
        Color color = new Color(image.getRGB(40, 60));
        int blue = color.getBlue();
        int red = color.getRed();
        int green = color.getGreen();
        //RED CARD
        if (blue<100 && red>100 && green<100)
        {
            return true;
        }
        else return false;
    }

    private static String mast(BufferedImage image) {
        Color color = new Color(image.getRGB(42, 47));
        int blue,red,green;
        //RED CARD
        if (isRed(image))
        {
            color = new Color(image.getRGB(42, 47));
            blue = color.getBlue();
            red = color.getRed();
            green = color.getGreen();
            if (blue<100 && red>100 && green<100) return " BUBI ";
            //CHERVI
            if (blue>100 && red>100 && green>100) return " Chervi ";

        }
        if(!isRed(image))
        {
            color = new Color(image.getRGB(32, 55));
            blue = color.getBlue();
            red = color.getRed();
            green = color.getGreen();
            if (blue<100 && red<100 && green<100) return " PIKI ";
            //TREFI
            if (blue>100 && red>100 && green>100) return " TREFI ";
        }
        return "Hren Znaet";
    }
    private static boolean checkCard(BufferedImage image, int ax, int ay, int bx, int by,
                                     int cx, int cy,int dx,int dy,int ex,int ey) {
        Color color = new Color(image.getRGB(ax, ay));
        Color color2 = new Color(image.getRGB(bx, by));
        Color color3 = new Color(image.getRGB(cx, cy));
        Color color4 = new Color(image.getRGB(dx, dy));
        Color color5 = new Color(image.getRGB(ex, ey));

        int blue = color.getBlue();
        int red = color.getRed();
        int green = color.getGreen();
       // System.out.println("Blue "+blue+" Red "+red+" Green"+green);
       // if (blue<100 && red<100 && green<100) System.out.println("whight card");

        int blue2 = color2.getBlue();
        int red2 = color2.getRed();
        int green2 = color2.getGreen();
        //System.out.println("Blue "+blue2+" Red "+red2+" Green"+green2);
      //  if (blue2<100 && red2<100 && green2<100) System.out.println("whight card");

        int blue3 = color3.getBlue();
        int red3 = color3.getRed();
        int green3 = color3.getGreen();
       // System.out.println("Blue "+blue3+" Red "+red3+" Green"+green3);
        //cod dlya dvoiki
        int blue4 = color4.getBlue();
        int red4 = color4.getRed();
        int green4 = color4.getGreen();
       ///sout
        int blue5 = color5.getBlue();
        int red5 = color5.getRed();
        int green5 = color5.getGreen();
       // if (blue3<100 && red3<100 && green3<100) System.out.println("whight card");
        int blueN=120;int redN=120;int greenN=120;
        if(!isRed(image))
        {
            if(blue<blueN && blue2<blueN && blue3<blueN &&blue4<blueN && blue5<blueN
                    && red<redN && red2<redN && red3<redN && red4<redN && red5<redN
                    && green<greenN && green2<greenN && green3<greenN && green4<greenN && green5 <greenN
                    )  { return true; }
            return false;
        }
        if (isRed(image))
        {
            if(blue<blueN && blue2<blueN && blue3<blueN &&blue4<blueN && blue5<blueN
                    && red>redN && red2>redN && red3>redN &&red4>redN && red5>redN
                    && green<greenN && green2<greenN && green3<greenN && green4<greenN && green5<greenN
                    )  { return true; }
            return false;
        }
        else return false;

    }
}
//DOPOLNITELNAYA PROVERKA
//                Color color = new Color(image.getRGB(19, 11));
//                int blue = color.getBlue();
//                int red = color.getRed();
//                int green = color.getGreen();
//                int blueN=90;int redN=100;int greenN=90;
//                if(!isRed(image))
//                {
//                    if(blue<blueN && red<redN && green<greenN) System.out.println("Wosmera!!!!!");
//                }
//                if (isRed(image))
//                {
//                    if(blue<blueN && red>redN && green<greenN) System.out.println("Wosmera RED!");
//                }
