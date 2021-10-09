package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by ID ===");
        int id = input.askInt("Enter ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным ID: " + id + " не найдена.");
        }
        return true;
    }

}
