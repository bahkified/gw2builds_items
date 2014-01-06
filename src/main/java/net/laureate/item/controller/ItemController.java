package net.laureate.item.controller;

import net.laureate.item.data.ItemIdListType;
import net.laureate.item.data.ItemType;
import net.laureate.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ItemController {

    private static final int PAGE_SIZE = 20;

    @Autowired
    private ItemService itemService;

    @RequestMapping("detail")
    public String getItemById(@RequestParam(value="id", required=true) long id, Model model) {

        ItemType item = itemService.getItemById(id);
        model.addAttribute("item", item);

        model.addAttribute("string", item.toString());

        return "detail";
    }

    @RequestMapping("all")
    public String getAllItemIds(HttpServletRequest request, Model model,
            @RequestParam(value="p", required=false, defaultValue="0") int page) {

        ItemIdListType ids = itemService.getAllItemIds();

        if (page < 0) {
            page = 0;
        }

        // TODO: actually implement paging
        int[] items_in_page = new int[PAGE_SIZE];
        for(int i = 0; i < PAGE_SIZE; i++) {

            items_in_page[i] = ids.getItems()[i + (page * PAGE_SIZE)];

        }

        model.addAttribute("items", items_in_page);
        model.addAttribute("current_page", page);

        model.addAttribute("details_prefix",
                request.getSession().getServletContext().getContextPath() + "/item/detail");
        model.addAttribute("page_prefix",
                request.getSession().getServletContext().getContextPath() + "/item/all");

        return "allIds";
    }

    @RequestMapping("test")
    public String doTest() {
        return("test");
    }

}
