import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SliderExample extends JFrame {

        private static final long serialVersionUID = 1L;
        public BufferedImage img = GetImage.image("sample.bmp");
        private JSlider sliderR;
        public int prevR = 1;
        private JSlider sliderG;
        public int prevG = 0;
        private JSlider sliderB;
        public int prevB = 0;
        private JSlider sliderA;
        public int prevA = 0;
        private JLabel lbl;

        private void initializeUI() {
            sliderR = new JSlider(0, 100, 100);
            sliderR.setMinorTickSpacing(1);
            sliderR.setMajorTickSpacing(1);
            sliderR.setPaintTicks(true);

            sliderR.addChangeListener((ChangeEvent event) -> {

                int value = sliderR.getValue();
                lbl.setIcon(new ImageIcon(ManipulateImage.changeRed(GetImage.image("sample.bmp"), (float) prevR, (float) value)));
                prevR = sliderR.getValue();
            });

            lbl = new JLabel(new ImageIcon(GetImage.image("sample.bmp")));

            createLayout(sliderR, lbl);

            setSize(300, 150);
            setTitle("JSlider");
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
            );

            gl.setVerticalGroup(gl.createSequentialGroup()
                    .addComponent(arg[0])
                    .addComponent(arg[1])
            );

            pack();
        }

        public static void main(String[] args) {

            EventQueue.invokeLater(() -> {

                SliderExample sliderExample = new SliderExample();
                sliderExample.initializeUI();
                sliderExample.setVisible(true);
            });
        }
    }