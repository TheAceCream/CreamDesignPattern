package other.LittleTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AceCream on 2017/6/8.
 * 大字符串读取到StringBuffer解决
 */
public class ReadFileToString {

    public static StringBuffer getSB(String filePath) throws FileNotFoundException {
        StringBuffer sb = new StringBuffer();
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(filePath);
            br = new BufferedReader(reader);
            String data = null;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb;
    }

    public static void main(String[] args) throws FileNotFoundException {

        StringBuffer stringBuffer = getSB("/Users/AceCream/IdeaProjects/设计模式/src/桶装水推送手机号.txt");
        String[] strings = stringBuffer.toString().split(",");
        List<String> list = new ArrayList<>();
        for (String s : strings) {
            list.add(s);
        }
        System.out.println(list.size());
        for (String s :
                list) {
            System.out.println(s);
        }

    }

}
