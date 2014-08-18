package com.company;

import java.io.*;

public class Practice5 {

//    ---------------------------------
//    流 ：数据的序列
//    输入流表示从一个源读取数据，输出流表示向一个目标写数据。
//    ---------------------------------

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("输入字符，按q结束输入 ：");
        char c;
        do {
            c = (char)br.read();
            System.out.println(c);
        }while (c != 'q');

        System.out.println("输入字符串，按quit结束 ：");
        String s;
        do {
            s = br.readLine();
            System.out.println(s);
        }while (!s.equals("quit"));

        int b = 123;
        System.out.write(b);


        try{
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }
    }


}
