package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_TRIPS;

import seedu.address.model.Model;

/**
 * Lists all trips in the address book to the user.
 */
public class ListTripCommand extends Command {

    public static final String COMMAND_WORD = "listTrip";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Lists all the trips\n"
            + "Parameters: [TAGNAME] (optional)\n"
            + "Examples: "
            + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Listed all trips";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredTripList(PREDICATE_SHOW_ALL_TRIPS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}

