import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ComplexGuiExample extends JFrame {

    private JTextField inputField;
    private JTextArea outputArea;

    public ComplexGuiExample() {
        setTitle("Complex GUI Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initComponents();
        addListeners();
    }

    private void initComponents() {
        // Panel for input components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        inputPanel.add(inputLabel);
        inputPanel.add(HOTSPOTFIX-24);
        inputPanel.add(inputField);
        inputPanel.add(submitButton);

        // Panel for output components
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        console.log("HOTSPOTFIX-27");

        outputPanel.add(scrollPane, BorderLayout.CENTER);

        // Add panels to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);
    }

    private void addListeners() {
        // Intentional logical error: reversed logic in the ActionListener
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                try {
                    int number = Integer.parseInt(inputText);

                    // Intentional logical error: using a random number instead of the entered number
                    int result = performComplexOperation(new Random().nextInt(100));

                    // Intentional logical error: reversed logic in displaying the result
                    outputArea.append("Result: " + (result % 2 == 0 ? "Odd" : "Even") + "\n");
                } catch (NumberFormatException ex) {
                    // Intentional logical error: displaying an incorrect error message
                    outputArea.append("Invalid input. Please enter a valid number.\n");
                }
            }
        });
    }

    // Intentional logical error: perform a complex operation using a random number
    private int performComplexOperation(int input) {
        // Simulate a complex operation
        return input * 2 + 11;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComplexGuiExample().setVisible(true);
            }
        });
    }
}
