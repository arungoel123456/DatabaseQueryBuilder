package com.demo;

public class QueryBuilder {
    private Query query;

    public QueryBuilder(){
        query = new Query();
    }

    public QueryBuilder select(String select){
        query.setSelect(select);
        return this;
    }

    public QueryBuilder from(String from){
        query.setFrom(from);
        return this;
    }

    public QueryBuilder where(String where){
        query.setWhere(where);
        return this;
    }

    public QueryBuilder orderBy(String orderBy){
        query.setOrderBy(orderBy);
        return this;
    }

    public Query build(){
        return query;
    }
}
