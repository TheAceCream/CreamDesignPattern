package other.redisTest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTableTest extends javax.swing.JFrame {
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private TableModel jTable1Model;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JTableTest inst = new JTableTest();
                inst.setLocationRelativeTo(null);
                inst.setVisible(true);
            }
        });
    }

    public JTableTest() {
        super();
        initGUI();
    }

    @SuppressWarnings("serial")
    private void initGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            BorderLayout thisLayout = new BorderLayout();
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            getContentPane().setLayout(thisLayout);
            {
                jScrollPane1 = new JScrollPane();
                getContentPane().add(jScrollPane1, BorderLayout.CENTER);
                {
                    jTable1Model = new DefaultTableModel(new String[][] {
                            { "One", "Two" }, { "Three", "Four" } },
                            new String[] { "Column 1", "Column 2" })
                            //重写isCellEditable方法
                    {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }

                    }

                    ;

                    jTable1 = new JTable();
                    jTable1.setFont(new Font("",Font.PLAIN,18));
                    jScrollPane1.setViewportView(jTable1);
                    jTable1.setModel(jTable1Model);
                    jTable1.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            if (e.getClickCount() == 2) {
                                int row = ((JTable) e.getSource()).rowAtPoint(e
                                        .getPoint());
                                int col = ((JTable) e.getSource())
                                        .columnAtPoint(e.getPoint());
                                String cellValue = (String) (jTable1Model
                                        .getValueAt(row, col));
                                JOptionPane.showMessageDialog(null, cellValue);
                            }
                        }
                    });
                }
            }
            pack();
            setSize(500, 400);
        } catch (Exception e) {
            // add your error handling code here
            e.printStackTrace();
        }
    }
}
