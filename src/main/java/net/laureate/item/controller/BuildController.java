package net.laureate.item.controller;

import net.laureate.item.data.BuildType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller
public class BuildController {

    @RequestMapping(value="/createBuild", method=RequestMethod.GET)
    public String createNewBuildForm(Model model) {
        BuildType build = new BuildType();

        model.addAttribute("build", build);
        return "createBuild";
    }

    @RequestMapping(value="/createBuild", method=RequestMethod.POST)
    public String createNewBuildSubmit(@ModelAttribute BuildType build, Model model) {

        if (build != null) {
            model.addAttribute("build", build);
        } else {
            model.addAttribute("build", "There is no content to display.");
        }

        return "showBuild";
    }

}
