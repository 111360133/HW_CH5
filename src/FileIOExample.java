import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        // 定義檔案路徑
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // 寫入範例文字到 input.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("這是一個範例文字。");
            writer.newLine();
            writer.write("Java I/O 讀寫檔案測試！");
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
            return;
        }

        // 從 input.txt 讀取內容並寫入到 output.txt
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("檔案已成功處理！檢查 output.txt 檔案。");
        } catch (IOException e) {
            System.err.println("讀寫檔案時發生錯誤: " + e.getMessage());
        }
    }
}
