package com.git.task.entity;

import com.git.common.annotation.RtmTableColumn;
import com.git.common.annotation.RtmTableName;
import lombok.Data;

@Data
@RtmTableName(value = "t_user",updateKey = "mobile", updateColumns = {"name","email"} )
public class TUser {
    @RtmTableColumn(value = "id")
    private String id;
    @RtmTableColumn(value = "name")
    private String name;
    @RtmTableColumn(value = "email")
    private String email;
    @RtmTableColumn(value = "mobile")
    private String mobile;
    @RtmTableColumn(value = "age")
    private Integer age;
    @RtmTableColumn(value = "time")
    private Long time;
}