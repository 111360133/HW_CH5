import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // 創建一個 Frame
        Frame frame = new Frame("AWT 範例");

        // 設定視窗大小與佈局
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // 創建 Label
        Label label = new Label("歡迎使用 AWT GUI 範例");
        frame.add(label);

        // 創建 Button
        Button button = new Button("點擊我");
        frame.add(button);

        // 創建 TextField
        TextField textField = new TextField(20);
        frame.add(textField);

        // 設定按鈕的點擊事件
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 按下按鈕後更新 TextField 的內容
                textField.setText("按鈕已被點擊！");
            }
        });

        // 關閉視窗的處理邏輯
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // 顯示視窗
        frame.setVisible(true);
    }
}
