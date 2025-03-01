/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.datasophon.api.controller;

import com.datasophon.api.service.ClusterQueueCapacityService;
import com.datasophon.common.utils.Result;
import com.datasophon.dao.entity.ClusterQueueCapacity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cluster/queue/capacity")
public class ClusterQueueCapacityController {

    @Autowired
    private ClusterQueueCapacityService clusterQueueCapacityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(Integer clusterId){

        return clusterQueueCapacityService.listCapacityQueue(clusterId);

    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id){
        ClusterQueueCapacity clusterQueueCapacity = clusterQueueCapacityService.getById(id);

        return Result.success().put("clusterQueueCapacity", clusterQueueCapacity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody ClusterQueueCapacity clusterQueueCapacity){
        clusterQueueCapacityService.save(clusterQueueCapacity);

        return Result.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody ClusterQueueCapacity clusterQueueCapacity){

        clusterQueueCapacityService.updateById(clusterQueueCapacity);
        
        return Result.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete( Integer id){
        clusterQueueCapacityService.removeById(id);

        return Result.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/refreshToYarn")
    public Result refreshToYarn( Integer clusterId) throws Exception {
        return clusterQueueCapacityService.refreshToYarn(clusterId);
    }
}
