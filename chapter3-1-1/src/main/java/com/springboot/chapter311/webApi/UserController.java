package com.springboot.chapter311.webApi;

import com.springboot.chapter311.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>(users.values());
        return userList;
    }

    /**除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数**/
    @RequestMapping(value = "/setUser", method = RequestMethod.POST)
    public String setUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/updateUserInfo/{id}",method = RequestMethod.PUT)
    public String updateUserInfo(@PathVariable Long id,@ModelAttribute User userInfo){
        User u = users.get(id);
        u.setName(userInfo.getName());
        u.setAge(userInfo.getAge());
        users.put(id, u);
    return "success";
    }

    @RequestMapping(value = "/getUserInfoById/{id}", method = RequestMethod.GET)
    public User getUserInfoById(@PathVariable Long id) {
        return users.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
