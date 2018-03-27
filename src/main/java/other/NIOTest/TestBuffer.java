package other.NIOTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by AceCream on 2017/5/15.
 * 使用Buffer读写数据一般遵循以下四个步骤：
    1.写入数据到Buffer
    2.调用flip()方法
    3.从Buffer中读取数据
    4.调用clear()方法或者compact()方法
 *
 * 一旦读完了所有的数据，就需要清空缓冲区，让它可以再次被写入。
 * 有两种方式能清空缓冲区：调用clear()或compact()方法。
 * clear()方法会清空整个缓冲区。
 * compact()方法只会清除已经读过的数据。
 * 任何未读的数据都被移到缓冲区的起始处，新写入的数据将放到缓冲区未读数据的后面。
 */
public class TestBuffer {

    public static void main(String[] args) throws IOException {
        Charset charset = Charset.forName("utf-8");
        CharsetDecoder decoder = charset.newDecoder();

        RandomAccessFile file = new RandomAccessFile("nio-data.txt","rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        CharBuffer cb = CharBuffer.allocate(48);


        int count = channel.read(buf);
        while (count!=-1){
            buf.flip();
            decoder.decode(buf,cb,false);
            cb.flip();
            while (cb.hasRemaining()){
                System.out.print(cb.get());
            }
            buf.compact();
            cb.compact();
            count = channel.read(buf);
        }
        file.close();

    }

}
