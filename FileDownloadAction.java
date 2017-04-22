package com.jpkc.ssh.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
public class FileDownloadAction extends ActionSupport
{
    public InputStream getDownloadFile()
    {
        return ServletActionContext.getServletContext().getResourceAsStream("upload/通讯录2012年9月4日.xls");
    }
    
    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}