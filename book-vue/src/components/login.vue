<template>
  <div id="content">
    <el-card>
      <el-form>
        <el-form-item style="text-align: center;">
          <div style="font-size:20px;position: relative;">
            扶摇图书管理系统
          </div>
        </el-form-item>
        <el-form-item>
          <el-input size="small" v-model="username" placeholder="请输入用户名">
          </el-input>
        </el-form-item>
        <el-form-item>
          <el-input size="small" v-model="password" placeholder="请输入密码" show-password>
          </el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" style="width: 100%;" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script>
export default {
  name: 'login',
  data() {
    return {
      username: "",
      password: ""
    }
  },
  methods: {
    login() {
      const that = this;
      that.$http
        .post('/authority/login', {
          "username": that.username,
          "password": that.password
        })
        .then(function (response) {
          if (response.data.code == 200) {
            localStorage.setItem("user", JSON.stringify(response.data.data));
            that.$router.replace({
              path: '/home'
            });
          }
        })
    }
  },
  created() {
  },
  beforeCreate() {
    document.querySelector('html').setAttribute('style', 'background:url(../../static/images/login2.png);background-size:100% 100%');
  },
  beforeDestroy() {
    document.querySelector('html').removeAttribute('style');
  }
}
</script>

<style>
html,
body {
  margin: 0;
  padding: 0;
  height: 100%;
  width: 100%;
  overflow: hidden;
}

#content {
  width: 300px;
  margin: auto;
  margin-top: 150px;
}
</style>
