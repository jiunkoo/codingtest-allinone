import java.util.LinkedList;

class BrowserHistory {

    LinkedList<String> list = new LinkedList<>();
    int location = 0;

    public BrowserHistory(String homepage) {
        list.add(homepage);
    }
    
    public void visit(String url) {
        location += 1;
        list.add(location, url);
        while(location < list.size() - 1) {
            list.removeLast();
        }
    }
    
    public String back(int steps) {
        if (location < steps) {
            location = 0;

            return list.getFirst();
        }
        location -= steps;

        return list.get(location);
    }
    
    public String forward(int steps) {
        if (location + steps >= list.size()) {
            location = list.size() - 1;

            return list.getLast();
        }
        location += steps;

        return list.get(location);
    }
}
