package com.yang.framework.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.Serializable;

public class BaseTag extends TagSupport implements Serializable{
    private static final long serialVersionUID = 1L;
    protected String type = "default";

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int doEndTag() throws JspException {
        return super.doEndTag();
    }

    @Override
    public int doStartTag() throws JspException {
        return super.doStartTag();
    }
    
}
