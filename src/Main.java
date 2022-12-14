import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.io.Serial;

public class Main extends JFrame {

        @Serial
        private static final long serialVersionUID = 1L;
        private JSlider sliderR;
        private JSlider sliderG;
        private JSlider sliderB;

    private JLabel lbl;

        private void initializeUI() {
            sliderR = new JSlider(0, 100, 100);
            sliderR.setMinorTickSpacing(1);
            sliderR.setMajorTickSpacing(1);
            sliderR.setPaintTicks(true);

            sliderG = new JSlider(0, 100, 100);
            sliderG.setMinorTickSpacing(1);
            sliderG.setMajorTickSpacing(1);
            sliderG.setPaintTicks(true);

            sliderB = new JSlider(0, 100, 100);
            sliderB.setMinorTickSpacing(1);
            sliderB.setMajorTickSpacing(1);
            sliderB.setPaintTicks(true);

            JButton saveButton = new JButton("Save");

            sliderR.addChangeListener((ChangeEvent event) -> {

                int r = sliderR.getValue();
                int g = sliderG.getValue();
                int b = sliderB.getValue();
                lbl.setIcon(new ImageIcon(ManipulateImage.customTone(GetImage.image("sample.bmp"), r, g, b)));
            });
            sliderG.addChangeListener((ChangeEvent event) -> {

                int r = sliderR.getValue();
                int g = sliderG.getValue();
                int b = sliderB.getValue();
                lbl.setIcon(new ImageIcon(ManipulateImage.customTone(GetImage.image("sample.bmp"), r, g, b)));
            });
            sliderB.addChangeListener((ChangeEvent event) -> {

                int r = sliderR.getValue();
                int g = sliderG.getValue();
                int b = sliderB.getValue();
                lbl.setIcon(new ImageIcon(ManipulateImage.customTone(GetImage.image("sample.bmp"), r, g, b)));
            });
            saveButton.addActionListener((Action) -> {
                int r = sliderR.getValue();
                int g = sliderG.getValue();
                int b = sliderB.getValue();
                SaveImage.writeBMP(ManipulateImage.customTone(GetImage.image("sample.bmp"), r, g, b), "img" + r + g + b + ".bmp");
            });
            lbl = new JLabel(new ImageIcon(GetImage.image("sample.bmp")));

            createLayout(sliderR, sliderG, sliderB, saveButton, lbl);

            setSize(1600, 900);
            setTitle("Photoshop Wish Edition");
            setIconImage(GetImage.image("icon.png"));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }

        private void createLayout(JComponent...arg) {

            JPanel pane = (JPanel) getContentPane();
            GroupLayout gl = new GroupLayout(pane);
            pane.setLayout(gl);

            gl.setAutoCreateContainerGaps(true);
            gl.setAutoCreateGaps(true);

            gl.setHorizontalGroup(gl.createParallelGroup()
                    .addComponent(arg[0])
                    .addComponent(arg[1])
                    .addComponent(arg[2])
                    .addComponent(arg[3])
                    .addComponent(arg[4])
            );

            gl.setVerticalGroup(gl.createSequentialGroup()
                    .addComponent(arg[0])
                    .addComponent(arg[1])
                    .addComponent(arg[2])
                    .addComponent(arg[3])
                    .addComponent(arg[4])
            );

            pack();
        }

        public static void main(String[] args) {

            EventQueue.invokeLater(() -> {
                Main main = new Main();
                main.initializeUI();
                main.setVisible(true);
                main.setExtendedState(main.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            });
        }
    }