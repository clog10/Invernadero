
package Modelo;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 */
public class DBTabla {
    
    public JTable tabla;
    public DefaultTableModel tableModel;

    public DBTabla(String[] colname) {

        Object[][] data = {};

        tableModel = new DefaultTableModel(data, colname) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return !(this.getColumnClass(column).equals(java.lang.String.class));
            }
        };

        tabla = new JTable(tableModel);

    }
    
}






