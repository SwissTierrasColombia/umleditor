package ch.ehi.umleditor.application;

import javax.swing.table.*;

public class EditorTableMetaAttribute {
	private DefaultTableModel ivjDtmMetaAttributes = null;
	int contAdd=0;
	
	public EditorTableMetaAttribute() {
		if (ivjDtmMetaAttributes == null) {
			ivjDtmMetaAttributes = new DefaultTableModel();
			}
		}
	public DefaultTableModel getTableModel() {
		return ivjDtmMetaAttributes;
		}
//	public ClassDefDialog setTblMetaAttribute(Object ivjTblMetaAttributes) {
//		ivjTblMetaAttributes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//	        public void valueChanged(ListSelectionEvent event) {
//	            // do some actions here, for example
//	            // print first column value from selected row
//	            System.out.println(ivjTblMetaAttributes.getValueAt(ivjTblMetaAttributes.getSelectedRow(), 0).toString());
//	        }
//	    });	
//		return null;
//	}
	public void addCol (Object object, Object object2) {
		ivjDtmMetaAttributes.addColumn(object);
		ivjDtmMetaAttributes.addColumn(object2);
	}
	public void addRow (String Name, String Value) {
		Name= Name+(contAdd);
		Value= Value;
		ivjDtmMetaAttributes.addRow(new Object[]{Name,Value});
//		objMetaAttribute.add(Name, Value);
		contAdd++;
	}
	public void updateRow (String Name, String Value) {
		ivjDtmMetaAttributes.addRow(new Object[]{Name,Value});
//		objMetaAttribute.add(Name, Value);
	}
	public void removeRow (int row) {
//		System.out.println("remove row: "+row);
		ivjDtmMetaAttributes.removeRow(row);
	}
}
