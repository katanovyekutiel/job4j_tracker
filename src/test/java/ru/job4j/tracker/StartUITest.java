//package ru.job4j.tracker;
//
//import org.junit.Test;
//import static org.hamcrest.Matchers.is;
//import static org.hamcrest.Matchers.nullValue;
//import static org.junit.Assert.assertThat;
//
//public class StartUITest {
//    @Test
//    public void whenCreateItem() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "Item name", "6"}
//        );
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new CreateAction(out),
//                new ExitAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findAll()[0].getName(), is("Item name"));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Replaced item"));
//        String replacedName = "New item name";
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
//        );
//        UserAction[] actions = {
//                new ReplaceAction(out),
//                new ExitAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Deleted item"));
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0",String.valueOf(item.getId()), "1"}
//        );
//        UserAction[] actions = {
//                new DeleteAction(out),
//                new ExitAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
//
//    @Test
//    public void whenExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0"}
//        );
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new ExitAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                "Menu." + System.lineSeparator() +
//                        "0. Exit" + System.lineSeparator()
//        ));
//    }
//
//    @Test
//    public void whenFindAll() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Find by All"));
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[] {
//                "0", String.valueOf(item.getId()),
//                String.valueOf(item.getName()), "1"
//        });
//        UserAction[] actions = {
//                new FindItemByIdAction(out),
//                new FindItemByNameAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()) && tracker.findByName(item.getName()), is(itemValue()));
//    }
//
//    @Test
//    public void whenFindById() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Find by ID"));
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[] {
//                "0", String.valueOf(item.getId()), "1"
//        });
//        UserAction[] actions = {
//                new FindItemByIdAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(itemValue()));
//    }
//
//    @Test
//    public void whenFindByName() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Find by Name"));
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[] {
//                "0", String.valueOf(item.getName()), "1"
//        });
//        UserAction[] actions = {
//                new FindItemByNameAction(out)
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findByName(item.getName()), is(itemValue()));
//    }
//}