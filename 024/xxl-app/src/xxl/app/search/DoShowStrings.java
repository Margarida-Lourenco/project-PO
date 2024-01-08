package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;

/**
 * Command for searching cells that contain strings.
 */
class DoShowStrings extends Command<Spreadsheet> {

    DoShowStrings(Spreadsheet receiver) {
        super(Label.SEARCH_STRING, receiver);
    }

    @Override
    protected final void execute() {
        _display.popup(_receiver.printArrayListOfStrings(_receiver.getCellStrings()));
    }

}