package sprcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import oracle.net.aso.m;

@Controller
public class EmpController {
    @Autowired
    EmpDao dao;
    @RequestMapping("/empform")
    public String showform(Model m)
    {
    	m.addAttribute("command",new Emp());
    	return "empform";
    }
    
   @RequestMapping(value="save",method=RequestMethod.POST)
    public String saveEmp(@ModelAttribute("emp") Emp e)
    {
    	dao.save(e);
    	return "viewemp"; 
    	
    }
   
   @RequestMapping("/viewemp")
   public String listEmp(Model m)
   {
	   List<Emp> ls = dao.listEmp();
	   m.addAttribute("list",ls);
	   return "viewemp";
   }
}