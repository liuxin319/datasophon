<!--
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
 -->

<!--
 * @Author: mjzhu
 * @describe: 
 * @Date: 2022-07-07 18:50:56
 * @LastEditTime: 2022-07-07 19:03:57
 * @FilePath: \ddh-ui\src\pages\serviceManage\deleteModal.vue
-->
<template>
  <div>
    <a-form :label-col="labelCol" :wrapper-col="wrapperCol" :form="form" class="p0-32">
      <a-form-item :wrapper-col="{ span: 19, offset: 2 }" style="16px;">
        <div>
          <span>确认删除吗？</span>
        </div>
      </a-form-item>
    </a-form>
    <div class="ant-modal-confirm-btns-new">
      <a-button style="margin-right:10px;" type="primary" @click.stop="handleSubmit">确定</a-button>
      <a-button @click.stop="formCancel">取消</a-button>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      labelCol: {
        xs: { span: 24 },
        sm: { span: 5 },
      },
      wrapperCol: {
        xs: { span: 24 },
        sm: { span: 16 },
      },
      form: this.$form.createForm(this),
    };
  },
  methods: {
    handleSubmit(e) {
      let self = this;
      e.preventDefault();
      self.$emit("onDelExample");
    },
    formCancel() {
      this.$destroyAll();
    },
  },
  mounted() {},
};
</script>
<style lang="less" scoped>
.steps-content {
  margin-top: 16px;
  border: 1px dashed #e9e9e9;
  border-radius: 6px;
  background-color: #fafafa;
  min-height: 200px;
  text-align: center;
  padding-top: 80px;
}

.steps-action {
  margin-top: 24px;
}
</style>
