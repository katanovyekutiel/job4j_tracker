package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
            System.out.println("Select: ");
        }

    }

    private void showMenu(UserAction[] actions) {
        String[] menu = {
                "Add new Item", "Show all items", "Replace item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int index = 0; index < menu.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindItemByIdAction(),
                new FindItemByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}