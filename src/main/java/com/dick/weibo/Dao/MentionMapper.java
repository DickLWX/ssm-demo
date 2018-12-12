package com.dick.weibo.Dao;

import com.dick.weibo.po.Mention;
import com.dick.weibo.po.MentionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MentionMapper {
    int countByExample(MentionExample example);

    int deleteByExample(MentionExample example);

    int deleteByPrimaryKey(Integer mentionId);

    int insert(Mention record);

    int insertSelective(Mention record);

    List<Mention> selectByExample(MentionExample example);

    Mention selectByPrimaryKey(Integer mentionId);

    int updateByExampleSelective(@Param("record") Mention record, @Param("example") MentionExample example);

    int updateByExample(@Param("record") Mention record, @Param("example") MentionExample example);

    int updateByPrimaryKeySelective(Mention record);

    int updateByPrimaryKey(Mention record);
}