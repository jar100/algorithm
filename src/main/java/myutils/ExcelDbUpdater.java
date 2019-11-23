package myutils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcelDbUpdater {



    /**
     * 엑셀에 있는거 쿼리로 말아서 커낵션 풀에 쌓고 한번에 배치 작업을 돌리것
     * */
    public static void main(String[] args) {
        String sql = "UPDATE LEISURE_DB.LQ_ChannelProd SET channelUrl = ? WHERE seq = ? and prodCd = ?;";


        File file = new File("/Users/gh.baek/Downloads/new_b2bLink2.xlsx");

        final HikariConfig config = new HikariConfig();
        config.setJdbcUrl("///");
        config.setUsername("///");
        config.setPassword("////");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        final HikariDataSource dataSource = new HikariDataSource(config);

        try (
                Connection connection1 = dataSource.getConnection();
                PreparedStatement statement = connection1.prepareStatement(sql);
        ) {

            Workbook workbook = new XSSFWorkbook(new FileInputStream(file));
            final Sheet sheetAt = workbook.getSheetAt(0);
            int index = 0;
            for (Row row : sheetAt) {
                if (row.getCell(3) != null) {
                    statement.setString(1, String.valueOf(row.getCell(3)));
                    statement.setInt(2, (int) row.getCell(0).getNumericCellValue());
                    statement.setInt(3, (int) row.getCell(1).getNumericCellValue());
                    statement.addBatch();
                    index++;
                }
                if ((index % 1000) == 0) {
                    System.out.println(index);
                    statement.executeBatch();
                }
            }
            statement.executeBatch();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        dataSource.close();

    }
}