package other.NIOTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * NIO
 * Created by AceCream on 2017/5/12.
 */
public class TestChannel {

    public static void main(String[] args) throws IOException {
        /**
         *
         * RandomAccessFile是用来访问那些保存数据记录的文件的，
         * 你就可以用seek( )方法来访问记录，并进行读写了。这些记录的大小不必相同；
         * !但是其大小和位置必须是可知的。但是该类仅限于操作文件。!
         * RandomAccessFile的工作方式是，把DataInputStream和DataOutputStream结合起来，
         * 再加上它自己的一些方法
         */
        Charset charset = Charset.forName("UTF-8");
        //解码器
        CharsetDecoder decoder = charset.newDecoder();
        RandomAccessFile aFile = new RandomAccessFile("nio-data.txt","rw");
        //获取Channel
        FileChannel inChannel = aFile.getChannel();
        //创建一个容量为48字节的ByteBuffer
        ByteBuffer buf = ByteBuffer.allocate(48);
        //创建一个容量为48字节的CharBuffer

        CharBuffer cb = CharBuffer.allocate(48);
//      System.out.println("ByteBuffer信息："+buf);
        int count = inChannel.read(buf);
        while (count!=-1){
            System.out.println("count= "+count);
            //注意 buf.flip() 的调用，首先读取数据到Buffer，然后反转Buffer,接着再从Buffer中读取数据。
            buf.flip();
            //用解码器进行解码
            decoder.decode(buf, cb, false);
            //解码后,charbuffer再flip一下
            cb.flip();
            //这里为了避免中文乱码问题，采用CharBuffer，通过设置CharSet字符集，将byte编码成char去测试
            while (cb.hasRemaining()){
                System.out.print(cb.get());
            }
            buf.compact();
            cb.compact();
            count = inChannel.read(buf);
            System.out.println();
        }
        //RandomAccessFile的close方法会将对应的非空channel关闭。
        aFile.close();
    }
}
