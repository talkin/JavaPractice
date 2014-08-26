package com.tw.java.basic;

import java.io.*;

public class Practice6_IO {
//
//    ---------------------------------
//    流 ：数据的序列
//    输入流表示从一个源读取数据，输出流表示向一个目标写数据。
//    ---------------------------------
// Java IO系统里读写文件使用Reader和Writer两个抽象类
// Reader中read()和close()方法都是抽象方法。Writer中 write()，flush()和close()方法为抽象方法。

    public static void main(String[] args) throws IOException {

        InputStreamReader is1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is1);

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

        //有3个reader实现类
        //FileReader,InputStreamReader和BufferedReader

        System.out.print("从文本中读取的数据\n");
        //读取文本---way1---FileReader
        FileReader fr = new FileReader("/Users/jtao/Documents/Code/java/practice/testRead.txt");
        int ch = 0;
        while((ch = fr.read())!=-1 ){
            System.out.print( (char)ch );
        }

        //读取文本---way2---InputStream
        InputStream input = new FileInputStream(new File("/Users/jtao/Documents/Code/java/practice/testRead.txt"));
        InputStreamReader is = new InputStreamReader(input);
        int out;
        while ((out = is.read()) != -1) {
            System.out.print((char)out);
        }

        //读取文本---way3---BufferedReader
        //read()方法费时，为了提高效率，可使用BufferedReader对Reader进行包装，可以提高读取得速度。
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/jtao/Documents/Code/java/practice/testRead.txt"));
        String data = bufferedReader.readLine();//一次读入一行，直到读入null为文件结束
        while( data!=null){
            System.out.println(data);
            data = bufferedReader.readLine(); //接着读下一行
        }


        //写文本---FileWriter，PrintWriter，BufferedWriter
        //写入文本---way1---FileWriter
        FileWriter fw = new FileWriter("/Users/jtao/Documents/Code/java/practice/testWrite1.txt");
        String toWrite = "welcome to write";
        fw.write(toWrite, 0, toWrite.length());
        fw.flush();
        fw.close();

        //写入文本---way2---PrintWriter
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/jtao/Documents/Code/java/practice/testWrite2.txt"));
        osw.write(toWrite,0,toWrite.length());
        osw.flush();

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/Users/jtao/Documents/Code/java/practice/testWrite3.txt")),true);
        pw.println(toWrite);
        osw.close();
        pw.close();

    }


}
