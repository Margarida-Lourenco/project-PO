package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;

/**
 * Command for searching cells that contain even numbers.
 */
class DoShowEvenNumbers extends Command<Spreadsheet> {

    DoShowEvenNumbers(Spreadsheet receiver) {
        super(Label.SEARCH_EVEN_NUMBER, receiver);
    }

    @Override
    protected final void execute() {
        _display.popup(_receiver.printArrayListOfStrings(_receiver.getCellsEvenContent()));
    }

}