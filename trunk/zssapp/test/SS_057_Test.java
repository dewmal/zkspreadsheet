import org.zkoss.ztl.JQuery;


public class SS_057_Test extends SSAbstractTestCase {

    @Override
    protected void executeTest() {
        // Select source cell
        JQuery cell_J_13 = getSpecifiedCell(9, 12);
        clickCell(cell_J_13);
        clickCell(cell_J_13);
        
        // Ctrl + C
        keyDownNative(CTRL);
        waitResponse();
        keyDownNative(C);
        waitResponse();
        keyUpNative(C);
        waitResponse();
        keyUpNative(CTRL);
        waitResponse();
        
        // Right click target cell
        JQuery cell_L_13 = loadTargetCell();
        clickCell(cell_L_13);

        // Click Paste icon
        mouseOver(jq("$pasteDropdownBtn"));
        clickAt(jq("$pasteDropdownBtn"), "30,2");
        waitResponse();
        
        // Click Paste Special
        click(jq("$pasteSpecial"));
        waitResponse();
        
        // Verify
        verifyTrue(jq("$pasteSpecialDlg").isVisible());
    }
    
    private JQuery loadTargetCell() {
        return getSpecifiedCell(11, 12);
    }

}