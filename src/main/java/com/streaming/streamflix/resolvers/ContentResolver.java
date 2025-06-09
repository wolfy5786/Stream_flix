package com.streaming.streamflix.resolvers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.streaming.streamflix.codegen.types.Cast;
import com.streaming.streamflix.codegen.types.Content;

import java.util.List;

@DgsComponent
public class ContentResolver {
    @DgsData(parentType = "Content", field = "cast")
    public List<Cast> getCast(Content content)
    {
        return null;
    }
}
