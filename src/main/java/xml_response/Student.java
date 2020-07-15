package xml_response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {

    private Long id;
    private String name;
    private String sureName;

    public Student() {}

    public Student(Long id, String name, String sureName) {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
    }

    public Long getId() {
        return id;
    }

    @XmlElement
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    @XmlElement
    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
