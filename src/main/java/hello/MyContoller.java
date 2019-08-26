package hello;

import hello.dao.TmpEntityDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {
    private static final Logger log = LoggerFactory.getLogger(MyContoller.class);

    @Autowired
    private TmpEntityDao tmpEntityDao;

    @GetMapping("/user")
    public String goToUsr(Model model){

        model.addAttribute("list", tmpEntityDao.findAll());
        return "jsp/userFiles/table";
    }
}
