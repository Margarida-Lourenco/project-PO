package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;

/**
 * Command for searching cells that contain even numbers.
 */
class DoShowReferences extends Command<Spreadsheet> {

    DoShowReferences(Spreadsheet receiver) {
        super(Label.SEARCH_REFERENCE, receiver);
    }

    @Override
    protected final void execute() {
        _display.popup(_receiver.printArrayListOfStrings(_receiver.getCellReferences()));
    }

}