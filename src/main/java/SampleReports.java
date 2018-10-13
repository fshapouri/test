
import static net.sf.dynamicreports.report.builder.DynamicReports.*;

import java.math.BigDecimal;

//import net.sf.dynamicreports.report.datasource.DRDataSource;    //(1)
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;

public class SampleReports {

    public SampleReports() {
        build();
    }

    private void build() {
        try {
            report()// create new report design
                    .columns(// add columns
                            // title, field name data type
                            col.column("Item", "item", type.stringType()), col.column("Quantity", "quantity", type.integerType()), col.column("Unit price", "unitprice", type.bigDecimalType())).title(cmp.text("Getting started"))// shows report title
                    .pageFooter(cmp.pageXofY())// shows number of page at page footer
                    .setDataSource(createDataSource())// set datasource
                    .show();// create and show report
        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    private JRDataSource createDataSource() {
//        DRDataSource dataSource = new DRDataSource("item", "quantity", "unitprice");  //(2)
//
//        return dataSource;

        return null;
    }

    public static void main(String[] args) {
        new SampleReports();
    }
}

