package ch.nunca.nonie.backend;

public class Artefacts {
    private Integer id;
    private String name;
    private String size;

    public Artefacts(Integer id, String name, String size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
