package com.streaming.streamflix.resolvers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.streaming.streamflix.codegen.types.User;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@DgsComponent
public class UserResolver {

    @DgsQuery(field = "user")
    public User getUserById(@Argument String id){
        return User.newBuilder().id(id).name("test").username("sample").wishlistedContent(List.of()).watchedContent(List.of()).build();
    }
}
