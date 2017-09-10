package com.pingan.ssm.pojo;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;
     
    //用户信息(查询订单时关联查询用户信息(一对一关联)，使用resultMap映射到这个字段里)
    private User user;
    
    //订单明细(查询订单及订单明细（一对多关联）,orders信息映射到Orders的其他属性，每张Orders下的详细商品信息放在 ordersDetails这个list属性中)
    private List<Orderdetail> orderdetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number
				+ ", createtime=" + createtime + ", note=" + note + ", user="
				+ user + ", orderdetails=" + orderdetails + "]";
	}
    
    
}