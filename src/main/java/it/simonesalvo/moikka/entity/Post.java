/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.simonesalvo.moikka.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 *
 * @author Simone Salvo
 * www.simonesalvo.it
 * simone.salvo@ymail.com
 * 393 54 82 782
 */
@Entity
public class Post{
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Index
    private String msg;
    @Index
    private String objMsg;
    @Index
    private Long usrID;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.simonesalvo.moikka.entity.post[ id=" + id + " ]";
    }

    /**
     * @return the usrID
     */
    public Long getUsrID() {
        return usrID;
    }

    /**
     * @param usrID the usrID to set
     */
    public void setUsrID(Long usrID) {
        this.usrID = usrID;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the objMsg
     */
    public String getObjMsg() {
        return objMsg;
    }

    /**
     * @param objMsg the objMsg to set
     */
    public void setObjMsg(String objMsg) {
        this.objMsg = objMsg;
    }
    
}
