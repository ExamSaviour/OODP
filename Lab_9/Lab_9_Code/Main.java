public class Main {
    public static void main(String[] args) {
        DocumentProcessor wordProcessor = new WordProcessor();
        DocumentProcessor pdfProcessor = new PDFProcessor();
        DocumentProcessor excelProcessor = new ExcelProcessor();

        System.out.println("Processing Word Document:");
        wordProcessor.processDocument();

        System.out.println("\nProcessing PDF Document:");
        pdfProcessor.processDocument();

        System.out.println("\nProcessing Excel Document:");
        excelProcessor.processDocument();
    }
}
