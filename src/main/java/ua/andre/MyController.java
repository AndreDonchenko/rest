package ua.andre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.andre.dao.EmployeeRepository;
import ua.andre.dao.PositionRepository;
import ua.andre.entities.EmployeeEntity;
import ua.andre.entities.PositionEntity;


@Controller
public class MyController {

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/hello")
    public String hello() {
        //System.out.println("Mapping worked");
        return "hello";
    }

    @RequestMapping("/position")
    @ResponseBody
    public Iterable<PositionEntity> position () {
        return positionRepository.findAll();
    }

    @RequestMapping("/position/{positionName}")
    @ResponseBody
    public PositionEntity positionById (@PathVariable String positionName) {
        return positionRepository.findOne(positionName);
    }

    @RequestMapping("/employee")
    @ResponseBody
    public Iterable<EmployeeEntity> employee () {
        return employeeRepository.findAll();
    }

    @RequestMapping("/employee/{id}")
    @ResponseBody
    public EmployeeEntity employeeById (@PathVariable Integer id) {
        return employeeRepository.findOne(id);
    }

}
