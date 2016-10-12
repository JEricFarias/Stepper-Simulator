package janelas;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

@SuppressWarnings("serial")
public class TeclasPermitidas extends PlainDocument{
	public void insertSring(int offset, String str, javax.swing.text.AttributeSet attr)	throws BadLocationException{
		super.insertString(offset,str.replaceAll("[^0,1,2,3,4,5,6,7,8,9]",""),attr);
		
	}
	public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
			throws BadLocationException{
				super.insertString(offset, str.replaceAll("[^0,1,2,3,4,5,6,7,8,9]",""),attr);
				
			}
}
