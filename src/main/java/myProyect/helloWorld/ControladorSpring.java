package myProyect.helloWorld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ControladorSpring extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String mensaje = "Hola mundo desde Spring MVC";
		
		// TODO Auto-generated method stub
		return new ModelAndView("holaMundo","mensaje",mensaje);
	}

}
