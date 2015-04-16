/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.simonesalvo.moikka.servlet;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import it.simonesalvo.moikka.entity.Post;
import it.simonesalvo.moikka.entity.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Simone
 */
public class SendPost extends HttpServlet {
    
	private Objectify ofy = ObjectifyService.ofy();
        
       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ObjectifyService.register(Post.class);
        ObjectifyService.register(User.class);

        
        Post post = new Post();
        post.setMsg("prova msg");
        
        ofy.save().entity(post);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
