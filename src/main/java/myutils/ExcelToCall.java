package myutils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


// 엑셀 만들기
public class ExcelToCall {
    private static final Logger log = LogManager.getLogger(ExcelToCall.class);

    private static final int FIRST_SHEET_INDEX = 0;
    private static final int ROW_ACCESS_WINDOW_SIZE = 1000;

    private static SXSSFWorkbook sxssfWorkbook = null;
    private static Sheet sxssfSheet = null;
    private static Sheet originSheet = null;
    private static int rowNo = 0;

    public static void main(String[] args) {
        ExcelToCall excelToCall = new ExcelToCall();
        try {
            excelToCall.initExcel("/Users/gh.baek/Downloads/new_b2bLink.xlsx");
            excelToCall.addExcels();
//            excelToCall.gajagoToYanolja();
        } catch (IOException e) {
            log.info("익셉션");
            e.printStackTrace();
        } finally {
            excelToCall.write("/Users/gh.baek/Downloads/new_b2bLink_refactoring2.xlsx");
        }

    }


    //url 매칭하고 변경시켜 엑셀로 저장
    public void initExcel(String templateFile) throws IOException {

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(templateFile);

        // 엑셀템플릿파일에 쓰여질 부분 검색
        originSheet = xssfWorkbook.getSheetAt(FIRST_SHEET_INDEX);
        rowNo = originSheet.getLastRowNum();

        // SXSSF 생성
        sxssfWorkbook = new SXSSFWorkbook(xssfWorkbook, ROW_ACCESS_WINDOW_SIZE);
        sxssfSheet = sxssfWorkbook.getSheetAt(FIRST_SHEET_INDEX);
    }


    public void addExcels() throws IOException {
        System.out.println(sxssfSheet.getSheetName());
        int count = 0;
        for (Row row : originSheet) {
            if (count > 3000) {
                throw new IOException();
            }
            final Cell cell = row.getCell(3);
            final Cell cell1 = row.createCell(4);
            if (cell == null) {
                log.info("없음");
                cell1.setCellValue(false);
            } else {
                log.info("cell : {}", cell);
                log.info("있음");
                cell1.setCellValue(true);
            }
            count++;
        }
        ((SXSSFSheet) sxssfSheet).flushRows(sxssfSheet.getLastRowNum());
    }


    public void write(String path) {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            sxssfWorkbook.write(fileOut);
            sxssfWorkbook.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gajagoToYanolja() throws IOException {
        for (Row row : originSheet) {
            final Cell cell = row.getCell(1);
            if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC && cell.getNumericCellValue() != -2) {
                final int numericCellValue = (int) cell.getNumericCellValue();
                String newURL = "https://www.yanolja.com/leisure/" + numericCellValue;
                HttpURLConnection connection = (HttpURLConnection) new URL(newURL).openConnection();
                connection.setRequestMethod("GET");
                //연결
                connection.connect();

                int code = connection.getResponseCode();
                log.info("Response code of the object is {}", code);


                if (!String.valueOf(connection.getURL()).equals("https://www.yanolja.com/404")) {
                    System.out.println("redirect URL : " + connection.getURL());
                    final Cell cell1 = row.createCell(3, 1);
                    cell1.setCellValue(String.valueOf(connection.getURL()));
                    log.info("call : {}", cell1);
                }
            }
        }
        ((SXSSFSheet) sxssfSheet).flushRows(sxssfSheet.getLastRowNum());
    }

    private static void yanoljaUrl() {
        File file = new File("/Users/gh.baek/Downloads/b2bLink.xlsx");
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try {

            System.out.println(workbook.getNumberOfSheets());
            System.out.println("-------------");
            final Sheet sheetAt = workbook.getSheetAt(0);
            //시트 하나라 시트 안봄
            int count = 0;
            for (Row row : sheetAt) {
                count++;
                System.out.println("횟수 : " + count);

                if (row.getRowNum() != 0) {
                    final Cell cell = row.getCell(1);
                    if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC && cell.getNumericCellValue() != -2) {
                        final int numericCellValue = (int) cell.getNumericCellValue();
                        String newURL = "https://www.yanolja.com/leisure/" + numericCellValue;
                        HttpURLConnection connection = (HttpURLConnection) new URL(newURL).openConnection();
                        connection.setRequestMethod("GET");
                        //연결
                        connection.connect();

                        if (!String.valueOf(connection.getURL()).equals("https://www.yanolja.com/404")) {

                            final Cell cell1 = row.createCell(3, 1);
                            cell1.setCellValue(String.valueOf(connection.getURL()));
                        }
                    }
                }
            }


            FileOutputStream fileOut = new FileOutputStream("/Users/gh.baek/Downloads/new_b2bLink.xlsx");
            workbook.write(fileOut);
            fileOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
