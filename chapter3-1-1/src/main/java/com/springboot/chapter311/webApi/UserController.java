package com.springboot.chapter311.webApi;

import com.springboot.chapter311.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private Map<Long, User> userMap = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>(userMap.values());
        return userList;
    }

    /**
     * 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/setUserInfo", method = RequestMethod.POST)
    public String setUser(@ModelAttribute User user) {
        System.out.println("-------------");
        userMap.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/getUser/{11111111L}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userMap.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@ModelAttribute Long id) {
        userMap.remove(id);
        return "success";
    }
}
