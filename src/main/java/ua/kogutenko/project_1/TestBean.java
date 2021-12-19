package ua.kogutenko.project_1;

/**
 * Test Bean.
 *
 * @author Kogutenko Alex
 */
public class TestBean {

    private String name;

    /**
     * constructor for add arg string name
     * @param name input arg
     */
    public TestBean(String name) {
        this.name = name;
    }

    /**
     * get name
     *
     * @return name return name value
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name set value name
     */
    public void setName(String name) {
        this.name = name;
    }
}
