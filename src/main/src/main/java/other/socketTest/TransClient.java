package other.socketTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TransClient {

    /**
     * @param args
     * @throws IOException
     * @throws
     */
    public static void main(String[] args) throws IOException {
        System.out.println("客户端运行......");
        // 客户端：
        // 步骤：
        // 1，创建socket，明确地址和端口。
        Socket s = new Socket("127.0.0.1", 10005);

        // 2，源：键盘录入。获取需要转换的数据。
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        // 3，目的：网络，socket输出流。将录入的数据发送到服务端。
        //既然都是字符数据，为了便于操作，使用额外功能，转换。同时提高效率。
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        // 4，源：socket，socket读取流，读取服务端发回来的大写数据。
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // 5，目的：客户端显示器，将大写数据显示出来。直接使用输出语句。

        // 6，频繁的读写操作。
        String line = null;
        while((line=bufr.readLine())!=null){

            //将读取键盘的数据发送到服务端。
            out.println(line);
//			out.flush();
            if("over".equals(line)){
                break;
            }

            //读取服务端返回的数据。
            String upperText = bufIn.readLine();
            System.out.println(upperText);
        }

        // 7，关闭资源。
        s.close();
    }

}