import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreeWithMenuExample extends JFrame{
    private JTextArea textArea;
    public static void main(String[] args){
        LoginDialog loginDialog = new LoginDialog(null);
        loginDialog.setVisible(true);
        if (loginDialog.isSucceeded()) {
            new TreeWithMenuExample();
        }else {
            System.exit(0);
        }
    }
    public TreeWithMenuExample(){
        setTitle("JTree with JMenu Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        setJMenuBar(menuBar);
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(TreeWithMenuExample.this,"New File Created");

            }
        });
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node1");

        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("node2");

        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("node3"); 

        root.add(node1);
        root.add(node2);
        root.add(node3);

        DefaultMutableTreeNode node1Child1 = new DefaultMutableTreeNode("Node 1.1");

        DefaultMutableTreeNode node1Child2 = new DefaultMutableTreeNode("Node 1.2");

        node1.add(node1Child1);
        node1.add(node1Child2);

        JTree tree = new JTree(root);

        tree.addTreeSelectionListener(new TreeSelectionListener(){

            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (selectedNode !=null) {
                    textArea.setText("Selected: " + selectedNode.toString());
                }
            }
        });

        textArea = new JTextArea();
        textArea.setEditable(false);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(tree), new JScrollPane(textArea));
        splitPane.setDividerLocation(200);
        getContentPane().add(splitPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
