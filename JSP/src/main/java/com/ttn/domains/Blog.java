package com.ttn.domains;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @Column(name = "blog_id")
    private int blogId;

    @Column(name = "blog_description")
    private String blogDescription;

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogDescription='" + blogDescription + '\'' +
                '}';
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }
}
