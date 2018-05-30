package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.UserMgmt;

/**
 * Application Lifecycle Listener implementation class UserMgmtContextListener
 *
 */
@WebListener
public class UserMgmtContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public UserMgmtContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent contextEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent contextEvent)  { 
         // TODO Auto-generated method stub
    	ServletContext context = contextEvent.getServletContext();
    	UserMgmt um = new UserMgmt();
    	context.setAttribute("users", um);
    }
	
}
