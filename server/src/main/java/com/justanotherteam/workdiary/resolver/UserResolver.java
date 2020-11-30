package com.justanotherteam.workdiary.resolver;

import com.justanotherteam.workdiary.model.User;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver {
    public User getUser(String id){
        return new User("User Name", id);
    }
}
