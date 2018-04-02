package designPattern.prototype;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 08:44
 * Description:
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void draw();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
