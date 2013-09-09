package de.softwarepunkt.taskmanagement.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.validation.constraints.Size;

import de.softwarepunkt.taskmanagement.data.UserSB;
import de.softwarepunkt.taskmanagement.model.User;

@Named
@SessionScoped
@ManagedBean
public class UserBean implements Serializable{
	
	@Inject
    private UserSB userSB;

    @Size(min=3, max=12,message="Must be between 3 and 12 chars")
    private String name;
    
    private User currentUser;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<String> autocomplete(String prefix) {

        ArrayList<String> result = new ArrayList<String>();
        result.add("England");
        result.add("France");
        result.add("Germany");
        result.add("Italy");
        result.add("Spain");

        return result;
    }

	public User getCurrentUser() {
		if(currentUser == null){
			currentUser = new User();
		}
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	public void update(){		
		getCurrentUser().setName(name);
	}
	
	public void save(){
		update();
		userSB.save(currentUser);
	}
}
