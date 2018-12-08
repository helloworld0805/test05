package com.xuecheng.api.cms;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {

    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
        @ApiImplicitParam(name="page",value = "当前页",required = true,dataType = "int",paramType = "path"),
        @ApiImplicitParam(name = "size",value = "每页条数",required = true,dataType = "int",paramType = "path")

    })
    String findList(int page,int size);
}
