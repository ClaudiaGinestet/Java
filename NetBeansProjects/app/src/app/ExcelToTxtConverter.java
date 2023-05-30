/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.*;
import jxl.read.biff.BiffException;
/**
 *
 * @author Claudia
 */
public class ExcelToTxtConverter {
    public static void convertExcelToTxt(String excelFilePath, String txtFilePath) {
        try {
            InputStream is = new FileInputStream(excelFilePath);
            Workbook workbook = Workbook.getWorkbook(is);
            Sheet sheet = workbook.getSheet(0);
            FileWriter writer = new FileWriter(txtFilePath);

            for (int i = 0; i < sheet.getRows(); i++) {
                Cell[] row = sheet.getRow(i);
                for (int j = 0; j < sheet.getColumns(); j++) {
                    writer.write(row[j].getContents());
                    writer.write("\t"); // Separador de columnas (tabulador)
                }
                writer.write(System.lineSeparator()); // Nueva línea después de cada fila
            }

            writer.close();
            workbook.close();
            is.close();

            System.out.println("La conversión se completó con éxito.");
        } catch (IOException | IndexOutOfBoundsException | BiffException e) {
        }
    }

    private ExcelToTxtConverter() {
    }
}