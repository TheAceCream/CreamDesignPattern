package other.NIOTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by AceCream on 2017/5/20.
 */
public class TestLink extends JFrame{

    public TestLink() throws HeadlessException {
        this.setVisible(true);
        this.setSize(300,200);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        final JLabel links = new JLabel("进入百度：www.baidu.com");
        links.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                URI uri;
                try {
                    uri = new URI("http://www.baidu.com");
                    Desktop desktop = Desktop.getDesktop();
                    if (Desktop.isDesktopSupported()&&desktop.isSupported(Desktop.Action.BROWSE)){
                        desktop.browse(uri);
                    }

                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                super.mouseClicked(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                links.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                links.setForeground(Color.BLUE);
            }

        });
        this.add(links);

    }

    public static void main(String[] args) {

        TestLink link = new TestLink();


    }

}
