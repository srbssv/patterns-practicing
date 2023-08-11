package observer;

public class NewsReader implements NamedObserver {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public NewsReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(String.format("%s read the following news: %s", name, news));
    }

    @Override
    public String getObserverName() {
        return getName();
    }
}
