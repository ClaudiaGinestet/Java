/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.ExcelToTxtConverter.convertExcelToTxt;

/**
 *
 * @author Claudia
 */
public class RfeApp {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\Claudia\\Documents\\SPU\\1742-13";
        String txtFilePath = "C:\\Users\\Claudia\\Documents\\SPU\\1742-13";
        convertExcelToTxt(excelFilePath, txtFilePath);
    }
}